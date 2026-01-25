package liveClass04;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S253792705%3A1769360381290263&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXbMIuB1xKC1VCWZ5-emMog3Snm-dA1T3Dz_WmW3H3XFjVm1oRhG_OSSSksJ3FT77r3MDTCpmVJbTA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();


        //get the window handle of the current page
        String mainPageWidnowHandle = driver.getWindowHandle();
        System.out.println("the window handle of the current page is: "+mainPageWidnowHandle);

//        get window handle of all the pages
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);
             String url = driver.getCurrentUrl();
             if(url.equals("https://policies.google.com/privacy?gl=FI&hl=en-US")){
                 break;
             }

        }

        System.out.println(driver.getCurrentUrl());
        //done all teh task of this page
        //i want to close this page
        driver.close();

        driver.switchTo().window(mainPageWidnowHandle);
        System.out.println(driver.getCurrentUrl());



    }
}
