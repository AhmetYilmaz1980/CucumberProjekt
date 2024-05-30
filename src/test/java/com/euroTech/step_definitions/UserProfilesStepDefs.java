package com.euroTech.step_definitions;

import com.euroTech.pages.UserProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfilesStepDefs {
    UserProfilePage userProfilePage = new UserProfilePage();
    @Then("The user verifies that the page title {string}")
    public void theUserVerifiesThatThePageTitle(String expected) {
        String actual = userProfilePage.userProfilePageName.getText();
        Assert.assertEquals(expected,actual);
    }

    @When("The user navigates user profile tabs {string}")
    public void theUserNavigatesUserProfileTabs(String tab) {
        userProfilePage.navigateUserProfileTabs(tab);
    }
}
