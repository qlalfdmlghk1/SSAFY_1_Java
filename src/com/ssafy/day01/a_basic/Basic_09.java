package com.ssafy.day01.a_basic;

public class Basic_09 {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
        case 1:
            System.out.println(num);
        case 2:
            System.out.println(num);
        case 3:
            System.out.println(num);
        case 4:
            System.out.println(num);
        case 5:
            break;
        case 6:
            break;
        default:
            System.out.println(num);
        }
        switchCalendar();
        switchExpression();
    }

    private static void switchCalendar() {
        System.out.println("달력 출력 1");
        int month = 2;
        int day = -1;
        // TODO: 월별 날의 수가 정확히 출력되도록 수정해보자. 단, 2월은 29일가지로 한다.
        day = switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 2 -> 29;
        default -> 30;
        };
        // END
        System.out.printf("%d월은 %d까지 있다.%n", month, day);
    }

    private static void switchExpression() {
        System.out.println("달력 출력 1");
        int month = 2;
        // TODO: 위 switchCalendar을 switchExpression 형태로 변경해보자. -> ???
        int day = -1;
        

        // END
        System.out.printf("%d월은 %d까지 있다.%n", month, day);

    }
}
