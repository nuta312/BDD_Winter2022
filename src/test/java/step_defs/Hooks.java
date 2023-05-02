package step_defs;

import com.spacex.driverFactory.ChromeWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Hooks {

    WebDriver driver =  ChromeWebDriver.loadChromeDriver();

    @Before
    public void setUp(){
        System.out.println("This is before annotation");
    }

    @After
    public void  tearDown(Scenario scenario){

        if (scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","screenshot");
            }catch (WebDriverException e){
                e.printStackTrace();
            }
        }
        driver.close();
        driver.quit();
        // TODO close webdriver
    }
}
