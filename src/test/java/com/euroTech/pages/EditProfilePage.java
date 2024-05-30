package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage{

    @FindBy(id = "about")
    public WebElement aboutBox;

    @FindBy(xpath = "(//input[@id='company'])[1]")
    public WebElement companyBox;

    @FindBy (css = "select#job")
    public WebElement jobDropDownMenu;

    @FindBy(css = "#website")
    public WebElement websiteBox;

    @FindBy(xpath = "(//input[@id='location'])[1]")
    public WebElement locationBox;

    @FindBy(id = "skills")
    public WebElement skillsBox;

    @FindBy (xpath = "//button[text()='Save Changes']")
    public WebElement saveChangesButton;


    public void selectJob(String jobName){
        Select select = new Select(jobDropDownMenu);
        select.selectByVisibleText(jobName);
    }
}
