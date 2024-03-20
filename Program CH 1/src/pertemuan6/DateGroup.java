package pertemuan6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGroup {
    public static void main(String[] args) {
        Date dateCurrent = new Date();
        System.out.println("current Date = " + dateCurrent);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();

        String formattedDate = sdf.format(date);

        System.out.println("Tanggal dan Waktu: " + formattedDate);
    }
}
