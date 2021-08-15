import io.appium.java_client.AppiumDriver;
import org.testng.Assert;


public class Asserting {

    public static boolean Assert(AppiumDriver driver){
        String createAcc = "No tasks on the horizon!";
        String result = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]").getText();

        try {
            Assert.assertEquals(createAcc, result);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static boolean AssertError(AppiumDriver driver){
        String wrongData = String.valueOf(driver.findElementByAccessibilityId("bottom_bar_create_button"));
        String result = String.valueOf(driver.findElementsByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

        try{
            Assert.assertEquals(wrongData,result);
            return false;
        }catch (Exception e){
            return true;
        }
    }
}
