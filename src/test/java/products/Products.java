package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;


public class Products extends SharedData3 {
    @Test
    public void metodaTest() {
        List products = driver.findElements(By.className("inventory_item_name"));
        System.out.println("Numar produse:" + products.size());
        driver.findElement(By.className("product_sort_container")).sendKeys("Price low to high");
        List<WebElement> priceProducts = driver.findElements(By.className("inventory_item_price"));
        for (WebElement priceProduct : priceProducts) {
            System.out.println("Pretul produselor low to high sunt:" + priceProduct.getText());
        }
        driver.findElement(By.className("product_sort_container")).sendKeys("Price high to low");
        List<WebElement> priceProducts1 = driver.findElements(By.className("inventory_item_price"));
        for (WebElement priceProduct : priceProducts1) {
            System.out.println("Pretul produselor high to low sunt:" + priceProduct.getText());
        }
        driver.findElement(By.className("product_sort_container")).sendKeys("Name(A to Z");
        List<WebElement> nameProducts = driver.findElements(By.className("inventory_item_name"));
        for (WebElement nameProduct : nameProducts) {
            System.out.println("Numele produselor sortate A to Z sunt:" + nameProduct.getText());
        }
        driver.findElement(By.className("product_sort_container")).sendKeys("Name(Z to A");
        List<WebElement> nameProducts1 = driver.findElements(By.className("inventory_item_name"));
        for (WebElement nameProduct : nameProducts1) {
            System.out.println("Numele produselor sortate Z to A sunt:" + nameProduct.getText());
        }

    }
}
