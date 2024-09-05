import Base.BaseClass;
import Pages.FirstGithubPage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class FirstGithubTest extends BaseClass {
    @Test
    @Description("hh")
    public void mainPageMethod() throws InterruptedException {
        FirstGithubPage github = new FirstGithubPage(driver);
        github.openGitUrl();
        Thread.sleep(2000);
        github.clickOnDocs();
        Thread.sleep(2000);

    }
    @Test
    public void signInMethod() throws InterruptedException {
        FirstGithubPage signIn = new FirstGithubPage(driver);
        signIn.openGitUrl();
        signIn.clickOnSignInBtn();

        // Create an instance of LoginPages and use it directly
        LoginPage login = new LoginPage(driver);
        login.WriteUsername();
        login.WritePassword();
        login.LoginButton();

    }
}
