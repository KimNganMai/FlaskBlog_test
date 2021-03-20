package FlaskBlog.test;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class SD_account {
    @Given("^The Account page is showed$")
    public void the_account_page_is_showed() {
    }

    @When("^The user attempt to change information to Username \"([^\"]*)\" Email \"([^\"]*)\"$")
    public void the_user_change_username_and_email(String strArg1, String strArg2) {
    }

    @When("^The user attempt to edit email with Email (.+)$")
    public void the_user_attempt_to_edit_email(String email){
    }

    @When("^The user choose a picture from divice and upload it$")
    public void the_user_choose_a_picture_from_divice_and_upload_it(){
    }

//    @Then("^The message \"([^\"]*)\" will be showed$")
//    public void the_message_something_will_be_showed(String list1) {
//    }

    @Then("^The profile picture is updated$")
    public void the_profile_picture_is_updated() {

    }

    @Then("^the profile information is updated$")
    public void the_profile_information_is_updated() {
    }

}
