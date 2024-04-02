package reusable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {

	public static String dateTimeFormat() {

		DateFormat custom = new SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss");

		Date date = new Date();

		return custom.format(date);
	}
}
