package LiveCLass05;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

//    take screen shot
        TakesScreenshot ss = (TakesScreenshot) driver;
        //takes the screenshot
        File screenShot = ss.getScreenshotAs(OutputType.FILE);

       //copy the ss
        FileUtils.copyFile(screenShot,new File("screenshot/abc.png"));
    }
}
