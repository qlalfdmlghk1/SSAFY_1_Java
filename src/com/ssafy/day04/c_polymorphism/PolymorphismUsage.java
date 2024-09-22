package com.ssafy.day04.c_polymorphism;

import java.util.Iterator;

import com.ssafy.day03.a_inheritance.person.Person;
import com.ssafy.day03.a_inheritance.person.SpiderMan;

public class PolymorphismUsage {
    public void useObjectArray() {
        // TODO:Object []을 선언하고 다양한 객체를 저장하고 저장된 클래스 타입을 출력하세요.
    	Object [] objs = new Object[4];
    	objs[0] = "Hello";
    	objs[1] = new SpiderMan();
    	objs[2] = objs;
    	objs[3] = 1;
    	
    	for (Object obj : objs) {
			System.out.println(obj.getClass() + " : " + obj);
		}
        // END
    }

    public void useObjectParam() {
        System.out.println(1);
        System.out.println("Hello");
        System.out.println(new Person("피터"));
        System.out.println(new SpiderMan());
    }

    public static void main(String[] args) {
        PolymorphismUsage usage = new PolymorphismUsage();
        usage.useObjectArray();
        usage.useObjectParam();
    }
}
