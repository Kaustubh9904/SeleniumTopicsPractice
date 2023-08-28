package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class e2eUsingUIElements {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver","D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'IXJ')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Amritsar')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@data-testid,'undefined-month-September-2023')]//div[3]//div[5]//div[4]/div[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
        driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
        driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
        driver.findElement(By.xpath("//div[@style='flex: 0.3 1 0%; margin-left: 10px;']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
        driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
        System.out.println("Test Pass Successfully!");
        driver.quit();
    }
}
