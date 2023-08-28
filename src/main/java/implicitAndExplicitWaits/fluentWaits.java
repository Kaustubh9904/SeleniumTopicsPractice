package implicitAndExplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class fluentWaits {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver", "D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("div[id='start'] button")).click();
        Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement foo = w.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver webDriver) {
                if(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).isDisplayed()){
                    return driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
                }else
                    return null;

            }
        });
        System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText());
        driver.quit();
    }
}
