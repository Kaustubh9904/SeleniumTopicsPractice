import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class staticDropdowns2Passengers {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        //to have multiple clicks just use loops, simple.
        for(int i=0;i<5;i++){

            driver.findElement(By.id("hrefIncAdt")).click();

        }
        driver.findElement(By.id("btnclosepaxoption")).click();

//        WebElement staticDropdown = driver.findElement(By.id("hrefIncAdt"));
//        Select dropDown = new Select(staticDropdown);
//        dropDown
    }
}
