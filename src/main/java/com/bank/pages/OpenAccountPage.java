package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='border box padT20 ng-scope']/descendant::button[2]")
    WebElement openAccountPage;
    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement clickOnSelectCustomerName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectYourNameFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement clickOnCurrencyButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerNameLookUp;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyTypeLookUp;


    public void userShouldClickOnOpenAccountPage(){
        clickOnElement(openAccountPage);
    }
    public void userShouldClickOnCustomerName(){
        clickOnElement(clickOnSelectCustomerName);
    }

    public void setSelectYourNameFromDropDown(){
        selectByValueFromDropDown(selectYourNameFromDropDown,"Hermoine Granger");

    }

    public void userClickOnProcessButton(){
        clickOnElement(clickOnProcessButton);
    }

    public void userClickOnCurrencyButton(){
        clickOnElement(clickOnCurrencyButton);
    }

    public void clickAndSelectCustomerName() {
        selectByVisibleTextFromDropDown(customerNameLookUp, "Hermoine Granger");
    }
    public void clickAndSelectCurrencyType() {
        selectByVisibleTextFromDropDown(currencyTypeLookUp, "Pound");
    }
}





