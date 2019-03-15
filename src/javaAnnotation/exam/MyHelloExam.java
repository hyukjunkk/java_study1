package javaAnnotation.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		HelloExam hello = new HelloExam();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");//해당 인스터스를 만들때 클래스 정보를 리턴,
																		//getDeclaredMethod 그리고 hello 메소드에대한 정보를 구해라
			if(method.isAnnotationPresent(Count100.class)) {
				//특정 어노테이션이 메소드에 적용 되어있는지 확인하는 것.
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
