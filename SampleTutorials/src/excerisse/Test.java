package excerisse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test implements PrivateInterface {

	public static void main(String[] args) throws Exception {

		String[][] logs1 = { { "200", "user_1", "resource_5" }, { "3", "user_1", "resource_1" },
				{ "620", "user_1", "resource_1" }, { "620", "user_3", "resource_1" }, { "34", "user_6", "resource_2" },
				{ "95", "user_9", "resource_1" }, { "416", "user_6", "resource_1" },
				{ "58523", "user_3", "resource_1" }, { "53760", "user_3", "resource_3" },
				{ "58522", "user_22", "resource_1" }, { "100", "user_3", "resource_6" },
				{ "400", "user_6", "resource_2" }, };

		Map<String, int[]> userTimestampsd = userTimestampsd(logs1);
		
		for(String key:userTimestampsd.keySet()) {
			
			int[] is = userTimestampsd.get(key);
			System.out.println( key +"  ->["+ is[0] + "  , "+ is[1]+" ]");
			
		}

	}

	static Map<String, int[]> userTimestampsd(String[][] logs5) {

		Map<String, int[]> userTimestamps = new HashMap<>();

		for (String[] logEntry : logs5) {
			String user = logEntry[1];
			int timestamp = Integer.parseInt(logEntry[0]);

			if (!userTimestamps.containsKey(user)) {
				userTimestamps.put(user, new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE });
			}

			int[] timestamps = userTimestamps.get(user);
			timestamps[0] = Math.min(timestamps[0], timestamp); // Update the minimum timestamp
			timestamps[1] = Math.max(timestamps[1], timestamp); // Update the maximum timestamp
		}

		return userTimestamps;
	}
}
