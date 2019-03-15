package javaIO.exam;

import java.io.PrintWriter;

public class StudyIO {

	public static void main(String[] args) {
		
		
		System.out.println("안녕하세요. PrintWriter입니다.");
		
		PrintWriter pw = null;
		
		
		try {
			pw = new PrintWriter("data.txt");
			String st = "안녕하세요. PrintWriter입니다.";
			
			pw.println(st);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}}
