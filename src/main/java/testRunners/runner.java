package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import util.driverFactory;

@CucumberOptions (
        features = {"src/test/java/features"},
        glue = {"stepDefinition", "util"},
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                "json:Reports/CucumberReport/Report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                 }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = driverFactory.getDriver();

    @BeforeSuite
    public void beforeSuite() {
    }

    @BeforeTest()
    public void beforeTest() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @BeforeGroups
    public void beforeGroup() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
    }

    @AfterTest
    public void afterTest() {
    }

    @AfterSuite
    public void afterSuite() {
    }

    @AfterGroups
    public void afterGroup() {
    }
}
