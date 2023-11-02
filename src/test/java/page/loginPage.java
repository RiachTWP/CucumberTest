package page;

import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static base.baseTest.driver;

public class loginPage {

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");


    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }
    public void inputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void validateErrorAppear(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
