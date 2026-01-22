package liveClass03;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementCommand {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");


        WebElement inputBox = driver.findElement(By.id("textInput"));
//        inputBox.clear();


//        check if the option1 is selected do nothing
//                if it is not selected then click on it

        WebElement rb1 = driver.findElement(By.xpath("//input[@value='option1']"));

        if(!rb1.isSelected()){
            rb1.click();
        }


//     check if optin3 is not displayed
//        make it display
        WebElement rb3 = driver.findElement(By.xpath("//input[@value='option3']"));

        if(!rb3.isDisplayed()){
            driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']")).click();
        }


        WebElement inputText = driver.findElement(By.id("textElement"));
        System.out.println(inputText.getText());

//get the textbox value of ui
        String inputboxValue = inputBox.getAttribute("value");
        System.out.println(inputboxValue);


    }
}
