package javaUtil.exam;

public class Box<E> {
	//제네릭 사용하기 
	//가상클래스 E 를 사용하여 사용함.
	// 
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}

}
