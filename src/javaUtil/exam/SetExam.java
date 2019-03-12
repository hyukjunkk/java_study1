package javaUtil.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		// 중복 X 순서 X 
		// hashSet , treeSet
		
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang"); //반환타입이 boolean 이라 값이 있을경우 false 반환
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(set1.size());
		
		Iterator<String> iter = set1.iterator();
		//보통 hasNext 에 return 이 boolean 이라 for문 보다 while 문이 좋다
		//hasNext 로 있는지 확인 후 , next로 꺼내는 구문
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		
	}

}
