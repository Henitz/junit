package atda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public final WebDriver driver;
    public final WebDriver busca;
    WebDriverWait wait;


    public BasePage(WebDriver driver, WebDriver busca) {
        this.driver = driver;
        this.busca = busca;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
    }
}
