package pageObjects;

import helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;

import java.util.List;
import java.util.stream.Collectors;

public class RewaaPageObjects extends TestBase {
    WaitHelper waitHelper;
    SoftAssert sa = new SoftAssert();

    public RewaaPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    public void assertLogoNameOnLayout(String logoName) {
        Assert.assertTrue(isLogoDisplayedOnLayout(logoName));
    }

    private boolean isLogoDisplayedOnLayout(String logoName) {
        boolean flag = false;
        By getSection = By.xpath("//span[text()='" + logoName + "']");
        if (driver.findElement(getSection).isDisplayed()) {
            return true;
        }
        return flag;
    }

    /**
     * Perform clicks on parallel line menu icon
     */
    public void clicksOnListIcon() throws InterruptedException {
        driver.findElement(By.xpath("//div//i[@class='fas fa-list mr-2']")).click();
        Thread.sleep(3000);
    }

    /**
     * It will perform click operation on options inside Items List
     *
     * @param option
     */
    public void clicksOnOptionInsideItemList(String option) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("//li[@class='list-group-item text-primary']/a[contains(@href,'/')][text()='" + option + "']"));
        ele.click();
        Thread.sleep(3000);

    }

    /**
     * It will perform click operation on movies link
     *
     * @param movieName
     */
    public void clicksOnMovieNameLink(String movieName) {
        WebElement ele = driver.findElement(By.xpath("//b[contains(text(),'" + movieName + "')]"));
        ele.click();
    }

    /**
     * generic method for performing click operation on CRUD options
     *
     * @paran iconName
     */
    public void performClicksOnCrudIcons(String iconName) {
        WebElement crudIcon = driver.findElement(By.xpath("//button[contains(@class,'btn')]/i[contains(@class,'" + iconName + "')]"));
        crudIcon.click();
    }

    /**
     * Assert parallel menu bar list options getting displayed or not
     */
    public void assertOptionsInListDropdown(String usage, String dropdownOptions) {
        if (usage.equalsIgnoreCase("see")) {
            Assert.assertTrue(IsExpectedOptionDisplayedInDropdown(dropdownOptions));
        } else if (usage.equalsIgnoreCase("do not see")) {
            sa.assertTrue(IsExpectedOptionDisplayedInDropdown(dropdownOptions));
        }
    }

    /**
     * It will print all movie names on first page over console
     */
    public void consoleMovieDisplayName() {
        By namesOfMoviesLocator = By.xpath("//div[@class='card-movie-text']//b");
        List<WebElement> namesOfAllProducts = driver.findElements(namesOfMoviesLocator);
        for (int i = 0; i < namesOfAllProducts.size(); i++) {
            System.out.println("Movies list with name " + namesOfAllProducts.get(i).getText());
        }
    }

    /**
     * Assert list of continents
     *
     * @param continents
     */

    public void assertPresentContinents(List<String> continents) {
        Assert.assertTrue(isExpectedContinentsPresentInsideTable(continents));
    }

    /**
     * Assert list of countries
     *
     * @param countries
     */
    public void assertPresentCountries(List<String> countries) {
        Assert.assertTrue(isExpectedCountriesPresentInsideTable(countries));
    }

    /**
     * Assert the generated id after creating new movie in list
     */
    public void assertGeneratedMovieId() {
        Assert.assertTrue(isGeneratedIdDisplayed());
    }

    /**
     * It will perform page refresh
     */
    public void performPageRefresh() {
        driver.navigate().refresh();
    }

    /**
     * It will perform search
     */
    public void performMoviesSearch(String searchContent) {
        WebElement textSearchBox = driver.findElement(By.xpath("//form//input[@name='searchField' and @type='text']"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search' and @type='submit']"));
        textSearchBox.clear();
        textSearchBox.sendKeys(searchContent);
        searchButton.click();
    }

    /**
     * Assert the result which is get searched
     *
     * @param movieName
     */
    public void assertSearchedResults(String movieName) {
        Assert.assertTrue(assertMovieName(movieName));
    }

    private boolean assertMovieName(String movieName) {
        WebElement elementForWait = driver.findElement(By.xpath("//span[text()='1 Movies']"));
        waitHelper.WaitForElement(elementForWait, 20);
        boolean flag = false;
        if (driver.findElement(By.xpath("//b[contains(text(),'" + movieName + "')]")).isDisplayed()) {
            return true;
        }
        return flag;
    }

    /**
     * It will enter value into Name field
     *
     * @paran movieName
     */
    public void enterNameOfMovie(String movieName) {
        WebElement nameTextField = driver.findElement(By.xpath("//input[@id='name' and @type='text']"));
        nameTextField.sendKeys(movieName);
    }

    /**
     * It will enter value into File Name field
     *
     * @paran fileName
     */
    public void enterFileName(String fileName) {
        WebElement fileNameTextField = driver.findElement(By.xpath("//input[@id='fileName' and @type='text']"));
        fileNameTextField.sendKeys(fileName);
    }

    /**
     * It will enter value into Wikipedia text field
     *
     * @paran wikiFileName
     */
    public void enterWikipediaField(String wikiFileName) {
        WebElement wikipediaFileName = driver.findElement(By.xpath("//input[@id='wikipediaLink' and @type='text']"));
        wikipediaFileName.sendKeys(wikiFileName);
    }

    /**
     * It will enter value into Release date text field
     *
     * @paran date
     */
    public void enterReleaseDateField(String date) {
        WebElement dateField = driver.findElement(By.xpath("//input[@id='releaseDate' and @type='text']"));
        dateField.sendKeys(date);
    }

    private boolean isGeneratedIdDisplayed() {
        WebElement placeholderElement = driver.findElement(By.xpath("//input[@formcontrolname='id' and @type='text']"));
        String idBox = placeholderElement.getAttribute("value");
        boolean flag = false;
        if (!idBox.isEmpty()) {
            flag = true;
        }
        return flag;
    }

    private boolean IsExpectedOptionDisplayedInDropdown(String dropdownOptions) {
        boolean flag = false;
        try {
            if (driver.findElement(By.xpath("//li/a[text()=' " + dropdownOptions + " ']")).isDisplayed()) {
                flag = true;
            }
        } catch (Exception e) {
        }
        return flag;
    }

    private boolean isExpectedContinentsPresentInsideTable(List<String> continents) {
        WebElement elementForWait = driver.findElement(By.xpath("//span[text()='4 Continents']"));
        waitHelper.WaitForElement(elementForWait, 20);

        By nameList = By.xpath("//td[@class='text-primary font-weight-bold text-center']/div");
        List<String> wee = driver.findElements(nameList).stream().map(WebElement::getText).collect(Collectors.toList());
        if (wee.containsAll(continents)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isExpectedCountriesPresentInsideTable(List<String> countries) {
        WebElement elementForWait = driver.findElement(By.xpath("//span[text()='249 Countries']"));
        waitHelper.WaitForElement(elementForWait, 20);

        By nameList = By.xpath("//td[@class='text-primary font-weight-bold text-center']/div");
        List<String> wee = driver.findElements(nameList).stream().map(WebElement::getText).collect(Collectors.toList());
        if (wee.containsAll(countries)) {
            return true;
        } else {
            return false;
        }
    }
}

