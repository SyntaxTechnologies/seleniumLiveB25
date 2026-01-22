package LiveClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        driver.manage().window().maximize();

        WebElement fname = driver.findElement(By.id("first_name"));
        WebElement lname = driver.findElement(By.name("last_name"));
        WebElement email=driver.findElement(By.className("form-control-01"));
        WebElement submitBtn=driver.findElement(By.id("submit_button"));


        fname.sendKeys("abo");
        lname.sendKeys("akadam");
        email.sendKeys("abo@fi.fi");
        submitBtn.click();

        driver.findElement(By.partialLinkText("Click ")).click();


    }
}
