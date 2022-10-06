package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("search the link")
    public void searchTheLink() {
        System.out.println("Hello");
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
