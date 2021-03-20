package FlaskBlog.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FlaskBlog/test/Sc_loginpage.feature",plugin = {"pretty"})

public class RunCucumberTest {

}
