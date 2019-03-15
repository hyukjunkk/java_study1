package javaUtil.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");// a 는 오전오후 zzz는 타임위치
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime());
		
		//시스템 현제시간
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today - date.getTime());
		
		
	}

}
