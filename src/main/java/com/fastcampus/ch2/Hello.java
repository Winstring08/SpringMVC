package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //�������� ȣ�� ������ ���α׷����� ���
public class Hello {
	int iv = 10;
	static int cv = 20;
	//URL�� �޼��带 ����
	@RequestMapping("/hello")
	public void main() { //�ν��Ͻ� �޼���� iv�� cv�� �Ѵ� ��� ����
		System.out.println("Hello");
		System.out.println(iv);
		System.out.println(cv);
	}
	
	@RequestMapping("/hello2")
	public static void main2() { //����ƽ �޼���� cv�� ��� ����
		//System.out.println(iv); �Ұ���
		System.out.println(cv);
	}
	
	@RequestMapping("/hello")
	//RequestMapping�� ������ ���������ڿ� ������� ȣ�� ����
	private void main3() { //�ν��Ͻ� �޼���� iv�� cv�� �Ѵ� ��� ����
		System.out.println("Hello-private");
		System.out.println(iv);
		System.out.println(cv);
	}
	
	/* �ּ�â�� http://localhost:8080/ch2/hello �Է½�
	 * main�޼��带 �������� �����Ѵ�
	 * �� ��� �ֿܼ� Hello�� �����
	 * 
	 * �׷��� �ν��Ͻ� �޼��尡 �� ��ü�������� ����Ȱɱ�?
	 * url�� �������α׷��� ȣ���ϸ� ��Ĺ�� ��ü������ ���ֱ� ����
	 * ������ ��ü������ ��� ���شٴ� ���� �߿�
	 * */
}
