import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ctozzi on 15/12/19.
 */
public class ExpenseManagement {

    @Test
    public void expenseManagement() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "Android");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("app", "/Users/ctozzi/Downloads/monefy.apk");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4724/wd/hub"), dc);

        addExpenseTest.addExpense(driver);
        addIncomeTest.addIncome(driver);
        deleteExpenseTest.deleteExpense(driver);
    }
}
