package javaThread.exam;

public class StudyThread2 extends Thread {
	
	String str;
    public StudyThread2(String str){
        this.str = str;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.print(str);
        } 
    } 
}
