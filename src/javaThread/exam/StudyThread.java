package javaThread.exam;

public class StudyThread {

	public static void main(String[] args) {
		StudyThread2 thread = new StudyThread2("*");
        thread.start();
        
        System.out.println("main의 마지막 코드 입니다. main이 종료하더라도 thread는 계속 동작할 수 있습니다.");
    }
	
	
	/*
	 	프로세스 내 쓰래드들..
	 	
	 	Thread 를 실행시키면(start()) Runnable 상태와 Running 상태를 왔다 갔다 하게 된다.
	 	sleep(), wait() 를 실행시키면 블럭 상태, 나머지 몇개 더 있지만 그것들은 쓰지말자
	 	wait 상태에서 notify()하면 Runnable 상태로 빠져나온다 
	 	그리고 wait() 가 호출이 되면 monitoring lock 을 놓게 된다	그래서 대기중인 다른 메소드가 실행되게 됨
	 	공유객체의 씽크로나이즈 블록이나 메소드가 다른 쓰레드가 monitoring lock 을 획득 한 상태이면 다 Blocked 된 상태
	 	쓰레드의 run 메소드가 종료되면 쓰레드는 종료된다.(Dead 상태)
	 	
	 	yield()가 호출되면 해당 쓰레드는 다른 쓰레드에게 자원을 양보하게 됨, 즉 다른 쓰레드가 좀 더 빠르게 실행됨
	 	
	 	쓰레드가 가진 join 을 이용하면 해당 객체가 끝날때까지 대기함.
	 	
	 	
	 
	 
	 
	 */
	
	
	
	
	}


