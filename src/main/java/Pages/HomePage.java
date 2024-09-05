package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.HomeObjects.*;

public class HomePage {
    WebDriver driver = null;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void OpenAvatar() {
        WebElement Avatar = driver.findElement(avatar);
        Avatar.click();
    }

    public void Repositories() {
        WebElement Repository = driver.findElement(yourRepositories);
        Repository.click();
    }

    public void NewRepository() {
        WebElement New = driver.findElement(newRepository);
        New.click();
    }

    public void RepositoryName() {
        WebElement name = driver.findElement(repositoryName);
        name.sendKeys("automation");
    }

    public void CreateBtn() throws InterruptedException {
        WebElement Create = driver.findElement(createBtn);
        Create.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);
        Create.click();
    }


}
