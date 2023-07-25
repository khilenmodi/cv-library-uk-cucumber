package cv.library.uk.pages;

import cv.library.uk.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[text() ='Accept All']")
    WebElement acceptAlert;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOption;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement miles;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobType;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement clickFindJobButton;
    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;


  public void setAcceptAlert() {
        dismissAlert();
    }
    public void acceptCookies(){
        driver.switchTo().frame(acceptIFrame);
        clickOnElement(acceptCookies);
    }

    public void setJobTitle(String keyword) {
        sendTextToElement(jobTitle, keyword);
    }

    public void setLocation(String keyword) {
        sendTextToElement(location, keyword);
//        clickOnElement(location);
//        Actions actions= new Actions(driver);
//        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
    }

    public void setMoreSearchOption() {
        clickOnElement(moreSearchOption);
    }

    public void setMiles(String distance) {
        selectByVisibleTextFromDropDown(miles, distance);
    }

    public void setSalaryMin(String salary) {
        sendTextToElement(salaryMin, salary);
    }

    public void setSalaryMax(String salary1) {
        sendTextToElement(salaryMax, salary1);
    }

    public void setSalaryType(String text) {
        selectByVisibleTextFromDropDown(salaryType, text);

    }

    public void setJobType(String text) {
        selectByVisibleTextFromDropDown(jobType, text);
    }

    public void setClickFindJobButton() {
        clickOnElement(clickFindJobButton);
    }


}
