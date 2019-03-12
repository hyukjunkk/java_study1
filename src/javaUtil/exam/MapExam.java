package javaUtil.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		//key , value 를 쌍으로 저장하는 자료구조
		
		Map<String, String> map = new HashMap<>();
		
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang");//같은 키로 들어왔을때는 새로 들어온 value 로 바뀐다.
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		System.out.println(map.get("003"));
		
		//다 꺼내보기
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			
			System.out.println(key + ":" + value);
		}
		
	}

}
