import Base.BaseClass;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;

public class GithubTest extends BaseClass {
    @Test
    public void LoginMethod() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.openUl();
        loginpage.WriteUsername();
        loginpage.WritePassword();
        loginpage.LoginButton();
        Thread.sleep(5000);
    }

    @Test(testName = "TS-002")
    public void HomeMethod() throws InterruptedException {
        HomePage homepage = new HomePage(driver);
        LoginMethod();
        homepage.OpenAvatar();
        Thread.sleep(5000);
        homepage.Repositories();
        homepage.NewRepository();
        homepage.RepositoryName();
        Thread.sleep(5000);
        homepage.CreateBtn();
        Thread.sleep(5000);
    }

    @Test(testName = "TS-003")
    public void SignOutMethod() throws InterruptedException {
        HomePage homepage = new HomePage(driver);
        LoginMethod();
        homepage.OpenAvatar();
        Thread.sleep(5000);
        homepage.SignOut();
        homepage.SignOut2();
        Thread.sleep(5000);
    }


}
