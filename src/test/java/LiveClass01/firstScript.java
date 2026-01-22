package LiveClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
// goto this url
        driver.get("https://syntaxprojects.com/Introduction-selenium.php");

//maximize the screen
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
       Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();


        String url=driver.getCurrentUrl();
        System.out.println("the current url is"+url);

        driver.close();



    }
}
