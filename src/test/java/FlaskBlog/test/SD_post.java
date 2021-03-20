package FlaskBlog.test;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class SD_post {
    @Given("^The New post page is showed$")
    public void the_new_post_page_is_showed() {
    }

    @When("^The user attempt to post a new post with Title (.+) and Content (.+)$")
    public void the_user_post_a_new_post_with_title_and_content(String title, String content) {
    }

    @When("^The user attempt to post a new post with Title \"([^\"]*)\" and Content \"([^\"]*)\"$")
    public void the_user_post_a_new_post_with_title_and_content2(String strArg1, String strArg2) {
    }

//    @Then("^The error message \"([^\"]*)\" will be showed$")
//    public void the__message_something_will_be_showed(String strArg1) {
//    }

    @Then("^The message \"([^\"]*)\" will be show in the home page$")
    public void the_message_will_be_show_in_the_home_page(String strArg1) {
    }

}
