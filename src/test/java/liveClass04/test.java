package liveClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
        WebElement dropDown = driver.findElement(By.xpath("//div[@data-toggle='dropdown' and @id='dream_fruits']"));
        dropDown.click();
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement allOption : allOptions) {
            String allOptionText = allOption.getText();
            if (allOptionText.equals("Mango")) {
                allOption.click();
            }

        }


        WebElement drop = driver.findElement(By.xpath("//div[@data-toggle='dropdown' and @id='favorite_hobbies']"));
        drop.click();


        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement option : options) {
            String optionText = option.getText();
            if (optionText.equals("Reading")) {
                option.click();
                break;
            }
        }
    }
}
