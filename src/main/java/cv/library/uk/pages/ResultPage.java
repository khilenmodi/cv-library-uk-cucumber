package cv.library.uk.pages;

import cv.library.uk.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public String getMessage(){
        return getTextFromElement(resultText);
    }

}
