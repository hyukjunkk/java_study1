package javaRamda;

public class RamdaExam {
	//람다식은 java8 이후 추가된 버전
	//인터페이스중 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고함
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
		//람다식으로 표현하면
		new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("hello");
			}
		}).start();
		// 원래 객체생성해서 넣어야 하지만 
		// 쓰레드가 실행될때 쓰레드 생성자 안에 넣은게 실행되도록 할 수 있음.
		//익명메소드 , 객체를 내부적으로 만들어서 넣어주는 것
		
		//람다식 문법
		//(매개변수 목록) -> {실행문}
		//
		
		
		
		
		
	}

}
