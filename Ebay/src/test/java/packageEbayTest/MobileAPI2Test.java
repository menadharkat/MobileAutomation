package packageEbayTest;

import base.MobileAPI2;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MobileAPI2Test extends MobileAPI2 {


    @Test(enabled = false)
    public void scrollTest(){
        clickByXpath("//android.widget.ImageButton[@index='0']");
        //appiumDriver.scrollTo("help");
        scrollByName("help");
    }

    @Test(enabled = false)
    public void scrollAndClickByNameTest(){
        clickByXpath("//android.widget.ImageButton[@index='0']");
        scrollAndClickByName("help");
        //scrollAndClickByName("//android.widget.CheckedTextView[@text='Help']");
    }
    @Test(enabled = false)
    public void scrollToElementTest(){
        scrollToElement(appiumDriver,"//android.widget.ImageButton[@index='0']");
    }
    @Test(enabled = false)
    public void typeByXpathTest(){
        typeByXpath("//android.widget.TextView[@text='Search for anything']","books");
    }
    @FindBy(xpath = "//android.widget.ImageView[@index='1']")
    MobileElement ebaysign;
    @Test(enabled = false)
    public void clickByXpathWebElementTest(){
        clickByXpathWebElement(ebaysign);
    }
    @Test
    public void clickByXpathTest(){
        clickByXpath(ebaysign);
    }

}
