package com.euroTech.pages;

import com.euroTech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage{

//    public LoginPage() {
//        PageFactory.initElements(Driver.get(), this);
//    }

    @FindBy(id= "email")
    public WebElement emailBox;
    //WebElement emailBox = Driver.get().findElement(By.id("email"));

    @FindBy(id = "yourPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    //AND logic ile çalışır. yani her iki şartın da doğru olması gerekir.
    @FindBys({
            @FindBy(id = "email"),
            @FindBy(xpath = "//input[@name='email']")
    })
    public WebElement emailBoxWithFindBys;

    //OR logic ile çalışır. yani her iki şarttann sadece biri doğru olsa yeterlidir.
    @FindAll({
            @FindBy(css = "#yourPassword"),
            @FindBy(tagName = "ihsan")
    })
    public WebElement passwordBoxWithFindAll;

    @FindBy(css = "[role='alert']")
    public WebElement wrongEmailMessage;

    @FindBy(xpath = "//div[contains(text(),'Email address is incorrect.')]")
    public WebElement wrongUserEmailWarningMessage;


    public void login(String email, String password) {
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }

    public void login() {
        emailBox.sendKeys(ConfigurationReader.get("email"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }

    public String getWrongEmailMessageText(){
        return wrongEmailMessage.getText();
    }

}
