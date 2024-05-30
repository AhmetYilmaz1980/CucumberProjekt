package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AddEducationPage extends BasePage{
    @FindBy(xpath = "//label[@for='school']")
    public WebElement schoolLabel;

    @FindBy(xpath = "//div[@id='education-add']//label[not(@for='current')]")
    public List<WebElement> formLabel;

    @FindBy(xpath = "//div[@id='education-add']//label")
    public List<WebElement> formLabelsWithEmptyLabel;

    public  List<String> getElementsTextAddEducation(List<WebElement> list){
        List<String> elemText = new ArrayList<>();
        list.forEach(el->elemText.add(el.getText()));
        return elemText;
    }

}
