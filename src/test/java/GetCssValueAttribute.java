import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class GetCssValueAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        //List<WebElement> elements = driver.findElements(By.cssSelector("input")); //Alternative

        for(WebElement e: elements){
            String fontSize = e.getCssValue("font-size");
            String attributeName= e.getAttribute("name");
            System.out.println("Name: "+attributeName);
            System.out.println("Font Size: "+fontSize);
            System.out.println("------------------");
        }
        driver.quit();

    }
}
