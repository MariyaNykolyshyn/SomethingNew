package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;


public class HomePage_StepDef {


    @Given("^the user is on the home page$")
    public void the_user_is_on_the_home_page()  {
        System.out.println("Open the page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("^the user enters a search term$")
    public void the_user_enters_a_search_term() {
         System.out.println("Enter search term:something");
        HomePage homepage = new HomePage();
        homepage.search.sendKeys("t shirt");
    }

    @Then("^the search box should contain the search term$")
    public void the_search_box_should_contain_the_search_term()  {
        System.out.println("Verifying search term");
        HomePage homePage = new HomePage();
        String actual = homePage.search.getAttribute("value");
        assertEquals("t shirt", actual);

    }

}
