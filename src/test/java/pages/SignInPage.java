package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="email_create")
    public WebElement signUpEmail;
    @FindBy(id = "email")
    public WebElement logInEmail;
    @FindBy(id= "password")
    public WebElement password;
    @FindBy(id= "submitLogin")
    public WebElement submitLogin;

}
