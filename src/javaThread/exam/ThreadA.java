package javaThread.exam;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		//b ������ ����
		b.start();
		
		//���������� wait�� ������ ���� �ִ� ���°� �� �������� notify�� ȣ���ϸ� ���
		synchronized (b) {
			try {
				System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is :" + b.total);
		}
	}

}