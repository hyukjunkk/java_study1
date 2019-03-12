package java_study_01;

import java.util.Random;

public class StringBufferExam {
	
	
	

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		// ���� ���� ��� this �� ȣ���ϱ⶧����  �ΰ��� ���� ���� ���´�.
		//�޼ҵ� ü�̴� method chaining
		/*
		 * ��ü�� ���������� �޼��带 ȣ���� �� �ֵ��� �ϴ� ����.

			-> �������� ������ ������ ��, ���������� ������ ��ȯ ���� ������ �Ҵ��� �� ���� �۾��� �� �ʿ䰡 ���� ������,
			      ȣ���� ���� �ٿ� ���� �ɰ��� �ʾƵ� �ȴ�.
		  
		 * ü�̴� ������ ����

			- �ڵ差�� �ش�. �ڵ尡 ������ ���� �ϳ��� ����ó�� ������ �� �� �ִ�.

			- �Լ��� �ɰ��� ����� �����ϰ� �ȴ�. �ʹ� ���� ���� ó���ϴ� �Լ��� �ƴ�, �� �� �۰� Ưȭ�� �Լ��� ����� �ȴ�.
			  (��������δ� �̷� ����� ���� ���������� ���� �ȴ�.)

		 * ü�̴� ������ ����

			- ������ϱ� ��ƴ�. (�ڵ��� ��� ���ο��� ������ �߻��ߴ��� �˾� ������, �� ���ο��� �����ϴ� ���� �ʹ� ���� �� �ֱ� ���� - ������� ����)
			    �������� �޼��� �� �ϳ��� �����ϸ�, ������ �޼��尡 ��� ������ �˾Ƴ��Ⱑ ��ƴ�.
		 */
				
				
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
		
		
		/*
		StringBuffer�� �޼ҵ�ü�̴׿� ���� �˾ƺ��� ������ �ذ��� ���ô�.

		StringBuffer�� ������ �ִ� �޼ҵ� ���� ��κ� �ڱ� �ڽ�, this�� ��ȯ�մϴ�. ������ �ڱ� �ڽ��� �޼ҵ带 ȣ���Ͽ� �ڱ� �ڽ��� ���� �ٲ㳪�� �� �ֽ��ϴ�. �̷��� ����� �޼ҵ�ü�̴� �̶�� �մϴ�.
		StringBuffer sb = new StringBuffer();
		sb.append("hello");      // �ش� ��Ʈ�� ���ۿ� "hello", ����, "world"�� ���ʴ�� �߰�
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();  // StringBuffer�� toString()�޼ҵ带 �̿��Ͽ� ��ȯ
		�� �ټ� ���� �޼ҵ�ü�̴��� �̿��ϸ� �� �ٷ� ������ �� �ֽ��ϴ�.
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString(
		 */
		
		
	}

}
