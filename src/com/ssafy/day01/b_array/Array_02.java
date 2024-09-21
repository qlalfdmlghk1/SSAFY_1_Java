package com.ssafy.day01.b_array;

import java.util.Arrays;

public class Array_02 {
    public static void main(String[] args) {

        String org = "1234567890";
        // TODO: String "1234567890" 의 각 문자를 char [] 과 int[]에 저장하고 출력하시오.
        char [] charArray = new char[org.length()];
        int [] intArray = new int[org.length()];
        
        for (int i = 0; i < org.length(); i++) {
        	charArray[i] = org.charAt(i);
        	intArray[i] = org.charAt(i);
        }
        
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(intArray));
        // END
    }
}
