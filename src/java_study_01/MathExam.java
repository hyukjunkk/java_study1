package java_study_01;

public class MathExam {

	public static void main(String[] args) {
		// Math ���� ����� ���� Ŭ����
		// cos , sin, tan, abs(����), random
		// new �� ��ü�� ������ ���� ������ static���� ���ǰ� �Ǿ��־ ��ü ���� ���� ��� ����
		
		//�ִ� max
		int value1 = Math.max(5, 30);
		System.out.println("max = "+value1);
		//�ּڰ� min
		int value2 = Math.min(5, 30);
		System.out.println("min = " + value2);
		//���� abs
		System.out.println(Math.abs(-10));
		//0~1 ������ �������� random
		System.out.println(Math.random());
		//������ ���ϴ� �Լ� sqrt
		System.out.println(Math.sqrt(25));
		//���ϱ� (�� )
		System.out.println("2�� 10�� = " + Math.pow(2, 10));
		//
        System.out.println("16�� 1/2�� = : " + Math.pow(16, 0.5));
        //log 
        System.out.println("log200 = " + Math.log10(200));
		
	}

}
