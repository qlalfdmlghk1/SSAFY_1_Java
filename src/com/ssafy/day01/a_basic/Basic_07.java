package com.ssafy.day01.a_basic;

public class Basic_07 {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
//        TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
        // byte b3 = b1 + b2;
        // java에서 byte, short, char 변수끼리 연산을 수행하면 int 타입으로 변환된다.
        // int 타입을 byte로 출력하려 하니 오류가 발생함
        
        // 수정 
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        int i1 = 10;
        long l1 = 20;
//        TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
        // int i2 = i1 + l1;
        // i1 + l1 은 long 타입 -> 이 것을 int에 넣으려 하면 오류 발생
        int i2 = (int) (i1 + l1);
        System.out.println(i2);

//        TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
        // float f1 = 10.0;
        // float f2 = f1 + 20.0;
        // java에서 기본적으로 실수는 double 타입으로 간주된다. 
        // -> float 타입에 double을 할당하려고 하면 오류 발생
        
        // 수정
        float f1 = 10.0f;
        float f2 = (float) (f1 + 20.0);
        System.out.println(f2);
    }
}
