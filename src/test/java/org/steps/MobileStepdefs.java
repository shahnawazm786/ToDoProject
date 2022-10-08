package org.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.page.MobilePageObject;

public class MobileStepdefs {
    MobilePageObject mobilePageObject=new MobilePageObject(Hooks.driver);
    @Given("user see the mobile link")
    public void user_see_the_mobile_link(){
    mobilePageObject.veifyMobileLink();
    }
    @When("user click on mobile link")
    public void user_click_on_mobile_link(){
    mobilePageObject.clickOnMobileLink();
    }
    @Then("user verify the category title")
    public void user_verify_the_category_title(){
    mobilePageObject.verifyCatoryText();
    }
    @When("user click on mobile accessories click")
    public void user_click_on_mobile_accessories_click(){

    }
    @Then("user verify explore by category")
    public void user_verify_explore_by_category(){
        
    }

}
