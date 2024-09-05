package ObjectsPath;

import org.openqa.selenium.By;

public class LoginObjects {
    public static final By username= By.id("login_field");
    public static final By password= By.xpath("//*[@id=\"password\"]");
    public static final By loginButton= By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]");
}
