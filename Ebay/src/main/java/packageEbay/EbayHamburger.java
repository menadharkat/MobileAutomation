package packageEbay;

import base.MobileAPI2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EbayHamburger extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.ImageButton[@index='0']")
    WebElement hamburger;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Messages']")
    WebElement messages;
    @FindBy(id = "com.ebay.mobile:id/button_google")
    WebElement register;


    public void setHamburger(){
        hamburger.click();
    }
    public void setHelp(){
        messages.click();
    }
    public void setGuest(){
        register.click();
    }
    public void setHamburger2() {
        hamburger.click();
        appiumDriver.scrollTo("help");
    }
}
