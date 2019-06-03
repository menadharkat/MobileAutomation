package packageEbay;

import base.MobileAPI2;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EbayHamburger extends MobileAPI2 {

    public void setHamburger(){
        appiumDriver.findElement(By.id("com.ebay.mobile:id/home")).click();
        Select select = new Select(appiumDriver.findElement(By.id("com.ebay.mobile:id/home")));
        //select.selectByValue("Messages");
        select.selectByIndex(1);

    }
}
