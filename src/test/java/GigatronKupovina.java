
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GigatronKupovina {

    @Test

    public void HuaweiBlackBuy() {


        ChromeDriver driver = new ChromeDriver();
        try {
            driver.get("https://gigatron.rs/");
            WebElement AkcijeButon = driver.findElement(By.xpath("//ul[@id='header-nav']//a[@href='/akcije']"));
            AkcijeButon.click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement HuaweiNova = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains (text() , 'Huawei Nova')]/parent::a")));
            js.executeScript("arguments[0].scrollIntoView(true);", HuaweiNova);

            HuaweiNova.click();


            WebElement HuaweiBlack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[ contains (text() , 'HUAWEI Nova 9 SE 128GB Black (Crna)')]")));
            WebElement cookies = driver.findElement(By.xpath("//button[@class='btn primary']"));
            cookies.click();
            HuaweiBlack.click();



            WebElement DodajuKorpu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Dodaj u korpu']")));
            DodajuKorpu.click();

            WebElement IdiUKorpu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Idi u korpu']")));
            IdiUKorpu.click();

            WebElement Korisnik = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains ( text () , 'Kupovinom kao')]/preceding-sibling::button")));
            Korisnik.click();

            WebElement HuaweiKorpa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='titleItemLink']//h4[contains ( text () ,'HUAWEI Nova')]")));
            HuaweiKorpa.getText();

            System.out.println("Nastavi kao neregistrovani kupac");

            String ActualTitlle= driver.getTitle();
            String ExpectedTittle = "Vaša Online Korpa | Gigatron";
            Assert.assertEquals(ActualTitlle,ExpectedTittle);





        } finally {
            driver.quit();
        }


//

    }


}
