import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;
import java.time.Duration;

public class BrowserNavigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.cssSelector("#file-upload")).sendKeys("/home/acer/Documents/New Project Asset/Slider/1.png");
        driver.findElement(By.cssSelector("#file-submit")).click();
        driver.navigate().back();
        driver.navigate().refresh();

        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();

        driver.navigate().to("https://www.saucedemo.com/cart.html");
        driver.findElement(By.cssSelector("#remove-sauce-labs-backpack")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().back();

        driver.quit();
    }
}
