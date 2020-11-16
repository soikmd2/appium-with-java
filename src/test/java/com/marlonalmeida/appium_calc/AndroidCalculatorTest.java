package com.marlonalmeida.appium_calc;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AndroidCalculatorTest extends TestBase {

    public AndroidCalculatorTest() {
        caps = ProjectCapabilities.AndroidCalc();
    }

    @Test
    public void somaTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(MobileBy.AccessibilityId("plus")).click();
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
        driver.findElement(MobileBy.AccessibilityId("equals")).click();

        WebElement result = driver.findElement(MobileBy.id("com.android.calculator2:id/result"));
        System.out.println("O resultado da operação é: " + result.getText());

        assert result.getText().equals("5");
    }

    @Test
    public void subtracaoTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
        driver.findElement(MobileBy.AccessibilityId("minus")).click();
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(MobileBy.AccessibilityId("equals")).click();

        WebElement result = driver.findElement(MobileBy.id("com.android.calculator2:id/result"));
        System.out.println("O resultado da operação é: " + result.getText());

        assert result.getText().equals("1");
    }
    @Test
    public void multiplicacaoTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
        driver.findElement(MobileBy.id("op_mul")).click();
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
        driver.findElement(MobileBy.AccessibilityId("equals")).click();

        WebElement result = driver.findElement(MobileBy.id("com.android.calculator2:id/result"));
        System.out.println("O resultado da operação é: " + result.getText());

        assert result.getText().equals("16");
    }
    @Test
    public void divisaoTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(MobileBy.AccessibilityId("divide")).click();
        driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
        driver.findElement(MobileBy.AccessibilityId("equals")).click();

        WebElement result = driver.findElement(MobileBy.id("com.android.calculator2:id/result"));
        System.out.println("O resultado da operação é: " + result.getText());

        assert result.getText().equals("3");
    }
}
