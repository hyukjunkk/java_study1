package java_study_01;

public class WrapperExam {

	public static void main(String[] args) {
		int i = 5;
		Integer i2 = new Integer(5);
		
		Integer i3 = 5;
		// ����ڽ̴��п� �̷��� ����ص� ���� ����.
		//���� �����Ϸ��� 5 �� new Integer(5) �� ����� ����
		
		int i4 = i3.intValue();
		
		int i5 = i3;
		//�̰��� ���� ��ڽ� 
		//���������� wrapper class �� �̿��� ���������� �������
		
	}

}
