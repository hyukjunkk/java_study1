package java_study_01;

public class StringExam {

	public static void main(String[] args) {
		//String의 문제점!
		String str1 = "hello world";		//hello world
		String str2 = str1.substring(5); 	// world
		System.out.println(str1);
		System.out.println(str2);
		
		
		String str3 = str1 + str2;
		System.out.println(str3); 			//hello world world
		//위에 더하는것이 내부적으론 이렇게 된다 
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		String str5 = "";
		for(int i = 0; i<100; i++) {
			str5 = str5 + "*";
		}//string 객체를 100번 만든다 ;;;;;;
		//new 연산자가 많을수록 속도은 확 떨어진다
		System.out.println(str5);			//***************************************
		
		
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
		//문자열을 반복문 안에서 돌리는 것은 성능상 문제가 심각하게 일어날 수도 있으므로 피하자 
		//대신 StringBuffer을 이용
		
		// 밑의 예제로 속도차이 비교해 볼것
		
	    // (1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<10000;i++){
            str=str+"*";
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime1 = System.currentTimeMillis();
        
        // (2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)                
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<10000;i++){
            sb2.append("*");
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime2 = System.currentTimeMillis();
        
        // 방법(1)과 방법(2)가 걸린 시간을 비교합니다.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        
        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);
    }
		
}


