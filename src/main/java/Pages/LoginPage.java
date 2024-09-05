package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LoginObjects.*;

public class LoginPage {
    WebDriver driver = null;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void openUl() {

        driver.get("https://github.com/login");
    }

    public void WriteUsername() {
        WebElement userName = driver.findElement(username);
        userName.sendKeys("Ghaida222");
    }

    public void WritePassword() {
        WebElement Password = driver.findElement(password);
        Password.sendKeys("FJTY#);
    }

    public void LoginButton() {
        WebElement SignIn = driver.findElement(loginButton);
        SignIn.click();
    }
}
