package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MyStepdefs {
    WebDriver driver=Hooks.driver;
    List<WebElement> elements=new ArrayList<>();
    List<String> uniqueLink=null;
    @Given("search the link")
    public void searchTheLink() {
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Vivo"+ Keys.ENTER);
    }

    @When("collect all text")
    public void collectAllText() {
        elements= driver.findElements(By.xpath("//a"));
        Consumer<WebElement> consumer=(el)-> System.out.println(el.getText());
        elements.forEach(consumer);
    }

    @Then("remove the duplicate text")
    public void removeTheDuplicateText() {

    }

    @And("show the all unique contents")
    public void showTheAllUniqueContents() {
    }
}
