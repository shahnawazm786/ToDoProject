package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Consumer;

public class MyStepdefs {
    WebDriver driver=Hooks.driver;
    List<WebElement> elements=null;
    @Given("search the link")
    public void searchTheLink() {
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Vivo"+ Keys.ENTER);
    }

    @When("collect all text")
    public void collectAllText() {
        elements= driver.findElements(By.tagName("a"));
        Consumer<WebElement> consumer=(el)-> System.out.println(el);
        elements.forEach(consumer);
    }

    @Then("remove the duplicate text")
    public void removeTheDuplicateText() {
        System.out.println("Hello");
    }

    @And("show the all unique contents")
    public void showTheAllUniqueContents() {
    }
}
