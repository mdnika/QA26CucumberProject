package com.ilcarro.stepDefinitions;

import static com.ilcarro.pages.BasePage.driver;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {

  @And("User clicks on log in link")
  public void clickOnLoginLink() {
    new HomePage(driver).clickOnLoginLink();
  }

  @And("User enters valid data")
  public void enterValidData() {
    new LoginPage(driver).enterData("adam@gm.com","Adam12345678$");
  }

  @And("User clicks on Yalla button")
  public void clickOnYallaButton(){
    new LoginPage(driver).clickOnYallaButton();
  }

  @Then("User verifies log in message")
    public void verifyLoginMessage() {
    new LoginPage(driver).isLoginMessageDisplayed();
  }

  @And("User enters valid email and wrong password")
  public void enterValidEmailWrongPassword(DataTable dataTable) {
    new LoginPage(driver).enterWrongPassword(dataTable);
  }

  @Then("User verifies error message")
  public void verifyErrorMessage(){
    new LoginPage(driver).getError();
  }
}
