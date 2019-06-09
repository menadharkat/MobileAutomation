package packageEbayTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import packageEbay.EbayHamburger;

public class EbayHamburgerTest extends EbayHamburger {

    EbayHamburger ebayHamburger;
    @BeforeMethod
    public void init(){
        ebayHamburger = PageFactory.initElements(appiumDriver, EbayHamburger.class);
    }

    //@Test
    public void setHamburgerTest(){
        ebayHamburger.setHamburger();
        ebayHamburger.setHelp();
        ebayHamburger.setGuest();
    }
    @Test
    public void setHamburger2Test(){
        ebayHamburger.setHamburger2();

    }

}
