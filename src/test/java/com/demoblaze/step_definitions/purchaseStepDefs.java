package com.demoblaze.step_definitions;

import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;

public class purchaseStepDefs {
    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("url");
    }
}
