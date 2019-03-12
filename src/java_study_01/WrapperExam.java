package java_study_01;

public class WrapperExam {

	public static void main(String[] args) {
		// java.lang 패키지는 제일 많이 사용하는것 , import 즉 상속 없이 사용 가능 .
		// 그 안에 속해있는 것으로는 wrapper, Object, String, String Buffer, String builder
		// System , Math ... 등이 있다.
		int i = 5;
		Integer i2 = new Integer(5);
		
		Integer i3 = 5;
		// 오토박싱덕분에 이렇게 사용해도 문제 없다.
		//실제 컴파일러는 5 를 new Integer(5) 로 사용해 쓴다
		
		int i4 = i3.intValue();
		
		int i5 = i3;
		//이것은 오토 언박싱 
		//내부적으로 wrapper class 를 이용해 내부적으로 사용해줌
		
		Integer n1 = 5;
        int max_int = n1.MAX_VALUE;
        long n1_long = n1.longValue();
        
        System.out.println("max_int = " + max_int + ", n1_long = " + n1_long);
        
        int n2 = 5;
        Integer n3 = new Integer(n2);
        int min_int = n3.MIN_VALUE;// 여기서 Integer로 변환 없이 쓸순 없다.
        long n2_long = n3.longValue();
        System.out.println("min_int = " + min_int + ", n2_long = " + n2_long);
		
		
		
	}

}
