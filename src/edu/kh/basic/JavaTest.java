package edu.kh.basic;

// 한 줄 주석 : 컴파일러가 해석 안함, 주로 코드 설명 작성

/*
 * 범위 주석
 * 
 * 
 */

// 컴파일러(Compiler) : 코드를 2진수(0,1)로 변환하는 번역기


//Java 코드 실행 순서
// 코드 작성 -> ctrl + f11 실행 (컴파일러가 2진수로 번역 -> JVM이 실행)


public class JavaTest {
	
	
	
	
	// class : 자바 코드가 작성되는 영역
	
	public static void main(String[] args) {
		//메인 메서드 : 자바 애플리케이션을 실행하기 위해 반드시 필요한 메서드
		
	
	
	System.out.println("HI");
	System.out.println("HI");
	System.out.println("HI");
	System.out.println("-----------------------------");
	

// print 'ln' -> 한칸 엔터
	
// ctrl + art + 화살표 아래 : 해당 방향으로 소스코드 복사	

	
	// "" -> 안에 작성된 코드는 단순 문자열로 인식

	
	System.out.println("1 + 2");
	System.out.println(1 + 2);
	
	// "" -> 안에 작성 안되는 코드는 숫자, 변수로 인식
	
	System.out.println(50 - 23);
	System.out.println(12 * 3);
	System.out.println(327 / 3);
	
	// ""(문자열) + 숫자 함꼐 작성 예시
	
	System.out.println("14 * 19 = " + 266); 
	System.out.println("14 * 19 = " + 14*19);
	
	System.out.println("90 + 70 + 65 = " + 90 + 70 + 65 ); // 한번 이어쓰기로 + 가 쓰이면 그 뒤로 쭉 이어쓰기로만 + 를 사용함
	System.out.println("90 + 70 + 65 = " + (90 + 70 + 65) ); 
	
	// 자바는 사칙연산의 우선순위를 그대로 따른다
	// -> 즉, 우선계산을 원하면 () 괄호를 추가로 사용하면 된다
	
	// + 기호의 역할
	
	// -> 숫자 + 숫자 = 덧셈 연산함
	
	// -> 문자열 + 숫자 or 문자열 + 문자열 = 이어쓰기
	
	
	}
	
	 
	

}
