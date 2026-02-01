package LiveCLass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/upload-image.php");

        WebElement chooseFileBtn = driver.findElement(By.id("image-file"));
        chooseFileBtn.sendKeys("C:\\Users\\moazzam\\Desktop\\Capture.JPG");
    }
}