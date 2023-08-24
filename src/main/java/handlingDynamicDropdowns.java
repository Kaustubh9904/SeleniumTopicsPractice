import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handlingDynamicDropdowns {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

//--------------Parent->Child xpath----------------
        //write the xpath followed by the xpath of the next element and so on.
        //the above xpath of BLR and chennai can also be written as :
        //        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA'])[2]")).click();
        driver.quit();
    }
}
