package javaThread.exam;

public class StudyThread {

	public static void main(String[] args) {
		StudyThread2 thread = new StudyThread2("*");
        thread.start();
        
        System.out.println("main의 마지막 코드 입니다. main이 종료하더라도 thread는 계속 동작할 수 있습니다.");
    }
	}


