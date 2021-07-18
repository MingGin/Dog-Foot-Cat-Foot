package day0720.ch08;

public class Ex04_OverridingTest2 {

	public static void main(String[] args) {
		
		// -------------------------------------
		// <1> Customer형 변수 선언과 동시에 new 예약어로 VIPCustomer 생성자 호출하여
		// 인스턴스 생성, 생성한 인스턴스의 메위주 대입
		// <2> bonusPoint 변수에 1000 데이터 초기화
		// <3> 메서드 호출
		// 출력: 나몰라 님이 지불해야 하는 금액은 9000원입니다.
		// -------------------------------------
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 "
				+ vc.calcPrice(10000) + "원입니다.");
		
		
		/* =====================================
		 * 묵시적 클래스 형 변환과 메서드 재정의
		 * 상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할 때
		 * 호출되는 메서드는 인스턴스에 따라 결정된다.
		 * 즉, 선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출하는 것이다.
		 * =====================================
		 */

	}

}
