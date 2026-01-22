package liveClass03;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radiobtns {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");


        List<WebElement> allOptions = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //select age 5-15
        for(WebElement option:allOptions){
             String optionValue = option.getAttribute("value");
             if(optionValue.equals("15 - 50")){
                 option.click();
                 break;
             }

        }


    }
}
