package com.ssafy.day03.a_inheritance.person;

public class SpiderMan extends Person{  // Person이 SpiderMan의 조상임
	
	Spider spider = new Spider();  // has a

	boolean isSpider;
	
	public SpiderMan() {
		this("피터파커");
	}
	
	SpiderMan(String name) {
		super(name);
	}
	
	public SpiderMan(String name, Spider spider, boolean isSpider) {
		super(name);
		this.spider = spider;
		this.isSpider = isSpider;
	}
	
	void fireWeb() {
		if (this.isSpider) {
			this.spider.fireWeb();
		} else {
			System.out.println("사람은 못 쏨!");
		}
	}
	
	// cf) 오버로딩 (함수명은 같지만 파라미터를 더(덜) load함)
	void jump(int cm) {
		System.out.println(cm + "까지 jump");
	}
	
	@Override
	// 메소드 오버라이드 (함수명, 파라미터 개수 같아야 함 - 덮어 쓰는 것)
	public void jump() {
		if (isSpider) {
			spider.jump();
		} else {
//			System.out.println("폴짝");
			super.jump();
		}
	}
}
