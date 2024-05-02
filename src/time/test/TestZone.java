package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
//        ZonedDateTime.of(LocalDate.of(2024, 1, 1).)

        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoulDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonDateTime1 = seoulDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime americaDateTime = seoulDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 = " + seoulDateTime);
        System.out.println("런던의 회의 시간 = " + londonDateTime1);
        System.out.println("뉴욕의 회의 시간 = " + americaDateTime);
    }
}
