package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RewaaPageObjects;
import testBase.TestBase;

import java.util.List;

public class RewaaStepDefinitions extends TestBase {

    RewaaPageObjects rewa = new RewaaPageObjects(driver);


    @Given("^I am on the Login page URL \"([^\"]*)\"$")
    public void launchAddress(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^I should see \"([^\"]*)\" on Page$")
    public void assertLoginPage(String logoName) throws Throwable {
        rewa.assertLogoNameOnLayout(logoName);
        Thread.sleep(3000);
    }

    @When("^I click on items list inside feature$")
    public void performClickOnItemsListInsideFeature() throws InterruptedException {
        rewa.clicksOnListIcon();
    }

    @Then("^I (softly see|softly do not see) \"([^\"]*)\" is displayed in dropdown under lists$")
    public void assertOptionIsDisplayedInDropdownAtDashboard(String usage, String dropdownOptions) {
        rewa.assertOptionsInListDropdown(usage, dropdownOptions);
    }

    @Then("^I print all movie list on console$")
    public void printMoviesListOfLandingPage() {
        rewa.consoleMovieDisplayName();
    }

    @And("^I click on \"([^\"]*)\" inside item list feature$")
    public void performClickOnInsideItemListFeature(String option) throws InterruptedException {
        rewa.clicksOnOptionInsideItemList(option);
    }

    @And("^I refresh the page$")
    public void refreshPage() {
        rewa.performPageRefresh();
    }

    @And("^I perform search for \"([^\"]*)\"$")
    public void performSearch(String searchContent) throws InterruptedException {
        rewa.performMoviesSearch(searchContent);
        Thread.sleep(3000);
    }

    @And("^I see following continents :$")
    public void assertExpectedContinentsInsideTable(List<String> continents) {
        rewa.assertPresentContinents(continents);
    }

    @And("^I see following countries :$")
    public void assertExpectedCountriesInsideTable(List<String> countries) {
        rewa.assertPresentCountries(countries);
    }

    @Then("^I see expected movie \"([^\"]*)\"$")
    public void iSeeExpectedMovie(String movieName) {
        rewa.assertSearchedResults(movieName);
    }

    @And("^I click on movie name \"([^\"]*)\"$")
    public void performClickOnMovieName(String movieName) throws InterruptedException {
        rewa.clicksOnMovieNameLink(movieName);
        Thread.sleep(3000);
    }

    @And("^I click on crud option \"([^\"]*)\"$")
    public void performClickOnCrudOption(String iconName) {
        rewa.performClicksOnCrudIcons(iconName);
    }

    @And("^I enter \"([^\"]*)\" into Name field$")
    public void enterValueIntoNameField(String movieName) {
        rewa.enterNameOfMovie(movieName);
    }

    @And("^I enter \"([^\"]*)\" into file name field$")
    public void enterValueIntoFileNameField(String fileName) {
        rewa.enterFileName(fileName);
    }

    @And("^I enter \"([^\"]*)\" into wikipedia field$")
    public void enterValueIntoWikiPediaField(String wikiFileName) {
        rewa.enterWikipediaField(wikiFileName);
    }

    @And("^I enter \"([^\"]*)\" into release date field$")
    public void enterValueIntoReleaseDateField(String date) {
        rewa.enterReleaseDateField(date);
    }

    @Then("^I see movie id get generated$")
    public void assertMovieIdGetGenerated() throws InterruptedException {
        Thread.sleep(5000);
        rewa.assertGeneratedMovieId();
    }
}