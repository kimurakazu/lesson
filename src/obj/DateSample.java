package obj;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		Date d2 = new Date(1588913315419L);
		System.out.println(d2);

		Calendar c = Calendar.getInstance();
		c.set(2010,1,10);
		Date d3 = c.getTime();
		System.out.println(d3);

		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");

		Date d4 = new Date();
		c.set(2020,5,1);
		d4 = c.getTime();
		System.out.println();

		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(d4));
		
		SimpleDateFormat f1 = new SimpleDateFormat("HH時mm分ss秒");
		System.out.println(f1.format(d));
	}

}
