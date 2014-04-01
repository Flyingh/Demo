import java.sql.Date;
import java.time.Clock;

/**
 * Created by zhujk on 14-4-1.
 */
public class ClockDemo {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
        System.out.println(clock.millis());
        System.out.println(clock.instant());
        System.out.println(Date.from(clock.instant()));
    }

}
