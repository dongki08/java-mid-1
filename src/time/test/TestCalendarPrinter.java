package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = scan.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = scan.nextInt();

        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstMonth = LocalDate.of(year, month, 1);
        LocalDate nextMonth = firstMonth.plusMonths(1);

        int week = firstMonth.getDayOfWeek().getValue() % 7;

        System.out.println(year + "년 " + month + "월");
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < week; i++) {
            System.out.print("   ");
        }
        LocalDate calender = firstMonth;
        while (calender.isBefore(nextMonth)) {
            System.out.printf("%2d ", calender.getDayOfMonth());
            if(calender.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            calender = calender.plusDays(1);
        }
    }
}
