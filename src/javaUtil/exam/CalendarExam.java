package javaUtil.exam;

import java.util.Calendar;

public class CalendarExam {
	
	public static void main(String[] args) {
		//date 는 지역화 고려가 안되있어서 만들어졌다
		// 많은 상수값들을 가지고 있다.
		// Calendar 은 추상클래스
		// Gregorian Calendar 에서 들고오는것
		// 새로운 형식의 표준이 될 수 있으니 고려해서 만들었다고 합니다..
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		//여기서 month 는 주의+1을 해야댐
		System.out.println(cal.get(Calendar.MONTH)+1);
		//
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));

		cal.add(Calendar.HOUR, 5);
		System.out.println(cal.get(Calendar.YEAR));
		//여기서 month 는 주의+1을 해야댐
		System.out.println(cal.get(Calendar.MONTH)+1);
		//
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		
		
		
	}
	
}
