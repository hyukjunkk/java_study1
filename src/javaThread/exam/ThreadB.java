package javaThread.exam;

public class ThreadB extends Thread {
	//Thread wait study(
	
	int total;
	
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				System.out.println(i+"를 더합니다.");
				total +=1;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//쓰레드 깨우는 notify()
			notify();
		}
	}
	
}
