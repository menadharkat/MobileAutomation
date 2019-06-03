package packageEbayTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import packageEbay.EbayHome;

public class EbayHomeTest extends MobileAPI2 {

    EbayHome ebayhome;

    @BeforeMethod
    public void init(){
        ebayhome = PageFactory.initElements(appiumDriver, EbayHome.class);
    }
    @Test(priority = 1)
    public void setHamburgerTest(){
        ebayhome.setHamburger();
    }
    @Test(priority = 2)
    public void setEbaysigntest(){
        ebayhome.setEbaysign();
    }
    @Test(priority = 3)
    public void setCartebayTest(){
        ebayhome.setCartebay();
    }
    @Test(priority = 4)
    public void setSearchfieldTest(){
        ebayhome.setSearchfield();
    }
    @Test(priority = 5)
    public void setCameraTest(){
        ebayhome.setCamera();
    }
    @Test(priority = 6)
    public void setSellingTest(){
        ebayhome.setSelling();
    }
    @Test(priority = 7)
    public void setDealsTest(){
        ebayhome.setDeals();
    }
    @Test(priority = 8)
    public void setCategoriesTest(){
        ebayhome.setCategories();
    }
    @Test(priority = 9)
    public void setSavedTest(){
        ebayhome.setSaved();
    }
    @Test(priority = 10)
    public void setRegisterTest(){
        ebayhome.setRegister();
    }
    @Test(priority = 11)
    public void setSigninTest(){
        ebayhome.setSignin();
    }
    @Test(priority = 12)
    public void setBrightdayTest(){
        ebayhome.setBrightday();
    }
    @Test(priority = 13)
    public void setShipfreeTest(){
        ebayhome.setShipfree();
    }
    @Test(priority = 14)
    public void setSunyourselfTest(){
        ebayhome.setSunyourself();
    }
    @Test(priority = 15)
    public void setDailydealsTest(){
        ebayhome.setDeals();
    }
    @Test(priority = 16)
    public void setSeeallTest(){
        ebayhome.setSeeall();
    }
}
