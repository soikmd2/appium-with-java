package com.marlonalmeida.tse_resultados;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TourResultados extends TestBase {

    public TourResultados() {
        caps = ProjectCapabilities.AndroidApp();
    }

    @Test
    public void firstAccess() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(MobileBy.custom(("elementId"), "f16b03a0-5870-46e9-801a-3bd0c5a115e6")).click();

        // Long Xpath example - We should avoid that
        driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.view.ViewGroup/android.webkit.WebView" +
                        "/android.webkit.WebView/android.view.View/android.view.View" +
                        "/android.view.View/android.view.View/android.view.View[2]" +
                        "/android.view.View/android.view.View/android.widget.Button")).click();
    }
}
