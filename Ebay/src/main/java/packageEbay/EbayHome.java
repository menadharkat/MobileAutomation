package packageEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHome extends MobileAPI2 {


    @FindBy(id = "com.ebay.mobile:id/home")
    WebElement hamburger;
    @FindBy(xpath = "//android.widget.ImageView[@index='1']")
    WebElement ebaysign;
    @FindBy(id = "com.ebay.mobile:id/action_view_icon")
    WebElement cartebay;
    @FindBy(xpath = "//android.widget.TextView[@text='Search for anything']")
    WebElement searchfield;
    @FindBy(id = "com.ebay.mobile:id/search_image_btn")
    WebElement camera;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Selling button']")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@text='Bright Days, Brighter Deals']")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]")
    WebElement categories;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]")
    WebElement saved;
    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement register;
    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    WebElement signin;
    @FindBy(id = "com.ebay.mobile:id/home_banner_heading")
    WebElement brightday;
    @FindBy(id = "com.ebay.mobile:id/home_banner_sub_heading")
    WebElement shipfree;
    @FindBy(id = "home_banner_call_to_action")
    WebElement sunyourself;
    @FindBy(id = "com.ebay.mobile:id/container_title")
    WebElement dailydeals;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"See All Deals\"]")
    WebElement seeall;


    public void setHamburger(){
        hamburger.click();
    }
    public void setEbaysign(){
        ebaysign.click();
    }
    public void setCartebay(){
        cartebay.click();
    }
    public void setSearchfield(){
        searchfield.click();
        searchfield.sendKeys();
    }
    public void setCamera(){
        camera.click();
    }
    public void setSelling(){
        selling.click();
    }
    public void setDeals(){
        deals.click();
    }
    public void setCategories(){
        categories.click();
    }
    public void setSaved(){
        saved.click();
    }
    public void setRegister(){
        register.click();
    }
    public void setSignin(){
        signin.click();
    }
    public void setBrightday(){
        brightday.click();
    }
    public void setShipfree(){
        shipfree.click();
    }
    public void setSunyourself(){
        sunyourself.click();
    }
    public void setDailydeals(){
        dailydeals.click();
    }
    public void setSeeall(){
        seeall.click();
    }
    }
