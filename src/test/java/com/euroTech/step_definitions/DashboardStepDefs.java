package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardStepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    @And("The user should be able to see {string} on the dashboard")
    public void theUserShouldBeAbleToSeeOnTheDashboard(String expectedUsername) {
        String actualUsername = dashboardPage.userName.getText();
        Assert.assertEquals(expectedUsername,actualUsername);
    }

    @And("The username should habe {int} characters")
    public void theUsernameShouldHabeCharacters(Integer expectedNumberofChar) {
        String actualUsername = dashboardPage.userName.getText();
        Integer eactualNumberofChar = actualUsername.length();
        Assert.assertEquals(expectedNumberofChar, eactualNumberofChar);
    }
    @When("The user navigates to tab {string} and module {string}")
    public void theUserNavigatesToTabAndModule(String tab, String module) {
        dashboardPage.navigateTabsAndModules(tab,module);
    }
    @Then("The user verifies success login with {string} using excel : {string}, {string}, {int}")
    public void the_user_verifies_success_login_with_using_excel(String username, String path, String sheetName, Integer row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        String actual = dashboardPage.userName.getText();
        String expected = excelData.get(row).get(username);

        Assert.assertEquals(expected,actual);
    }
}
