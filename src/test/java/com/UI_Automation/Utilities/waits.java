package com.UI_Automation.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class waits {

    public static void implicitWait(int second){

      Driver.getDriver().manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);


    }


    public static void javaWait(int second){
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }








}
