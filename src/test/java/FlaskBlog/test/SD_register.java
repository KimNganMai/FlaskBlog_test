package FlaskBlog.test;

import PageObject.PO_loginpage;
import PageObject.PO_register;
import io.cucumber.java.en.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class SD_register {
    WebDriver driver;
    PO_loginpage loginPage;
    PO_register registerPage;

    @Before
    public void initTest()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdrive/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.registerPage = new PO_register(this.driver);
    }

    @Given("^The Register page is showed$")
    public void the_register_page_is_showed() {
        this.registerPage.Open_registerPage();
    }

    @When("^The user attempt to register with Username (.+) Email (.+) Password (.+) Confirm Password (.+)$")
    public void the_user_register_with_username_email_password_cfpass(String username, String email, String password, String cfpass) {
        this.registerPage.txUserName.sendKeys(username);
        this.registerPage.txEmail.sendKeys(email);
        this.registerPage.txPassWord.sendKeys(password);
        this.registerPage.txCfPass.sendKeys(cfpass);
        this.registerPage.btSignUp.click();
    }

    @When("^The user attempt to register with Username \"([^\"]*)\" Email \"([^\"]*)\" Password \"([^\"]*)\" Confirm Password \"([^\"]*)\"$")
    public void the_user_register_with_username_email_password_cfpass2(String username, String email, String password, String cfpass) {
        this.registerPage.txUserName.sendKeys(username);
        this.registerPage.txEmail.sendKeys(email);
        this.registerPage.txPassWord.sendKeys(password);
        this.registerPage.txCfPass.sendKeys(cfpass);
        this.registerPage.btSignUp.click();
    }

    @Then("^The message \"([^\"]*)\" will be showed$")
    public void the_message_something_will_be_showed(String strArg1) {
    }

    @Then("^The message \"([^\"]*)\" will be showed below Username field$")
    public void the_message_will_be_showed_below_username_field(String list1) {
    }


    @Then("^The message \"([^\"]*)\" will be showed below email field$")
    public void the_message_will_be_showed_below_email_field(String strArg1)
    {
    }

    @Then("^The message \"([^\"]*)\" will be showed below Confirm password field$")
    public void the_message_will_be_showed_below_confirm_password_field(String strArg1) {

    }

    @Then("^The login page will be showed$")
    public void the_login_page_will_be_showed() {
    }

    @And("^The message register successful will be showed$")
    public void the_message_register_successful_will_be_showed() {

    }

}
