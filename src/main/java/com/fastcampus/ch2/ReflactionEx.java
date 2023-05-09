package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class ReflactionEx {
	/* ReflactionAPI 
	 * Ŭ���� ������ ��� �ٷ� �� �ִ� ������ ��� ����
	 * java.lang.reflect ��Ű��
	 * */
	public static void main(String[] args) throws Exception {
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		//�̸��� "com.fastcampus.ch2.Hello"�� Ŭ���� ���� ��ü�� ����
		Hello hello = (Hello)helloClass.newInstance();
		//Class��ü�� ���� ������ Hello��ü ����(Object Ÿ���̹Ƿ� ����ȯ)
		Method main3 = helloClass.getDeclaredMethod("main3");
		//HelloŬ������ �޼����� �̸��� main3�� �޼��带 ����
		main3.invoke(hello);
		//hello.main3();
	}
}
