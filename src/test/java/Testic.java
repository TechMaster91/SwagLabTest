import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testic {

    @Test

    public void LoggInTest () {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement UsernameField = driver.findElement  (By.id ("user-name"));
        UsernameField.click();
        UsernameField.sendKeys("standard_user");

        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.click();
        PasswordField.sendKeys("secret_sauce");

        WebElement LogginField= driver.findElement(By.id("login-button"));
        LogginField.click();







    }




}
