package cv.library.uk;


import cv.library.uk.propertyreader.PropertyReader;
import cv.library.uk.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before

    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
