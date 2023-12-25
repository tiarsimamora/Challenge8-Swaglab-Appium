package belajarAppium;


import io.cucumber.java.After;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"belajarappium"},
        plugin = {
                "pretty",
                "html:target/report-cucumber.html",
                "json:target/cucumber-json.json"
        }
)
public class CucumberRunnerTest {
    @BeforeMethod
    public static void beforeMethod() {
        BaseTest.setupDriver();
    }

    @AfterMethod
    public static void afterMethod() {
        BaseTest.stopDriver();
    }

    @After
    public static void after() {
        BaseTest.resetApp();
    }
}
