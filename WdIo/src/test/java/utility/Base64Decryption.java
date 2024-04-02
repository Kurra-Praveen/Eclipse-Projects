package utility;

import java.util.Base64;

public class Base64Decryption {

	public static String getDecryptedValue(String encryptedValue) {
			
		byte []encryptedBytes=encryptedValue.getBytes();
		
		byte[]decryptedValue=  Base64.getDecoder().decode(encryptedBytes);
		
		return new String(decryptedValue);
	}
}
