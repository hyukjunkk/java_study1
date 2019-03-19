package javaThread.exam;

public class MusicBox {
	//세개의 메소드를 가지고 있다고 해보자.
	//synchronized 를 붙여주면 동기화 된다(한 작업이 다 끝나고 다음작업 실행)
	public synchronized void playMusicA() {
		for(int i = 0; i<10; i++) {
			System.out.println("신나는 음악");
			
			
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i<10; i++) {
			System.out.println("슬픈 음악");
			
			
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public  void playMusicC() {
		for(int i = 0; i<10; i++) {
			//이렇게 한 객체 내 한블록만 synchronized 작업도 할 수도 있다(동기화 블록)
			synchronized (this) {
				System.out.println("카페 음악");
			}
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
