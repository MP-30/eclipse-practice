package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time {
	private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
