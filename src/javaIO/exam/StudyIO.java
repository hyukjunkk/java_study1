package javaIO.exam;

import java.io.PrintWriter;

public class StudyIO {

	public static void main(String[] args) {
		
		
		System.out.println("�ȳ��ϼ���. PrintWriter�Դϴ�.");
		
		PrintWriter pw = null;
		
		
		try {
			pw = new PrintWriter("data.txt");
			String st = "�ȳ��ϼ���. PrintWriter�Դϴ�.";
			
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
