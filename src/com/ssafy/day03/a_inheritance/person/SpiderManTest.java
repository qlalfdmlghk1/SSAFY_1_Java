package com.ssafy.day03.a_inheritance.person;

public class SpiderManTest {

    public static void main(String[] args) {
        // TODO:  SpiderMan 객체를 만들고 기능 사용해보자.
    	SpiderMan sman = new SpiderMan();  // 기본 생성자 부름
    	sman.isSpider = true;
    	sman.fireWeb();
    	sman.eat();
    	sman.jump();
    	
        // END
    }
}
