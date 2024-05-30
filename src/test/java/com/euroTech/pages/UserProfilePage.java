package com.euroTech.pages;

import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage{

    @FindBy (xpath = "//li[@class='breadcrumb-item'][2]")
    public WebElement userProfilePageName;

    @FindBy (css ="[role='alert']")
    public WebElement profileSavedMessage;

    public void navigateUserProfileTabs(String tabName){
        Driver.get().findElement(By.xpath("//li//button[text()='"+tabName+"']")).click();
    }
}
