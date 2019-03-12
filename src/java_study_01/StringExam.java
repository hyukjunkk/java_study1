package java_study_01;

public class StringExam {

	public static void main(String[] args) {
		//String�� ������!
		String str1 = "hello world";		//hello world
		String str2 = str1.substring(5); 	// world
		System.out.println(str1);
		System.out.println(str2);
		
		
		String str3 = str1 + str2;
		System.out.println(str3); 			//hello world world
		//���� ���ϴ°��� ���������� �̷��� �ȴ� 
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		String str5 = "";
		for(int i = 0; i<100; i++) {
			str5 = str5 + "*";
		}//string ��ü�� 100�� ����� ;;;;;;
		//new �����ڰ� �������� �ӵ��� Ȯ ��������
		System.out.println(str5);			//***************************************
		
		
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
		//���ڿ��� �ݺ��� �ȿ��� ������ ���� ���ɻ� ������ �ɰ��ϰ� �Ͼ ���� �����Ƿ� ������ 
		//��� StringBuffer�� �̿�
		
		// ���� ������ �ӵ����� ���� ����
		
	    // (1) String�� +������ �̿��ؼ� 10,000���� *�� �̾���Դϴ�.
        //���۽ð��� ����մϴ�.(millisecond����)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<10000;i++){
            str=str+"*";
        }
        //����ð��� ����մϴ�.(millisecond����)
        long endTime1 = System.currentTimeMillis();
        
        // (2) StringBuffer�� �̿��ؼ� 10,000���� *�� �̾���Դϴ�.
        //���۽ð��� ����մϴ�.(millisecond����)                
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<10000;i++){
            sb2.append("*");
        }
        //����ð��� ����մϴ�.(millisecond����)
        long endTime2 = System.currentTimeMillis();
        
        // ���(1)�� ���(2)�� �ɸ� �ð��� ���մϴ�.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        
        System.out.println("String�� +������ �̿��� ��� : "+ duration1);
        System.out.println("StringBuffer�� append()�� �̿��� ��� : "+ duration2);
    }
		
}


