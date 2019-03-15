package javaAnnotation.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		HelloExam hello = new HelloExam();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");//�ش� �ν��ͽ��� ���鶧 Ŭ���� ������ ����,
																		//getDeclaredMethod �׸��� hello �޼ҵ忡���� ������ ���ض�
			if(method.isAnnotationPresent(Count100.class)) {
				//Ư�� ������̼��� �޼ҵ忡 ���� �Ǿ��ִ��� Ȯ���ϴ� ��.
				for(int i = 0; i<100; i++) {
					hello.hello();
				}
			}else {
				hello.hello();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
