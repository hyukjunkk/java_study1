package javaThread.exam;

public class StudyThread {

	public static void main(String[] args) {
		StudyThread2 thread = new StudyThread2("*");
        thread.start();
        
        System.out.println("main�� ������ �ڵ� �Դϴ�. main�� �����ϴ��� thread�� ��� ������ �� �ֽ��ϴ�.");
    }
	
	
	/*
	 	���μ��� �� �������..
	 	
	 	Thread �� �����Ű��(start()) Runnable ���¿� Running ���¸� �Դ� ���� �ϰ� �ȴ�.
	 	sleep(), wait() �� �����Ű�� �� ����, ������ � �� ������ �װ͵��� ��������
	 	wait ���¿��� notify()�ϸ� Runnable ���·� �������´� 
	 	�׸��� wait() �� ȣ���� �Ǹ� monitoring lock �� ���� �ȴ�	�׷��� ������� �ٸ� �޼ҵ尡 ����ǰ� ��
	 	������ü�� ��ũ�γ����� ����̳� �޼ҵ尡 �ٸ� �����尡 monitoring lock �� ȹ�� �� �����̸� �� Blocked �� ����
	 	�������� run �޼ҵ尡 ����Ǹ� ������� ����ȴ�.(Dead ����)
	 	
	 	yield()�� ȣ��Ǹ� �ش� ������� �ٸ� �����忡�� �ڿ��� �纸�ϰ� ��, �� �ٸ� �����尡 �� �� ������ �����
	 	
	 	�����尡 ���� join �� �̿��ϸ� �ش� ��ü�� ���������� �����.
	 	
	 	
	 
	 
	 
	 */
	
	
	
	
	}


