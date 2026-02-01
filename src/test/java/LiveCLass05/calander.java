package LiveCLass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calander {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");


        driver.findElement(By.id("start_date")).click();
        WebElement calanderMonth = driver.findElement(By.xpath("//table[@id='table-day']//th[@class='datepicker-switch']"));

        boolean notFound=true;
        while(notFound) {
            if (calanderMonth.getText().equals("June 2026")) {
                //click on the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for(WebElement date:allDates){
                    if(date.getText().equals("24")){
                        date.click();
                    }
                }

                notFound=true;
            } else {
                driver.findElement(By.xpath("//table[@id='table-day']//th[@class='next']")).click();

            }
        }



    }
}
