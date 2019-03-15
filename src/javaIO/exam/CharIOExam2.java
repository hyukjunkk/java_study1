package javaIO.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam2 {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			 br = new BufferedReader(new FileReader("src/javaIO/exam/CharIOExam2.java"));
			 pw = new PrintWriter(new FileWriter("test.txt"));
			 //pw = new PrintWriter("test.text");
			 String line = null;
			 while((line = br.readLine()) != null) {
				 pw.println(line);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}//�ݵ�� �ݾ���� �Ѵ�.
		finally {
			try {
				pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}