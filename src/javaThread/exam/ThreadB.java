package javaThread.exam;

public class ThreadB extends Thread {
	//Thread wait study(
	
	int total;
	
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				System.out.println(i+"�� ���մϴ�.");
				total +=1;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//������ ����� notify()
			notify();
		}
	}
	
}
