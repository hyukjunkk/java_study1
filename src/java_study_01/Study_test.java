package java_study_01;

import java.util.Random;

// https://programmers.co.kr/learn/courses/9
// ���� �ǽ� �ڵ�� �׽�Ʈ �ϴ� ��� 
public class Study_test {

	
	public String randomName(){
        StringBuffer sb8 = new StringBuffer();
        String[] firstNames = {"Tod", "John", "Michael"};
        String[] lastNames = {"Smith", "Brown", "Davis"};
        
        //0~3 ������ ������ ���ڸ� ���
        int random1 = new Random().nextInt(3);
        //�����ϰ� �̸��� �̴´�.
        String firstName = firstNames[random1];
        
        
        //0~3 ������ ������ ���ڸ� ���
        int random2 = new Random().nextInt(3);
        //�����ϰ� ���� �̴´�.
        String lastName = lastNames[random2];
        
        //sb�� �̸�(fistName) ����(" ") ��(lastname) ������ append�� ������.
        //�� �޼ҵ� ü�̴��� �̿��ؾ� �մϴ�.
        String sb = sb8.append(firstName).append(" ").append(lastName).toString();
        
        
        return sb;
    }
	
	
	public static void main(String[] args) {
		
		
		
		
	}

}
