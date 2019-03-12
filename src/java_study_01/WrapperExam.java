package java_study_01;

public class WrapperExam {

	public static void main(String[] args) {
		int i = 5;
		Integer i2 = new Integer(5);
		
		Integer i3 = 5;
		// 오토박싱덕분에 이렇게 사용해도 문제 없다.
		//실제 컴파일러는 5 를 new Integer(5) 로 사용해 쓴다
		
		int i4 = i3.intValue();
		
		int i5 = i3;
		//이것은 오토 언박싱 
		//내부적으로 wrapper class 를 이용해 내부적으로 사용해줌
		
	}

}
