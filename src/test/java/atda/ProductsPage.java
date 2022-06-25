package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver, WebDriver busca) {
        super(driver, busca);
    }

    public boolean isLoaded() {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("inventory_filter_container"))).isDisplayed();
    }
}
