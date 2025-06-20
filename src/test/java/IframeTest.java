import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeTest {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title of the pages: "+ driver.findElement(By.cssSelector(".text-center")).getText());

        driver.switchTo().frame("frame1");
        System.out.println("Frame 1: "+driver.findElement(By.cssSelector("#sampleHeading")).getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        System.out.println("Frame 2: "+ driver.findElement(By.cssSelector("#sampleHeading")).getText());
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
