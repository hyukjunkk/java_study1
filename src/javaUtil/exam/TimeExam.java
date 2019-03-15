package javaUtil.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		//java SE 8 부터 date, Time Api 새롭게 디자인됬음
		//같은 메소드 of 메소드
		//다른타입은 from
		LocalDateTime timePoint = LocalDateTime.now();//현재 날짜, 시간
		System.out.println(timePoint);
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		Month month = timePoint.getMonth();//date 하곤 다르게 +1을 안해도 된다.
		System.out.println(timePoint.getMonth());
		System.out.println(month.getValue());
		System.out.println(timePoint.getHour());
		
		LocalDateTime nowTime = LocalDateTime.now();
//		LocalDate date = nowTime.toLocalDate();
		
		
		System.out.println(nowTime.getMonth());
		
		
		
		
	}

}
