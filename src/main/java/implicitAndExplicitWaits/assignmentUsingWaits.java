package implicitAndExplicitWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class assignmentUsingWaits {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver", "D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement staticDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropDown = new Select(staticDropDown);
        dropDown.selectByValue("teach");
        driver.findElement(By.cssSelector("span.termsText")).click();
        driver.findElement(By.name("signin")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
        List<WebElement> productsList = driver.findElements(By.cssSelector("button.btn-info"));
        for(int i=0;i<productsList.size();i++){
            driver.findElements(By.cssSelector("button.btn-info")).get(i).click();
        }
        driver.findElement(By.cssSelector("a.btn-primary")).click();
        driver.findElement(By.cssSelector("button.btn-success")).click();
        driver.quit();
     }
}
