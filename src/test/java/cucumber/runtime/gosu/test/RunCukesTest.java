package cucumber.runtime.gosu.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "classpath:cucumber/runtime/gosu/test")
public class RunCukesTest {
}
