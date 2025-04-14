package checkout;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Checkout extends SharedData2 {

    @Test
            public void TestMethod() {
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("continue")).click();
        String errorNotification = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        System.out.println(errorNotification);
        driver.findElement(By.className("error-button")).click();
        driver.findElement(By.id("first-name")).sendKeys("Dan");
        driver.findElement(By.id("continue")).click();
        String errorNotification2 = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        System.out.println(errorNotification2);
        driver.findElement(By.className("error-button")).click();
        driver.findElement(By.id("last-name")).sendKeys("Dudas");
        driver.findElement(By.id("continue")).click();
        String errorNotification3 = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        System.out.println(errorNotification3);
        driver.findElement(By.className("error-button")).click();
        driver.findElement(By.id("postal-code")).sendKeys("300440");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        String mesajValidareComanda = driver.findElement(By.xpath("//h2[@data-test='complete-header']")).getText();
        System.out.println(mesajValidareComanda);
        driver.findElement(By.id("back-to-products")).click();
    }
}
