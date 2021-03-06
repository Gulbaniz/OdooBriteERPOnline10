package com.odoo.pages;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BasePage {

    public  LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "login")

   public WebElement usernameInput;

    @FindBy(id = "password")

    public  WebElement passwordInput;


    public void login(String username, String password){

        usernameInput.sendKeys(username);

        passwordInput.sendKeys(password,Keys.ENTER);
    }

}






