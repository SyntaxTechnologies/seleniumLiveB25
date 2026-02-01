package LiveCLass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/simple_context_menu.php");

        WebElement hovrBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action= new Actions(driver);
        action.moveToElement(hovrBtn).perform();

        WebElement rclick = driver.findElement(By.id("show_context_menu"));
        action.contextClick(rclick).perform();


        WebElement dragable = driver.findElement(By.id("draggable"));

        WebElement droploc = driver.findElement(By.id("droppable"));

//        action.dragAndDrop(dragable,droploc).perform();
      action.clickAndHold(dragable).moveToElement(droploc).release().build().perform();




    }
}
