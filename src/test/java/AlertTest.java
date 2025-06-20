import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Click Button to see alert
        driver.findElement(By.cssSelector("#alertButton")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert-1 message: " + alert1.getText());
        alert1.accept();

        // On button click, alert will appear after 5 seconds
        driver.findElement(By.cssSelector("#timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Alert-2 message: " + alert2.getText());
        alert2.accept();


        //On button click, confirm box will appear
        driver.findElement(By.cssSelector("#confirmButton")).click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println("Alert-3 message: " + alert3.getText());
        alert3.dismiss();

        //On button click, prompt box will appear
        driver.findElement(By.cssSelector("#promtButton")).click();
        Alert alert4 = driver.switchTo().alert();
        alert4.sendKeys("Tanzim");
        System.out.println("Alert-4 message: " + alert4.getText());
        alert4.accept();

        driver.quit();
    }
}
