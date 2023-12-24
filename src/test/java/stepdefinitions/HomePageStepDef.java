package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductPage;

public class HomePageStepDef {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    @Given("as a user I am on home page")
    public void as_a_user_i_am_on_home_page() {
        homePage.onHomePage();
    }
    @When("I select the option for buying item as {string}")
    public void i_select_the_option_for_buying_item_as(String option) {
        homePage.selectOptions(option);
    }
    @Then("I navigate to {string} page")
    public void i_navigate_to_page(String product) {
        productPage.productPage(product);
    }
    @When("I select the item options {string}")
    public void i_select_the_item_options(String item) {
        productPage.selectItem(item);
    }
    @Then("I navigate to the {string} page")
    public void i_navigate_to_the_page(String product) {
        productPage.onItemPage(product);
    }
    @When("I select the price as {string}")
    public void i_select_the_price_as(String price) {
        productPage.selectPrice(price);
    }
    @Then("I can view the correct product number")
    public void i_can_view_the_correct_product_number() {
        productPage.numberOfProducts();
    }
}
