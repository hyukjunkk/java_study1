package javaThread.exam;

public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		//thread ���۽� run() �� �ƴ� start() �� ȣ����!
		
		t1.start();
		t2.start();
		
		System.out.println("main end !");
		
	}

}
