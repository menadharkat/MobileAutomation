package packageEbayTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import packageEbay.EbayRegister;
import packageEbay.EbaySignIn;

public class EbayAccountTest extends MobileAPI2 {

    EbaySignIn ebaysignin;
    EbayRegister ebayregister;

    @BeforeMethod
    public void init(){
        ebaysignin = PageFactory.initElements(appiumDriver, EbaySignIn.class);
        ebayregister= PageFactory.initElements(appiumDriver,EbayRegister.class);
    }

    @Test(enabled = false)
    public void setEmailorusernameTest(){
        ebaysignin.setSignin();
        ebaysignin.setEmailorusername();
    }

    @Test
    public void setRegisterTest1(){
        ebayregister.setRegister("Cocacola","Jeff@Selenium.com","Djafar","1234567890");
    }
    @Test
    public void setRegisterTest2(){
        ebayregister.setRegister("Ebay","Jeff@Ebay.com","Ebay1234","1234567890");
    }

}
