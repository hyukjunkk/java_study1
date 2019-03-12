package javaUtil.exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// list - 가장 많이 사용되는 자료구조 중 하나
		// 순서있는 자료구조 저장공간도 늘어남 , 중복도 허용
		
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		
		
	}

}
