
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppTest {
    private static AndroidDriver<MobileElement> driver;

    @BeforeClass
    public static void setUp() throws IOException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//"platformName": "android"
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");//"deviceName": "emulator-5554"   Android Emulator    Galaxy 9+
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\USER\\Desktop\\Appium Automation\\APK\\app-release.apk");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);//"appPackage": "C:\Users\USER\Desktop\Appium Automation\APK\app-release.apk"
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void registerAccount() {
        boolean registration = false;
        try {
            CreateAccount.startRegistration(driver);
            if (Asserting.Assert(driver)) {              //check if you create account before
                registration = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            registration = false;
            System.out.println("You are already registered");
            System.out.println("Go to Login");
        } finally {
            if (registration) {
                System.out.println("Create Account successful");
                CreateTask.CreateTask(driver);
            }
        }
    }


    @Test
    public void logIn() {
        boolean login = false;
        try {
            LogIn.startLogIn(driver);
            login = true;

        } catch (Exception e) {
            e.printStackTrace();
            login = false;
            System.out.println("You are not registered");
            System.out.println("Go to registered");
        } finally {
            if (login) {
                System.out.println("Log In successful");
                CreateTask.CreateTask(driver);
            }
        }

    }

    @Test
    public void catchError() {
        boolean login = false;
        try {
            LogIn.starLogInError(driver);
            System.out.println("Wrong email or password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    @AfterTest
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}



