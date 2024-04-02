package algoTrade.sample;

import com.angelbroking.smartapi.SmartConnect;
import com.angelbroking.smartapi.http.SessionExpiryHook;
import com.angelbroking.smartapi.models.TokenSet;
import com.angelbroking.smartapi.models.User;

public class Login {

	public static void main(String[] args) {
		String clientID ="K136197";
		String clientPass = "8530";
		String apiKey = "5I424SoO";
		String totp = "ZUYSVDBEJAI54HAPLTBE44OTWI";
		
		
		SmartConnect smartConnect=new SmartConnect();
		smartConnect.setApiKey(apiKey);
		User user = smartConnect.generateSession(clientID, clientPass, totp);
		smartConnect.setAccessToken(user.getAccessToken());
		String loginURL = smartConnect.getLoginURL();
		
		//smartConnect.setUserId(user.getUserId());

		
	}
}
