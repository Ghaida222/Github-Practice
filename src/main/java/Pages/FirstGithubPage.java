package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.FirstGithubObjects.docsLink;
import static ObjectsPath.FirstGithubObjects.signIn;

public class FirstGithubPage {
    WebDriver driver = null;

    public FirstGithubPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn() {
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }

    public void clickOnDocs() throws InterruptedException {
        WebElement Docs = driver.findElement(docsLink);
        Docs.sendKeys(Keys.PAGE_DOWN);
        //Using selenium Keys to scroll down page
        Thread.sleep(3000);
        Docs.click();
//        Thread.sleep(2000);
//        boolean gitHubAssert = driver.findElement(githubDocsTextAssertion).isDisplayed();
//        Assert.assertTrue(true);


    }
}
