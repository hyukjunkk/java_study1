package javaUtil.exam;

public class Box<E> {
	//���׸� ����ϱ� 
	//����Ŭ���� E �� ����Ͽ� �����.
	// 
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}

}
