import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

public class Ecomm_App_Add_to_cart {

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver","D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++){
           String name = products.get(i).getText();

           if(name.contains("Cucumber")){
            driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            break;
           }
        }

        driver.quit();
    }
}
