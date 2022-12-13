package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomerLoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickOnLoginTab;



    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickOnYourName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']/child::*")
    WebElement selectYourNameFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement verifyLogoutText ;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement clickOnLogOutButton;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement verifyYourNameText;


  //  By clickOnLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    public void userClickOnLoginTab(){
        clickOnElement(clickOnLoginTab);

    }
   // By clickOnYourName = By.xpath("//select[@id='userSelect']");
    public void userClickOnYourName(){
        clickOnElement(clickOnYourName);
    }


    public void setSelectYourNameFromDropDown(WebElement element, String str){
        selectByValueFromDropDown(selectYourNameFromDropDown,str);
    }

   // By clickOnLoginButton = By.xpath("//button[contains(text(),'Login')]");
    public void userClickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

 //   By verifyLogoutText = By.xpath("//button[@class='btn logout']");
    public String verifyLogoutMessage(){
        return getTextFromElement(verifyLogoutText);
    }
   // By clickOnLogOutButton = By.xpath("//button[@class='btn logout']");
    public void userClickOnLogOutButton(){
        clickOnElement(clickOnLogOutButton);
    }

  //  By verifyYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameTextinCustomerLogInPage(){
        return getTextFromElement(verifyYourNameText);
    }

}



