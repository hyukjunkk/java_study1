package java_study_01;

public class WrapperExam {

	public static void main(String[] args) {
		// java.lang ��Ű���� ���� ���� ����ϴ°� , import �� ��� ���� ��� ���� .
		// �� �ȿ� �����ִ� �����δ� wrapper, Object, String, String Buffer, String builder
		// System , Math ... ���� �ִ�.
		int i = 5;
		Integer i2 = new Integer(5);
		
		Integer i3 = 5;
		// ����ڽ̴��п� �̷��� ����ص� ���� ����.
		//���� �����Ϸ��� 5 �� new Integer(5) �� ����� ����
		
		int i4 = i3.intValue();
		
		int i5 = i3;
		//�̰��� ���� ��ڽ� 
		//���������� wrapper class �� �̿��� ���������� �������
		
		Integer n1 = 5;
        int max_int = n1.MAX_VALUE;
        long n1_long = n1.longValue();
        
        System.out.println("max_int = " + max_int + ", n1_long = " + n1_long);
        
        int n2 = 5;
        Integer n3 = new Integer(n2);
        int min_int = n3.MIN_VALUE;// ���⼭ Integer�� ��ȯ ���� ���� ����.
        long n2_long = n3.longValue();
        System.out.println("min_int = " + min_int + ", n2_long = " + n2_long);
		
		
		
	}

}
