package com.ssafy.day04.c_polymorphism;

import com.ssafy.day03.a_inheritance.person.Person;
import com.ssafy.day03.a_inheritance.person.Spider;
import com.ssafy.day03.a_inheritance.person.SpiderMan;

public class PolyTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터", new Spider(), false);
		SpiderMan sman2 = sman;
		Person person = sman;
		Object obj = sman;
		
	}

}
