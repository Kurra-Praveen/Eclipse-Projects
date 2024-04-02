package pageObject;

import org.openqa.selenium.By;

public class WdIoFormPage {

	public static String formsPage = "accesbilityId#Forms";

	public static String inputFeild = "accesbilityId#text-input";

	public static String inputResult = "accesbilityId#input-text-result";

	public static String toogleBar = "accesbilityId#switch";

	public static String toogleText = "accesbilityId#switch-text";

	public static String dropDown = "accesbilityId#Dropdown";

	//public static By dropDownItems=By.id("com.wdiodemoapp:id/select_dialog_listview");
	//android:id/text1
	public static By dropDownItems=By.id("android:id/text1");

	public static String activeButton= "button-Active";

	public static By message = By.id("android:id/message");

	public static By quitMessagePopUp = By.id("android:id/button1");
}
