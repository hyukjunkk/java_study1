package javaUtil.exam;

import java.util.Calendar;

public class StudyUtil {
	
	//java.util�� ���� �ι�° �� ���� ����ϴ� ��.
	// �ڷᱸ�� ���� ,  �÷��� �����ӿ�ũ �������̽��� , ��¥,date ��
	//calendar , list set collection map � 
	// java api���� Ȯ�� ����  java util ��Ű�� �ȿ��� Ȯ��
	
	
	// �÷��� ������ ��ũ - �ڷᱸ�� �����ӿ�ũ
	// Collection interface - ���⿡ �ڷᰡ �ִ� �ϰ� ǥ��
	// �ߺ����, ������ ������ 
	
	// add(Object) : boolean �߰�, iterator() : iterator �ڷᲨ����, size() : int �ڷ�� ��
	// ������ ��� ���ϱ⶧���� Iterator interface ����
	// hasNext() :boolean ������ �ִ��� Ȯ��, next(): Object ������ ��
	
	// Set interface - Collection interface ��� 
	// add(Object) : boolean �����ڷ��� ������ false ������ true
	
	// List interface- �������
	// get(int) :Object - ��ȣ , 
	
	// Map interface - - key, value ������ key���� ������ value ã�� �� �ְ� ���� , key�� �ߺ��ȵ�
	// get(Object) : Object - key ������ value ��ȯ, keySet() : Set  - map �� �ִ� Ű�� �� �о�� �� ����,
	// Put(Object, Object) : void - key, value �ִ°�
	
	// �ؿ��� Arraylist, hashSet, hashMap ���� �ִ�.
	
	public static void main(String[] args) {
		
	Calendar cd = Calendar.getInstance();
	
	
	
	cd.add(Calendar.DATE, 100);
	
	System.out.println(cd.get(Calendar.YEAR) +"��" + (cd.get(Calendar.MONTH)+1) + "��" +cd.get(Calendar.DAY_OF_MONTH)+"��");
	
	
	}
	
	
}
