package javaRamda;

public class RamdaExam {
	//���ٽ��� java8 ���� �߰��� ����
	//�������̽��� �޼ҵ带 �ϳ��� ������ �ִ� �������̽��� �Լ��� �������̽������
	public static void main(String[] args) {
		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0; i<10; i++) {
//					System.out.println("hello");
//				}
//			}
//		}).start();
		//���ٽ����� ǥ���ϸ�
		new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("hello");
			}
		}).start();
		// ���� ��ü�����ؼ� �־�� ������ 
		// �����尡 ����ɶ� ������ ������ �ȿ� ������ ����ǵ��� �� �� ����.
		//�͸�޼ҵ� , ��ü�� ���������� ���� �־��ִ� ��
		
		//���ٽ� ����
		//(�Ű����� ���) -> {���๮}
		//
		
		
		
		
		
	}

}
