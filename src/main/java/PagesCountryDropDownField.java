import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PagesCountryDropDownField {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
        select.selectByVisibleText("BANGLADESH");

        Thread.sleep(3000);
        driver.quit();
    }
}
