package javaUtil.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		// �ߺ� X ���� X 
		// hashSet , treeSet
		
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang"); //��ȯŸ���� boolean �̶� ���� ������� false ��ȯ
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(set1.size());
		
		Iterator<String> iter = set1.iterator();
		//���� hasNext �� return �� boolean �̶� for�� ���� while ���� ����
		//hasNext �� �ִ��� Ȯ�� �� , next�� ������ ����
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		
	}

}
