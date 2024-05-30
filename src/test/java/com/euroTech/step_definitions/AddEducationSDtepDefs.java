package com.euroTech.step_definitions;

import com.euroTech.pages.AddEducationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AddEducationSDtepDefs {

AddEducationPage addEducationPage = new AddEducationPage();




    @Then("The user verifies that the Add Education tab is displayed")
    public void theUserVerifiesThatTheAddEducationTabIsDisplayed() {
        addEducationPage.schoolLabel.isDisplayed();
    }

    @And("The user should be able see form labels as follows")
    public void theUserShouldBeAbleSeeFormLabelsAsFollows(List<String> expectedLabels) {

        List<String> actualTextAddEducation = addEducationPage.getElementsTextAddEducation(addEducationPage.formLabel);
        Assert.assertEquals(expectedLabels,actualTextAddEducation);
    }
}
