package day0713.ch02;

public class Ex03_CharacterEx1 {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// <1> 문자 자료형 ch1 변수 선언과 동시에 데이터 A 대입
		// 문자를 변수에 대입하면 문자 그대로 저장되는 것이 아닌 
		// 그 문자에 해당하는 정수 값(아스키 코드 값)이 저장됨
		// <2> ch1의 데이터 출력
		// <3> ch1의 데이터를 int 자료형으로 형변환되어 출력
		//---------------------------------------------------
		char ch1 = 'A';			 		// <1>
		System.out.println(ch1); 		// <2> 출력: A
		System.out.println((int)ch1); 	// <3> 출력: 65
		
		//---------------------------------------------------
		// <1> 문자 자료형 ch2 변수 선언과 동시에 데이터 66 대입
		// <2> ch2의 데이터 출력, 문자로 출력됨
		//---------------------------------------------------
		char ch2 = 66;			 // <1>
		System.out.println(ch2); // <2> 출력: B
		
		//---------------------------------------------------
		// <1> 정수형 변수 ch3 변수 선언과 동시에 데이터 67 대입
		// <2> ch3의 데이터 출력
		// <3> ch3의 데이터를 char형으로 형변환되어 출력, 정수값에 해당하는 문자 출력
		//---------------------------------------------------
		int ch3 = 67;			 		// <1>
		System.out.println(ch3); 		// <2> 출력: 67
		System.out.println((char)ch3);  // <3> 출력: C

	}

}
