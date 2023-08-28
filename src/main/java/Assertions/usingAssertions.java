package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class usingAssertions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        driver.quit();
    }
}
