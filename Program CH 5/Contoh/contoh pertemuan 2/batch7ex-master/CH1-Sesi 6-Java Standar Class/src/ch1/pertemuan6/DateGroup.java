package ch1.pertemuan6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateGroup {
    public static void main(String[] args) {
        Date dateCurrent = new Date();
        System.out.println("current Date ="+dateCurrent);
        //Fri Mar 15 21:33:35 WIB 2024
        /*
        standarisasi
        YYYY-MM-DD HH:mm:ss
         */
        SimpleDateFormat sdf = new SimpleDateFormat("YY-MMM-dd HH:mm:ss");
        String formattedDate = sdf.format(dateCurrent);
        System.out.println("Tanggal " + formattedDate);
// UTC +7
        // Contoh penggunaan kelas Calendar
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Bulan dimulai dari 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current Date (using Calendar): " + day + "/" + month + "/" + year);

        // Contoh penggunaan kelas TimeZone
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("Default Timezone: " + timeZone.getID());

        // Contoh penggunaan kelas LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date (using LocalDate): " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);

        LocalDateTime ld = LocalDateTime.now();
        System.out.println("localTime: " + ld);

    }
}
