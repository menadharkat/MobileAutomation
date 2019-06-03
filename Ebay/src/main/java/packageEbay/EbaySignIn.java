package packageEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class EbaySignIn extends MobileAPI2 {

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    WebElement signin;
    @FindBy(xpath = "//android.widget.Button[@text='USE EMAIL OR USERNAME']")
    WebElement emailorusername;


    public void setSignin(){
        signin.click();
    }
    public void setEmailorusername(){
        emailorusername.click();
    }


}
