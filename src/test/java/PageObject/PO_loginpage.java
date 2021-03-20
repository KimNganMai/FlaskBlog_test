package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PO_loginpage {
    WebDriver driver;

    @FindBy(css="div.form-group input[id=email]")
//    @FindBy(xpath = "/html/body/main/div/div/div[1]/form/fieldset/div[1]/input")
    public WebElement txEmail;
    @FindBy(css="div.form-group input[id=password]")
    public WebElement txPassWord;
    @FindBy(xpath = "/html/body/main/div/div/div[1]/form/fieldset/div[1]/div/span")
    public WebElement msErrorEmail;
    @FindBy(xpath = "/html/body/main/div/div/div[1]/form/fieldset/div[2]/div/span")
    public WebElement msErrorPassword;
    @FindBy(css="div.alert-danger")
    public WebElement msUnsuccessLogin;
    @FindBy(css="div.form-group input[id=submit]")
    public WebElement btLogin;
    @FindBy(css="div.form-group small.ml-2")
    public WebElement btForgotpw;
    @FindBy(css="div.pt-3 a.ml-2")
    public WebElement btSignUp;


    public PO_loginpage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void Open_loginpage()
    {
        System.out.println("State 2");
        this.driver.get("http://127.0.0.1:5000/login");
        System.out.println(this.driver);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(this.driver, this);
    }
}
