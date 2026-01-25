package liveClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ddwithNoSelectTag {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        WebElement dd = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dd.click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for(WebElement option:allOptions){
            String value = option.getText();
            if(value.equals("Peru")){
                option.click();
            }

        }




    }
}
