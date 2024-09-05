package ObjectsPath;

import org.openqa.selenium.By;

public class HomeObjects {
    public static final By avatar= By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[3]/deferred-side-panel/include-fragment/react-partial-anchor/button/span/span/img");
    public static final By yourRepositories= By.xpath("//*[text()='Your repositories']");
    public static final By newRepository= By.xpath("//*[@id='user-profile-frame']/div/div[1]/div/div/a");
    public static final By repositoryName= By.xpath("//*[@data-testid='repository-name-input']");
    public static final By createBtn= By.xpath("//span[text()='Create repository']");
    public static final By signOut= By.xpath("//*[@id=':r21:--label']");
    public static final By signOut2= By.xpath("//input[@value='Sign out']");
}
