package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver=Hooks.driver;
    @Given("search the link")
    public void searchTheLink() {
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Vivo"+ Keys.ENTER);
    }

    @When("collect all text")
    public void collectAllText() {
        System.out.println("Hello");
    }

    @Then("remove the duplicate text")
    public void removeTheDuplicateText() {
        System.out.println("Hello");
    }

    @And("show the all unique contents")
    public void showTheAllUniqueContents() {
    }
}
