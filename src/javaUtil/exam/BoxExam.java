package javaUtil.exam;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		
//		box.setObj("hello");
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
//		System.out.println(value);
		
		//제네릭을 이용하면
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		//<> 에 String  으로 지정하면 string 으로 설정되게 할 수 있다.
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();
		//이건 오토 박싱, 언박싱때문에 Integer int 쓸수있게 한다.
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		
	}

}
