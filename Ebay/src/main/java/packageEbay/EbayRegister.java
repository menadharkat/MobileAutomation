package packageEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EbayRegister extends MobileAPI2 {

    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement register;
    @FindBy(id = "com.ebay.mobile:id/button_business")
    WebElement businesaccount;
    @FindBy(id = "businessname")
    WebElement name;
    @FindBy(id = "businessemail")
    WebElement email;
    @FindBy(id = "rbusinessemail")
    WebElement re_email;
    @FindBy(id = "PASSWORD_BIZREG")
    WebElement password;
    @FindBy(id = "dial-code-labelphoneFlagComp1Businessdescription")
    WebElement phone;
    @FindBy(id = "sbtBtnBusiness")
    WebElement submit;

    public void setRegister(String People, String Email, String Pass, String Number){
        register.click();
        businesaccount.click();
        name.sendKeys(People);
        email.sendKeys(Email);
        re_email.sendKeys(Email);
        password.sendKeys(Pass);
        phone.click();
        phone.sendKeys(Number);
        submit.click();

    }
}
