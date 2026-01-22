package LiveClass02;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagname {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com.sg/");

        List<WebElement> alllinks = driver.findElements(By.tagName("a"));

        for(WebElement link:alllinks){
             String actualLink = link.getAttribute("href");
            System.out.println(actualLink);
        }


    }
}
