package javaIO.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		// close 사용하지 않았다면
		// try-with-resources 사용 - 사용한 자원을 자동으로 종료시켜 주는 기능
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				
				
				){
				out.writeInt(100);
				out.writeBoolean(true);
				out.writeDouble(50.5);
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
