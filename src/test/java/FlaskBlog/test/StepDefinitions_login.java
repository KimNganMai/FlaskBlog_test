package FlaskBlog.test;

import PageObject.PO_loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StepDefinitions_login {
    WebDriver driver;
    PO_loginpage loginPage;

    @Before
    public void initTest()
    {
        System.out.println("STAGE 1");
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrive\\chromedriver.exe");
        System.out.println("abc");
        this.driver = new ChromeDriver();
        System.out.println(this.driver);
        this.driver.manage().window().maximize();

        this.loginPage = new PO_loginpage(this.driver);
    }

    @Given("^The login page is showed$")
    public void the_login_page_is_showed() {
        this.loginPage.Open_loginpage();
//        System.out.println("STAGE 2");
//        this.driver.get("http://127.0.0.1:5000/login");
//        System.out.println(this.driver);
//        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        PageFactory.initElements(this.driver, this);
    }

    @When("^The User attempt to login with username is \"([^\"]*)\" and password is none$")
    public void the_user_attempt_to_login_with_username_and_password_is_none(String email) {
        System.out.println("xyz");
        System.out.println(this.loginPage.txEmail);

        this.loginPage.txEmail.sendKeys(email);
        this.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        this.loginPage.btLogin.click();
    }

    @When("^The User attempt to login with username is none and password is \"([^\"]*)\"$")
    public void the_user_attempt_to_login_with_username_is_none_and_password(String password) {
        this.loginPage.txPassWord.sendKeys(password);
        this.loginPage.btLogin.click();
    }

    @When("^The User attempt to login with username is (.+) and password is (.+)$")
    public void the_user_fill_username_and_password(String email, String password) {
        this.loginPage.txEmail.sendKeys(email);
        this.loginPage.txPassWord.sendKeys(password);
        this.loginPage.btLogin.click();
    }

    @When("^The User login success with username is \"([^\"]*)\" and password is \"([^\"]*)\"$")
    public void the_user_fill_username_and_password2(String email, String password) {
        this.loginPage.txEmail.sendKeys(email);
        this.loginPage.txPassWord.sendKeys(password);
        this.loginPage.btLogin.click();
    }

    @Then("^The message \"([^\"]*)\" is showed below password field$")
    public void the_message_something_is_showed_below_password_field(String message) {
        String expected = this.loginPage.msErrorPassword.getText();
        Assert.assertEquals(message,expected);
    }

    @Then("^The message \"([^\"]*)\" is showed below email field$")
    public void the_message_is_showed_below_email_field(String message){
        String expected = this.loginPage.msErrorEmail.getText();
        Assert.assertEquals(message,expected);
    }

    @Then("^The unsuccess message \"([^\"]*)\" is showed in the top of page$")
    public void the_message_is_showed_in_the_top_of_page(String message) {
        String expected = this.loginPage.msUnsuccessLogin.getText();
        Assert.assertEquals(message,expected);
    }

    @Then("^The home page is showed$")
    public void the_home_page_is_showed() {
        String actualUrl = "http://127.0.0.1:5000/home";
        String expectedUrl= this.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }

//    @After
//    public void AfterTest()
//    {
//        this.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        this.driver.quit();
//    }

}
