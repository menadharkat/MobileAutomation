package regressionEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHome extends MobileAPI2 {

    //Get Started
    @FindBy(xpath = "//android.widget.Button[@text='get started']")
    WebElement getstarted;
    @FindBy(xpath = "//android.widget.Button[@text='Create account']")
    WebElement createaccount;
    @FindBy(xpath = "//android.widget.EditText[@index='1']")
    WebElement user;
    @FindBy(id = "firstname")
    WebElement userfirstname;
    @FindBy(id = "lastname")
    WebElement userlastname;
    @FindBy(id = "phone")
    WebElement userphone;
    @FindBy(id = "password")
    WebElement userpassword;
    @FindBy(xpath = "//android.widget.Button[@text='Create account']")
    WebElement createaccountButton;

    //Guest account
    @FindBy(xpath = "//android.widget.Button[@text='CONTINUE AS GUEST']")
    WebElement Guest;
    @FindBy(xpath = "//android.widget.Button[@text='Show nearby stores']")
    WebElement nearstore;
    @FindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    WebElement allow;

    @FindBy(xpath = "//\tandroid.widget.EditText[@text='enter city or zip code']")
    WebElement zip;



    public void setGetstarted(){
        getstarted.click();
    }
    public void setCreateaccount(){
        createaccount.click();
    }
    public void setUser(String email){
        user.sendKeys(email);
    }
    public void setFirstname(String first){
        userfirstname.sendKeys(first);
    }
    public void setLastname(String last){
       userlastname.sendKeys(last);
    }
    public void setUserphone(String number){
        userphone.sendKeys(number);
    }
    public void setUserpassword(String pass){
        userpassword.sendKeys(pass);
    }
    public void setCreateaccountButton(){
        createaccountButton.click();
    }

    public void setGuest(){
        Guest.click();
    }
    public void setNearstore(){
        nearstore.click();
    }
    public void setAllow(){
        allow.click();
    }
    public void setStorelocator(String zipcode){
        zip.click();
        zip.sendKeys(zipcode);
    }
}

