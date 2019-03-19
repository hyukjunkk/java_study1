package javaThread.exam;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		//b 쓰레드 실행
		b.start();
		
		//내부적으론 wait를 만나서 잠들어 있는 상태고 다 끝났을때 notify를 호출하면 깨어남
		synchronized (b) {
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is :" + b.total);
		}
	}

}
