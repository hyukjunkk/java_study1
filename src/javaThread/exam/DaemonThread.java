package javaThread.exam;

public class DaemonThread implements Runnable {
	//Daemon 이란 리눅스, 유닉스 계열의 운영체제에서 백그라운드로 동작하는 프로그램을 말함.
	//window 계열에선 service 라고 함 . 
	// Daemon Thread 는 백그라운드에서 일정주기로 자동저장이나, 일정 간격마다 맞춤법 검사라든가 할 수 있음.
	//일반 쓰레드가 모두 종료되면 강제적으로 종료되는 특징이 있음.
	
	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행 중 입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);
		thread.start();
		
		//main 도 한 쓰레드라는것을 기억할 것!
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료 됩니다.");
		
	}
	
}
