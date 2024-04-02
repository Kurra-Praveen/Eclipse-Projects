package pageObject;

public class SamplePage {

public	static String Languagelist_drpDwn="id#com.flipkart.android:id/tv_text";
	
public	static String LanguageSelection_btn="id#com.flipkart.android:id/select_btn";
	
public	static String SkipSignIn_arw="id#com.flipkart.android:id/custom_back_icon";

public static String Search_input="UIAutomator#UiSelector().text(\"Search for products\").className(\"android.widget.TextView\")";

public static String search_text="xpath#//*[@class='android.widget.EditText']";

public static String FirstSearchSuggestion_link="xpath#(//*[@resource-id='com.flipkart.android:id/main_content']//android.widget.TextView)[1]";

public static String Location_btn="id#com.flipkart.android:id/not_now_button";

public static String FirstSearchProduct_link="xpath#(//*[@resource-id='com.flipkart.android:id/main_content']//android.widget.TextView)[2]";

public static String AddToCart_btn="UIAutomator#UiSelector().text(\"Add to cart\").className(\"android.widget.TextView\")";

public static String GoToCart_btn="UIAutomator#UiSelector().text(\"GO tO cart\").className(\"android.widget.TextView\")";




}
