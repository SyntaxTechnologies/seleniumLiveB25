package liveClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dd1 = driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select sel= new Select(dd1);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
        sel.selectByValue("Wednesday");


        WebElement dd2 = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel2= new Select(dd2);
        sel2.selectByValue("Florida");
        sel2.selectByIndex(4);
        sel2.selectByVisibleText("Pennsylvania");
        Thread.sleep(3000);
        sel2.deselectByVisibleText("Pennsylvania");

        System.out.println(sel2.isMultiple());



    }
}
