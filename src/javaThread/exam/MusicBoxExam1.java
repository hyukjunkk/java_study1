package javaThread.exam;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		MusicPlayer player1 = new MusicPlayer(1, box);
		MusicPlayer player2 = new MusicPlayer(2, box);
		MusicPlayer player3 = new MusicPlayer(3, box);
		
		//synchronized 했을땐 한 작업 끝나고 실행 
		// 없을 시 각각 따로따로 실행 (겹쳤을때 위험이 없을때 사용하는것, 각각 다른작업일? 시 좀 애매모호하긴한데 서로 충돌이 일어나도 상관없을 시에 사용)
		player1.start();
		player2.start();
		player3.start();
		
	}
	
	
	
	

}
