package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class handlingWindowElements {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver", "D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        //Create a set of strings and store window handle ids
        Set<String> windows = driver.getWindowHandles();//[parentid,childid]
        //Set string iterator in windows set
        Iterator<String> it = windows.iterator();
        //here control is set ti 0th index
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        //String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        System.out.println(emailId);
        driver.switchTo().window(parentId);
        driver.findElement(By.cssSelector("input.form-control")).sendKeys(emailId);
    }
}
