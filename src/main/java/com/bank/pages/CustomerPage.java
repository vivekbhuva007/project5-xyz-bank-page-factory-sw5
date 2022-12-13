package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnAddCustomer;


   // By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    public void userEnterFirstName(String firstName){
        sendTextToElement(enterFirstName,firstName);
    }

    public void userEnterLastName(String lastName){
        sendTextToElement(enterLastName,lastName);
    }
    public void userEnterPostCode(String postcode){
        sendTextToElement(enterPostCode,postcode);
    }
    public void userClickOnAddCustomerAfterFillInFOrm()
    {
        clickOnElement(clickOnAddCustomer);
    }


    public String getTextFromPopUp() {
        //  Alert text = driver.switchTo().alert();  // Getting the text from alert
        // String alert = text.getText();
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }
    public void alertPopup(){
        driver.switchTo().alert().accept();
    }





}

