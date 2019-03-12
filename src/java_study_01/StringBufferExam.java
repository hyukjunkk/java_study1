package java_study_01;

import java.util.Random;

public class StringBufferExam {
	
	
	

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		// 값이 없을 경우 this 를 호출하기때문에  두개의 값이 같게 나온다.
		//메소드 체이닝 method chaining
		/*
		 * 객체에 연쇄적으로 메서드를 호출할 수 있도록 하는 패턴.

			-> 여러가지 동작을 수행할 때, 먼저수행한 동작의 반환 값을 변수에 할당한 후 다음 작업을 할 필요가 없기 때문에,
			      호출을 여러 줄에 걸쳐 쪼개지 않아도 된다.
		  
		 * 체이닝 패턴의 장점

			- 코드량이 준다. 코드가 간결해 져서 하나의 문장처럼 읽히게 할 수 있다.

			- 함수를 쪼개는 방법을 생각하게 된다. 너무 많을 일을 처리하는 함수가 아닌, 좀 더 작고 특화된 함수를 만들게 된다.
			  (장기적으로는 이런 방법을 통해 유지보수가 개선 된다.)

		 * 체이닝 패턴의 단점

			- 디버깅하기 어렵다. (코드의 어느 라인에서 에러가 발생했는지 알아 내더라도, 그 라인에서 수행하는 일이 너무 많을 수 있기 때문 - 열차사고 패턴)
			    여러개의 메서드 중 하나가 실패하면, 실패한 메서드가 어느 것인지 알아내기가 어렵다.
		 */
				
				
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
		
		
		/*
		StringBuffer의 메소드체이닝에 대해 알아보고 문제를 해결해 봅시다.

		StringBuffer가 가지고 있는 메소드 들은 대부분 자기 자신, this를 반환합니다. 때문에 자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나갈 수 있습니다. 이러한 방법을 메소드체이닝 이라고 합니다.
		StringBuffer sb = new StringBuffer();
		sb.append("hello");      // 해당 스트링 버퍼에 "hello", 공백, "world"를 차례대로 추가
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();  // StringBuffer을 toString()메소드를 이용하여 반환
		이 다섯 줄을 메소드체이닝을 이용하면 한 줄로 수정할 수 있습니다.
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString(
		 */
		
		
	}

}
