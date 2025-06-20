import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String currentWindow =  driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://demoqa.com/sample");
        Thread.sleep(3000);
        //driver.get("https://demoqa.com/sample");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title: "+driver.getTitle());
        driver.close();
        driver.switchTo().window(currentWindow);

        //driver.findElement(By.cssSelector("#messageWindowButton")).click();
        driver.switchTo().newWindow(WindowType.WINDOW).findElement(By.cssSelector("#messageWindowButton")).click();
        System.out.println("Message from new window: "+driver.findElement(By.tagName("body")).getText());

        driver.close();
        driver.switchTo().window(currentWindow);

        driver.quit();

    }
}
