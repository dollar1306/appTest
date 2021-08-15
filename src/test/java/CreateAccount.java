import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CreateAccount {

    public static void startRegistration(AppiumDriver driver){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("start_button");
        el1.click();//start registration button


        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"image_picker\"]/android.widget.ImageView");
        el2.click();//Choosing a profile photo emulator
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.gallery3d:id/gl_root_view");
        el3.click();//Choosing a profile photo emulator
        MobileElement el4 = (MobileElement) driver.findElementById("com.android.gallery3d:id/gl_root_view");
        el4.click();//Choosing a profile photo emulator


        //That for real phone samsung s9+
//        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"image_picker\"]/android.widget.ImageView");
//        el2.click();//Choosing a profile photo
//        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView");
//        el3.click();//Choosing a profile photo
//        MobileElement el4 = (MobileElement) driver.findElementById("com.sec.android.gallery3d:id/thumbnail");
//        el4.click();//Choosing a profile photo


        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("email_input");
        el5.sendKeys("Alex4321@gmail.com");//Send email

        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("user_name_input");
        el6.sendKeys("Alex Alex");//Send full name

        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("password_input");
        el7.sendKeys("Alex1234");//password
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("repeat_password_input");
        el8.sendKeys("Alex1234");//confirm password

        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("create_account_button");
        el9.click();//create account-button

    }
}
