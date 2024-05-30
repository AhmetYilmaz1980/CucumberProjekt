package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
}
