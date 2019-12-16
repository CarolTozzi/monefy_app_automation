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
public class addIncomeTest {

    public static void addIncome(AndroidDriver<AndroidElement> driver) {

        MobileElement addExpense = driver.findElementById("com.monefy.app.lite:id/income_button");
        addExpense.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.monefy.app.lite:id/amount_text")));

        MobileElement valueField = driver.findElementById("com.monefy.app.lite:id/amount_text");
        valueField.click();

        MobileElement number5 = driver.findElementById("com.monefy.app.lite:id/buttonKeyboard9");
        number5.click();

        MobileElement addNoteField = driver.findElementById("com.monefy.app.lite:id/textViewNote");
        addNoteField.click();
        addNoteField.sendKeys("Income");
        valueField.click();

        MobileElement chooseCategoryButton = driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory");
        chooseCategoryButton.click();

        MobileElement selectCategory = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout");
        selectCategory.click();

        MobileElement balanceField = driver.findElementById("com.monefy.app.lite:id/balance_amount");
        Assert.that(balanceField.getText().equalsIgnoreCase("Balance $4.00"), "Income was added correctly");

    }
}
