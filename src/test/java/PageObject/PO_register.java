package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PO_register {
    WebDriver driver;

    @FindBy (css = "input#username")
    public WebElement txUserName;
    @FindBy (css = "input#email")
    public WebElement txEmail;
    @FindBy (css = "input#password")
    public WebElement txPassWord;
    @FindBy (css = "input#confirm_password")
    public WebElement txCfPass;
    @FindBy (css = "input#submit")
    public WebElement btSignUp;
    @FindBy (css = "div.pt-3 a.ml-2")
    public WebElement btSigntIn;
    @FindBy (xpath = "/html/body/main/div/div[1]/div[1]/form/fieldset/div[1]/div/span")
    public WebElement msUsername;
    @FindBy (xpath = "/html/body/main/div/div[1]/div[1]/form/fieldset/div[2]/div/span")
    public WebElement msEmail;
    @FindBy (xpath = "/html/body/main/div/div[1]/div[1]/form/fieldset/div[4]/div/span")
    public WebElement msCfPass;
//    @FindBy (css = "")
//    public WebElement ;
//    @FindBy (css = "")
//    public WebElement ;
//    @FindBy (css = "")
//    public WebElement ;

    public PO_register(WebDriver driver) {
        this.driver = driver;
    }

    public void Open_registerPage(){
        this.driver.get("http://127.0.0.1:5000/register");
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(this.driver, this);
    }
}
