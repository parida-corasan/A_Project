package com.UI_Automation.StepDefinition;

import com.UI_Automation.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

public class Hooks {

@After(order = 2)
public void screenshotIfFail(Scenario scenario){
    System.out.println("scenario.getLine() = " + scenario.getLine());
    System.out.println("scenario.isFailed() = " + scenario.isFailed());

   final byte[] screenShot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

   scenario.attach(screenShot,"image/png",scenario.getName());

}







@After(order = 1)
    public void teardown(){
        Driver.closeDriver();
        System.out.println("driver closed");
    }
}
