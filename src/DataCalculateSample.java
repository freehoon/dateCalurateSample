import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataCalculateSample {
    public static void main(String[] args) {
        Date date = new Date();


        SimpleDateFormat transFormat = new SimpleDateFormat("yyyyMMdd");

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        Date max = c.getTime();
        String maxDate = transFormat.format(max);
        System.out.println("maxDate : " + maxDate);

        //c.setTime(date);  // 이건 왜 있는거지??
        c.add(Calendar.DATE, -6);
        Date min = c.getTime();
        String minDate = transFormat.format(min);
        System.out.println("minDate : " + minDate);
    }
}
