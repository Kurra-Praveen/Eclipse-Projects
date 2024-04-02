package pageObject;

import org.openqa.selenium.By;

public class FlipKartHomePage {

public	static By Languagelist_drpDwn=By.id("com.flipkart.android:id/tv_text");
	
public	static By LanguageSelection_btn=By.id("com.flipkart.android:id/select_btn");
	
public	static By SkipSignIn_arw=By.id("com.flipkart.android:id/custom_back_icon");

public static String Search_input="UiSelector().text(\"Search for products\").className(\"android.widget.TextView\")";

public static String search_text="//*[@class='android.widget.EditText']";

public static String FirstSearchSuggestion_link="(//*[@resource-id='com.flipkart.android:id/main_content']//android.widget.TextView)[1]";

public static By Location_btn=By.id("com.flipkart.android:id/not_now_button");

public static String FirstSearchProduct_link="(//*[@resource-id='com.flipkart.android:id/main_content']//android.widget.TextView)[2]";

public static String AddToCart_btn="UiSelector().text(\"Add to cart\").className(\"android.widget.TextView\")";

public static String GoToCart_btn="UiSelector().text(\"GO TO CART\").className(\"android.widget.TextView\")";
}
