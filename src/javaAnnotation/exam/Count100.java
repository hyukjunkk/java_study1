package javaAnnotation.exam;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {
	//직접 정의하는 어노테이션은 커스텀 어노테이션
	//1.정의  2.사용  3.실행
	//jvm 실행시 감지 가능하게 하려면 @Retention(RetentionPolicy.RUNTIME)
	
	
	
	
	
}
