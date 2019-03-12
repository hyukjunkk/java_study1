package java_study_01;

public class MathExam {

	public static void main(String[] args) {
		// Math 수학 계산을 위한 클래스
		// cos , sin, tan, abs(절댓값), random
		// new 로 객체를 생성할 수는 없지만 static으로 정의가 되어있어서 객체 정의 없이 사용 가능
		
		//최댓값 max
		int value1 = Math.max(5, 30);
		System.out.println("max = "+value1);
		//최솟값 min
		int value2 = Math.min(5, 30);
		System.out.println("min = " + value2);
		//절댓값 abs
		System.out.println(Math.abs(-10));
		//0~1 사이의 랜덤숫자 random
		System.out.println(Math.random());
		//제곱근 구하는 함수 sqrt
		System.out.println(Math.sqrt(25));
		//곱하기 (승 )
		System.out.println("2의 10승 = " + Math.pow(2, 10));
		//
        System.out.println("16의 1/2승 = : " + Math.pow(16, 0.5));
        //log 
        System.out.println("log200 = " + Math.log10(200));
		
	}

}
