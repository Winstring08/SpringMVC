package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class ReflactionEx {
	/* ReflactionAPI 
	 * 클래스 정보를 얻고 다룰 수 있는 강력한 기능 제공
	 * java.lang.reflect 패키지
	 * */
	public static void main(String[] args) throws Exception {
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		//이름이 "com.fastcampus.ch2.Hello"인 클래스 정보 객체를 얻어옴
		Hello hello = (Hello)helloClass.newInstance();
		//Class객체가 가진 정보로 Hello객체 생성(Object 타입이므로 형변환)
		Method main3 = helloClass.getDeclaredMethod("main3");
		//Hello클래스의 메서드중 이름이 main3인 메서드를 얻어옴
		main3.invoke(hello);
		//hello.main3();
	}
}
