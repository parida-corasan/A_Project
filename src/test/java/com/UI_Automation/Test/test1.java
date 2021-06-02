package com.UI_Automation.Test;

import com.UI_Automation.Utilities.Driver;
import com.UI_Automation.Utilities.configurationReader;
import io.cucumber.java.en.Given;
import org.junit.Test;

public class test1 {
    @Test
    public void user_on_the_login_page() {
       // System.out.println(configurationReader.getProperty("homePage"));

        Driver.getDriver().get(configurationReader.getProperty("homePage"));
    }

}
