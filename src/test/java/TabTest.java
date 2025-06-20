import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabTest {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/sample");

        System.out.println("New Tab URL: " + driver.getCurrentUrl());

        driver.switchTo().window(currentWindow);

        driver.quit();
    }
}
