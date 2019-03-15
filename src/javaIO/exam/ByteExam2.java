package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		//
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		try {
			fis = new FileInputStream("src/javaIO/exam/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			//512byte 만큼 읽어들이게 만들기
			byte[] buffer = new byte[512];
			
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, readCount);
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Long endTime = System.currentTimeMillis();
		
		
		System.out.println(endTime-startTime);// 속도가 훨씬 빠르다
		
		//전달할때 512바이트씩 단위로 읽어오기때문에 512씩 전달하는게 성능상 우수하다
		
		
	}

}
