package LiveCLass05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypress {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/keypress.php");
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys(Keys.ENTER);
    }
}
