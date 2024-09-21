package com.ssafy.day01.a_basic;

import java.util.Random;

public class Basic_10 {
    public static void main(String[] args) {
        byFor();
        byWhile();
    }

    private static void byFor() {
        int sum = 0;
        int cnt = 100;
        double avg = 0;
        Random rand = new Random();
        // TODO: for 문장을 이용해서 cnt 만큼 주사위를 던지고 그 합과 평균(소수점 1자리)을 출력하시오.
        for (int i = 0; i < cnt; i++) {
        	int randomInt = rand.nextInt(1,7);
        	sum += randomInt; 
        }
        avg = sum / cnt;
        System.out.println(sum);
        System.out.printf("%.1f",avg);
        System.out.println();
        // END
    }

    private static void byWhile() {
        int sum = 0;
        int cnt = 100;
        double avg = 0;
        Random rand = new Random();
        // TODO: while 문장을 이용해서 cnt 만큼 주사위를 던지고 그 합과 평균(소수점 1자리)을 출력하시오.
        while (cnt > 0) {
        	cnt -= 1;
        	int randomInt2 = rand.nextInt(1,7);
        	sum += randomInt2;
        }
        cnt = 100;
        avg = sum / cnt;
        System.out.println(sum);
        System.out.printf("%.1f",avg);	
        // END
    }

}
