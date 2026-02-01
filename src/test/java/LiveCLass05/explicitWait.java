package LiveCLass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("enable_button")).click();

        WebElement button2 = driver.findElement(By.xpath("//button[text()='Button']"));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(button2));

        if(button2.isEnabled()){
            button2.click();
        }

//        button
        driver.findElement(By.id("checkbox_button")).click();
//checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox"));


        //wait until the check box is selected and then diplay the status on console
     wait.until(ExpectedConditions.elementToBeSelected(checkbox));
        if(checkbox.isSelected()){
            System.out.println("check box is selected");
        }
    }
}