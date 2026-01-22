package liveClass03;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

///check if the checkboxes are displayed
//        if yes make them hide

        WebElement cb1 = driver.findElement(By.xpath("//input[@value='Checkbox-1']"));
        if(cb1.isDisplayed()){

            driver.findElement(By.id("toggleCheckboxButtons")).click();
        }

        List<WebElement> allOptions = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement option:allOptions){
             String valueOption = option.getAttribute("value");
            if(valueOption.equals("Option-1") ||valueOption.equals("Option-2") ) {
                option.click();
            }
        }



    }
}
