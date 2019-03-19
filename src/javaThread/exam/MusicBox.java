package javaThread.exam;

public class MusicBox {
	//������ �޼ҵ带 ������ �ִٰ� �غ���.
	//synchronized �� �ٿ��ָ� ����ȭ �ȴ�(�� �۾��� �� ������ �����۾� ����)
	public synchronized void playMusicA() {
		for(int i = 0; i<10; i++) {
			System.out.println("�ų��� ����");
			
			
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i<10; i++) {
			System.out.println("���� ����");
			
			
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public  void playMusicC() {
		for(int i = 0; i<10; i++) {
			//�̷��� �� ��ü �� �Ѻ�ϸ� synchronized �۾��� �� ���� �ִ�(����ȭ ���)
			synchronized (this) {
				System.out.println("ī�� ����");
			}
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
