package javaThread.exam;

public class DaemonThread implements Runnable {
	//Daemon �̶� ������, ���н� �迭�� �ü������ ��׶���� �����ϴ� ���α׷��� ����.
	//window �迭���� service ��� �� . 
	// Daemon Thread �� ��׶��忡�� �����ֱ�� �ڵ������̳�, ���� ���ݸ��� ����� �˻��簡 �� �� ����.
	//�Ϲ� �����尡 ��� ����Ǹ� ���������� ����Ǵ� Ư¡�� ����.
	
	@Override
	public void run() {
		while(true) {
			System.out.println("���� �����尡 ���� �� �Դϴ�.");
			
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
		
		//main �� �� �������°��� ����� ��!
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����尡 ���� �˴ϴ�.");
		
	}
	
}
