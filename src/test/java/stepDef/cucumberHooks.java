package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static base.baseTest.starDriver;
import static base.baseTest.driver;

public class cucumberHooks {
    @Before
    public void beforeTest(){
        System.out.println("Before Test");
        starDriver();
    }
    @After
    public void afterTest(){
        System.out.println("After Test");
        driver.quit();
    }
}
