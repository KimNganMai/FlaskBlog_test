package FlaskBlog.test;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class SD_resetpw {
//    @Given("^The login page is showed$")
//    public void the_login_page_is_showed() {
//    }

    @Given("^The Reset password page is showed$")
    public void the_reset_password_page_is_showed() {
    }

    @When("^The user click tdo the forgot password button$")
    public void click_to_the_forgot_password_button() {
    }

    @When("^The User click send request$")
    public void the_user_click_send_request(){
    }

    @When("^The user attempt to reset their account password with Email (.+) that is invalid$")
    public void the_user_reset_password_with_email_invalid(String email){
    }

    @When("^The user attempt to reset their account password with Email \"([^\"]*)\"$")
    public void the_user_reset_their_password_with_email(String strArg1) {
    }

    @Then("^Reset password page will be showed$")
    public void reset_password_page_will_be_showed() {
    }

    @Then("^The error message \"([^\"]*)\" is showed$")
    public void the_message_is_showed(String strArg1) {
    }

    @Then("^The new password will be updated then sent to this mail box$")
    public void the_new_password_will_be_updated_then_sent_to_this_mail_box() {
    }

}

