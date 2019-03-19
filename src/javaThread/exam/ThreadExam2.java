package javaThread.exam;

public class ThreadExam2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("_");
		
		//mythread2 는 start을 바로쓸수 없기때문에
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		
		thread1.start();
		thread2.start();
		System.out.println("main end");
		
		
		
	}

}
