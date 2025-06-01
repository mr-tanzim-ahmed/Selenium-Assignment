import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class PagesFormFillup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Contact Information
        driver.findElement(By.cssSelector("input[name='firstName']")).clear();
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Tahsin");
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Ahmed");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("0123123123");
        driver.findElement(By.cssSelector("#userName")).sendKeys("tahsin@gmail.com");

        //  Mailing Information
        driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("123 West");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Dhaka");
        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Dhaka");
        driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("1212");

        Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
        select.selectByVisibleText("BANGLADESH");

        //User Information
        String emailId= "tahsin@email.com";
        driver.findElement(By.cssSelector("#email")).sendKeys(emailId);
        String password = "Admin123";
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys(password);

        driver.findElement(By.cssSelector("input[name='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Login Page
        WebDriver.Navigation nav = driver.navigate();
        driver.navigate().refresh();
        nav.to("https://demo.guru99.com/test/newtours/login.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(emailId);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='Submit']")).click();

        //Thread.sleep(5000);
        driver.quit();
    }
}
