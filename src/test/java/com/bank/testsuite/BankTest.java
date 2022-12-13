package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    AccountPage accountPage ;
    BankManagerLoginPage bankManagerLoginPage ;
    CustomerLoginPage customerLoginPage;
    CustomerPage customerPage ;
    OpenAccountPage openAccountPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        accountPage = new AccountPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customerPage = new CustomerPage();
        openAccountPage = new OpenAccountPage();


    }



    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.userClickOnBankManger();
        bankManagerLoginPage.userShouldClickOnAddCustomerButton();
        customerPage.userEnterFirstName("Hermoine Granger");
        customerPage.userEnterLastName("Potter");
        customerPage.userEnterPostCode("E725JB");
        customerPage.userClickOnAddCustomerAfterFillInFOrm();
        customerPage.getTextFromPopUp();
        String ExpectedMessage = "Customer added successfully with customer id :6";
        Assert.assertEquals(customerPage.getTextFromAlert(), ExpectedMessage, "No Message Displayed");
        customerPage.acceptAlert();
    }

    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerLoginPage.userClickOnBankManger();
        openAccountPage.userShouldClickOnOpenAccountPage();
        openAccountPage.clickAndSelectCustomerName();
        openAccountPage.clickAndSelectCurrencyType();
        openAccountPage.userClickOnProcessButton();
        customerPage.getTextFromPopUp();
        String ExpectedMessage = "Account created successfully with account Number :1016";
        Assert.assertEquals(customerPage.getTextFromAlert(), ExpectedMessage, "No Message Displayed");
        customerPage.acceptAlert();

    }


    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException{
        customerLoginPage.userClickOnLoginTab();
        openAccountPage.clickAndSelectCustomerName();
        customerLoginPage.userClickOnLoginButton();
        String expectedMessage = "Logout";
        Assert.assertEquals(customerLoginPage.verifyLogoutMessage(),expectedMessage,"NO Message Displayed");
        Thread.sleep(1000);
        customerLoginPage.userClickOnLogOutButton();
        String expectedText = "Your Name :";
        Assert.assertEquals(customerLoginPage.verifyYourNameTextinCustomerLogInPage(),expectedText,"No Message Displayed");



    }
    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException{
        customerLoginPage.userClickOnLoginTab();
        openAccountPage.clickAndSelectCustomerName();
        customerLoginPage.userClickOnLoginButton();
        accountPage.userClickOnDeposit();
        accountPage.userClickOnAmountToBeDepositedAndAdded100();
        accountPage.userClickOnDepositButton();
        Thread.sleep(1000);
        String expectedText = "Deposit Successful";
        Assert.assertEquals(accountPage.userVerifyDepositSuccessFull(),expectedText,"no message displayed");


    }
    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException{
        customerLoginPage.userClickOnLoginTab();
        openAccountPage.clickAndSelectCustomerName();
        customerLoginPage.userClickOnLoginButton();
         Thread.sleep(1000);
        accountPage.userClickOnWithDrawl();
        Thread.sleep(3000);
        // accountPage.selectPoundSign();
        accountPage.userClickOnAmountToBeWithDrawn50();
        accountPage.userClickOnWithdrawButton();
        String ExpectedMessage = "Transaction successful";
        Assert.assertEquals(accountPage.verifyTransactionMessage(),ExpectedMessage,"No messageDisplayed");



    }



}









