package com.euroTech.step_definitions;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.hu.De;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {


    @Before (order = 0)
    public void setUp(){

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After(order = 0)
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
           final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before ( value = "@rosa" ,order = 1 )
    public void setUpRosa(){
        //System.out.println("BEFORE SCENARIO ROSA");
    }

    @After (value = "@rosa", order = 1)
    public void tearDownRosa(){
        //System.out.println("AFTER SCENARIO ROSA");
    }
}
