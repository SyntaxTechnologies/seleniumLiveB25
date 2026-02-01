package LiveCLass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class tables {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://54.198.61.50/web/index.php/auth/login");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hrm_user");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hrm_user@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PIM']")));
        driver.findElement(By.xpath("//span[text()='PIM']")).click();

        //click on the check box for the element with id 0918
        List<WebElement> allids = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[2]"));
        int count=1;
        for(WebElement id:allids){

            String idNumb = id.getText();
            System.out.println(idNumb);
            if(idNumb.equals("0914")){

                System.out.println("the row number is "+count);
                WebElement checkBox = driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@role='row'])[\" + count + \"]//span[contains(@class,'oxd-checkbox-input')]"));
                checkBox.click();

            }
          count++;


        }








    }
}
