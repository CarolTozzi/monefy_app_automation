import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by ctozzi on 15/12/19.
 */
public class deleteExpenseTest {

    public static void deleteExpense(AndroidDriver<AndroidElement> driver) {

        MobileElement balanceField = driver.findElementById("com.monefy.app.lite:id/balance_amount");
        balanceField.click();

        MobileElement selectCategory = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]");
        selectCategory.click();

        MobileElement selectRecord = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout");
        selectRecord.click();

        MobileElement deleteButton = driver.findElementById("com.monefy.app.lite:id/delete");
        deleteButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.monefy.app.lite:id/balance_amount")));

        Assert.that(balanceField.getText().equalsIgnoreCase("Balance $9.00"), "Expense was deleted correctly");

    }
}
