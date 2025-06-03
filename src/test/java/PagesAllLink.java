import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PagesAllLink {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/");

        List<WebElement> links = driver.findElements(By.tagName("a"));//html tag: <a></a>
        for(WebElement e:links){
            String href = e.getAttribute("href");
            System.out.println("URL(href): "+href);

            String linkText = e.getText();
            System.out.println("Link Text: "+ linkText);
            System.out.println("---------");
        }

        driver.quit();
    }
}
