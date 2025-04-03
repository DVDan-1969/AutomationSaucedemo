package shoppingCart;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ShoppingCart extends SharedData1 {

    @Test
    public void shoppingCart() {


        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.id("shopping_cart_container")).click();

        String price = driver.findElement(By.className("inventory_item_price")).getText();
        assertEquals(price,"$29.99");
        driver.findElement(By.id("continue-shopping")).click();

       driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();


        driver.findElement(By.id("item_0_img_link")).click();

        driver.findElement(By.id("add-to-cart")).click();

        driver.findElement(By.id("back-to-products")).click();


        driver.findElement(By.id("item_3_img_link")).click();

        driver.findElement(By.id("add-to-cart")).click();

        driver.findElement(By.id("back-to-products")).click();


        String qty = driver.findElement(By.id("shopping_cart_container")).getText();
        assertEquals(qty, "6");
        driver.findElement(By.id("shopping_cart_container")).click();


        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();

        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();

        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();

        driver.findElement(By.id("remove-sauce-labs-onesie")).click();

        driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();

        String qty1 = driver.findElement(By.id("shopping_cart_container")).getText();

        System.out.println("cosul de cumparaturi contine 0 produse"+qty1);

    }
}



