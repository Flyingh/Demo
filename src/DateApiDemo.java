import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Set;

/**
 * Created by zhujk on 14-4-1.
 */
public class DateApiDemo {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        ZoneId zoneId = ZoneId.of("America/Cuiaba");
        ZoneId zoneId1 = Clock.systemDefaultZone().getZone();
        System.out.println(zoneId.getRules());
        System.out.println(zoneId1.getRules());

        LocalTime now1 = LocalTime.now(Clock.systemDefaultZone());
        System.out.println(now1.getHour() + ":" + now1.getMinute() + ":" + now1.getSecond());
        LocalTime now2 = LocalTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println(now2.getHour() + ":" + now2.getMinute() + ":" + now2.getSecond());
        System.out.println(now1.isBefore(now2));

        System.out.println(ChronoUnit.HOURS.between(now1, now2));
        System.out.println(ChronoUnit.SECONDS.between(now2, now1));

        LocalTime localTime = LocalTime.of(23, 59, 59);
        System.out.println(localTime);
        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);

        LocalTime leetTime = LocalTime.parse("13:57", germanFormatter);
        System.out.println(leetTime);   // 13:37

        LocalTime localTime1 = LocalTime.parse("12:57", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN));
        System.out.println(localTime1);

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println(yesterday);
        LocalDate localDate = LocalDate.of(2014, Month.JULY, 4);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate date = LocalDate.parse("24.12.2014", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN));
        System.out.println(date);

        LocalDateTime localDateTime = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getLong(ChronoField.MINUTE_OF_DAY));

        System.out.println(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM-dd HH:mm:ss").withLocale(Locale.CHINA);
//        LocalDateTime dateTime = LocalDateTime.parse("2014/04-01 10:57:25");
//        System.out.println(dateTime);
//        System.out.println(formatter.format(dateTime));

    }



}
