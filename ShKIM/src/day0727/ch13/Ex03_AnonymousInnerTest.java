package day0727.ch13;

class Outer2 {
	
	//------------------------------------------
	// getRunnable(int i) 메서드 선언
	//------------------------------------------
	Runnable getRunnable(int i) {
		
		//------------------------------------------
		// 지역 변수 선언
		//------------------------------------------
		int num = 100;
		
		//------------------------------------------
		// 익명 내부 클래스는 단 하나의 인터페이스 또는 단 하나의 추상 클래스를 바로 생성할 수 있다.
		//------------------------------------------
		// 익명 내부 클래스, Runnable 인터페이스 생성
		// MyRunnable 클래스 이름을 빼고 클래스를 바로 생성하는 방법
		// return new Runnable();
		//------------------------------------------
		return new Runnable() {
			
			//------------------------------------------
			// run() 메서드 구현
			// <1> 지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
			//	Local variable num defined in an enclosing scope must be final or effectively final
			//------------------------------------------
			@Override
			public void run() {
				// num = 200;			// <1>
				// i = 10;
				System.out.println(i);
				System.out.println(num);
			}
			
		};
		// 클래스 끝에 ; 를 씀
		
	}
	
	//------------------------------------------
	// 인터페이스나 추상 클래스 자료형으로 변수를 선언한 후 익명 내부 클래스를 생성해 대입할 수도 있다.
	//------------------------------------------
	// 익명 내부 클래스를 변수에 대입
	// 인터페이스나 추상 클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법
	// Runnable형 변수 runner 에 Runnable 객체화하여 메위주를 대입
	// Runnable runner = new Runnable();
	//------------------------------------------
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
	// 클래스 끝에 ; 를 씀
		
}

public class Ex03_AnonymousInnerTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// 익명 클래스를 사용하는 코드
		// Runnable 인터페이스 자료형으로 변수를 선언하고, 
		// 인터페이스의 익명 내부 클래스가 구현된 메서드를 호출하면 인스턴스를 반환한다.
		//------------------------------------------
		// <1> Outer2형 out 변수 선언, Outer2 인스턴스 생성하여 리턴된 메위주 대입
		// <2> Runnable형 runnerble 변수 선언, out 변수로 getRunnable() 메서드 호출하여 리턴된 메위주 대입
		// <3> runnerble 변수로 run() 메서드 호출
		// 10
		// 100
		// <4> out변수로 runner 멤버 변수 참조하여 run() 메서드 호출
		// Runnable이 구현된 익명 클래스 변수
		//------------------------------------------
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
		
		
		/* =========================================
		 * 익명 내부 클래스
		 * 클래스 이름을 사용하지 않는 클래스
		 * 1. 변수에 직접 대입하는 경우
		 * 2. 메서드 내부에서 인터페이스나 추상 클래스를 구현하는 경우
		 * 	지역 변수는 상수화되므로 메서드 호출이 끝난 후에도 사용할 수 있다.
		 * =========================================
		 */

	}

}
