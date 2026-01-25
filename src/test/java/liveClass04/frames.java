package liveClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        driver.switchTo().frame(1);

        WebElement dd = driver.findElement(By.id("animals"));
        Select sel=new Select(dd);
        sel.selectByIndex(2);


        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        driver.findElement(By.name("Topic")).sendKeys("frames");


        WebElement frame3 = driver.findElement(By.id("checkboxIframe"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@class='cb1-element']")).click();


    }
}
