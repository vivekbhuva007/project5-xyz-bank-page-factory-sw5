package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickOnBankMangerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement clickOnAddCustomer ;


    public void userClickOnBankManger() {
        clickOnElement(clickOnBankMangerLogin);
    }


    public void userShouldClickOnAddCustomerButton() {
        clickOnElement(clickOnAddCustomer);
    }

}
