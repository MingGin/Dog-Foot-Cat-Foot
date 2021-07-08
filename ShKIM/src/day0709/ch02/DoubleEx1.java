package day0709.ch02;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		// 실수 자료형 double형 dnum 변수 선언과 동시에 3.14 데이터 대입
		double dnum = 3.14;
		// 실수 자료형 float형 fnum 변수 선언과 동시에 3.14 데이터 대입
		// 자바의 실수는 double형을 기본으로 사용하여
		// float형으로 대입되는 값 3.14는 F 또는 f를 식별자를 붙여준다
		// f를 안붙이면? Type mismatch 에러(double형 데이터를 float형에 대입하려 했기 떄문에)
		float fnum = 3.14F;
		float fnum2 = (float)3.14; // 이렇게 형변환해도 대입됨! 강제 형변환(double형 -> float형)
		
		// dnum, fnum, fnum2 데이터를 출력
		System.out.println(dnum); // 출력: 3.14
		System.out.println(fnum); // 출력: 3.14
		System.out.println(fnum2); // 출력: 3.14
		
	}

}
