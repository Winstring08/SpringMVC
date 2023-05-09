package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //원격으로 호출 가능한 프로그램으로 등록
public class Hello {
	int iv = 10;
	static int cv = 20;
	//URL과 메서드를 연결
	@RequestMapping("/hello")
	public void main() { //인스턴스 메서드는 iv와 cv를 둘다 사용 가능
		System.out.println("Hello");
		System.out.println(iv);
		System.out.println(cv);
	}
	
	@RequestMapping("/hello2")
	public static void main2() { //스태틱 메서드는 cv만 사용 가능
		//System.out.println(iv); 불가능
		System.out.println(cv);
	}
	
	@RequestMapping("/hello")
	//RequestMapping이 있으면 접근제어자에 상관없이 호출 가능
	private void main3() { //인스턴스 메서드는 iv와 cv를 둘다 사용 가능
		System.out.println("Hello-private");
		System.out.println(iv);
		System.out.println(cv);
	}
	
	/* 주소창에 http://localhost:8080/ch2/hello 입력시
	 * main메서드를 원격으로 실행한다
	 * 이 경우 콘솔에 Hello를 띄워줌
	 * 
	 * 그런데 인스턴스 메서드가 왜 객체생성없이 실행된걸까?
	 * url로 원격프로그램을 호출하면 톰캣이 객체생성을 해주기 때문
	 * 누군가 객체생성을 대신 해준다는 것이 중요
	 * */
}
