package com.marlonalmeida.tse_resultados;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TourResultados extends TestBase {

    public TourResultados() {
        caps = ProjectCapabilities.AndroidApp();
    }

    @AndroidFindBy
            (uiAutomator = "new UiSelector().textContains(\"Entendi\")")
            public MobileElement nextBtn;

    public void clickNextBtn() {
        nextBtn.click();
    }

    @Test
    public void firstAccess() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(MobileBy.custom(("elementId"), "f16b03a0-5870-46e9-801a-3bd0c5a115e6")).click();

        // Long Xpath example - We should avoid that
        // Clica no botão [Próximo]
        driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.view.ViewGroup/android.webkit.WebView" +
                        "/android.webkit.WebView/android.view.View/android.view.View" +
                        "/android.view.View/android.view.View/android.view.View[2]" +
                        "/android.view.View/android.view.View/android.widget.Button")).click();

        // Clica no botão [Entendi]
        driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")).click();


        // Scroll e clica no botão [Li e Aceito]
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Li e Aceito\"))"));
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Li e Aceito\")")).click();

        //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.Button")).click();
        //BTN_ENTENDI = (MobileBy.ANDROID_UIAUTOMATOR, 'new UiSelector().textContains(\"Entendi\")')
    }

}
