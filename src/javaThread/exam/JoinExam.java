package javaThread.exam;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		
		System.out.println("시작");
		//join 을 넣으면 이 쓰레드가 끝날때까지 기다린다.
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
