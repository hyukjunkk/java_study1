package javaThread.exam;

public class StudyThread {

	public static void main(String[] args) {
		StudyThread2 thread = new StudyThread2("*");
        thread.start();
        
        System.out.println("main�� ������ �ڵ� �Դϴ�. main�� �����ϴ��� thread�� ��� ������ �� �ֽ��ϴ�.");
    }
	}


