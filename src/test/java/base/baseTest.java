package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseTest {
    public static WebDriver driver;

    public static void starDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
//        driver = WebDriverManager.chromedriver().create();
   }
}
