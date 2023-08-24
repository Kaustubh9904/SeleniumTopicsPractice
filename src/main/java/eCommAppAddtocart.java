import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

public class eCommAppAddtocart {

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver", "D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        //get list of webelements by the used xpath in a variable called products
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        //loop through the list of elements in products, store text of that element on that particulr index using
        //productName string using get(i) method. Then if it matches requirement click on current index element.
        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).getText();
            if (productName.contains("Beetroot")) {
                driver.findElements(By.cssSelector("a.increment")).get(i).click();
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }
        driver.quit();
    }
}
