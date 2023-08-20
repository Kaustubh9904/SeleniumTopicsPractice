import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class handlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver","D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys("Tester");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("name")).sendKeys("Tester");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        driver.quit();
    }
}
