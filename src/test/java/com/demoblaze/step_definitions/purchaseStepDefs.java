package com.demoblaze.step_definitions;

import com.demoblaze.pages.AddidasPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class purchaseStepDefs {

    AddidasPage addidasPage = new AddidasPage();
    int expectedPurchaseAmount = 0;

    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User adds {string} from {string}")
    public void user_adds_from(String product, String category) {
        expectedPurchaseAmount += addidasPage.productAdder(category, product);
        System.out.println("expectedPurchaseAmount = " + expectedPurchaseAmount);

    }


    @And("User remove {string}")
    public void userRemove(String product) {
        expectedPurchaseAmount -= addidasPage.productRemover(product);
        System.out.println("expectedPurchaseAmount = " + expectedPurchaseAmount);
    }
}
