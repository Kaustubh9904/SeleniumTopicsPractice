import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Arrays;
import java.util.List;

public class eCommAppAddtocartP2 {

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
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Cauliflower", "Mango", "Beans", "Tomato"};
        for (int i = 0; i < products.size(); i++) {
            //we needed to extract specific item name, so we used trim function to trim spaces, and split()
            //to split the words using '-'.  This returns array so we changed return type to String[]
            String[] productName = products.get(i).getText().trim().split("-");
            //convert array to List on runtime, to use .contains(productname[0])in furhter condition
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(productName[0])) {
                driver.findElements(By.cssSelector("a.increment")).get(i).click();
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }
        driver.quit();
    }
}
