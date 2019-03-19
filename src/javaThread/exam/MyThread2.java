package javaThread.exam;

public class MyThread2 implements Runnable {
	//쓰레드 구현하는 또 다른 방법 runnable 인터페이스 추가 
	//자바는 단일 상속을 지원하기때문에 인터페이스 식으로도 지원.
	
	
	String	str;
	public MyThread2(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep(((int)Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
