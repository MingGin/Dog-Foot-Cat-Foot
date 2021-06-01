//Eunji 1차원 배열
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 케이스의 수를 입력하시오.");
		int c = sc.nextInt(); // 테스트 케이스의 수
		int temp = 0;
		double cnt = 0;
		int sum = 0;
		double avg = 0;
		double student[] = new double[c];

		for(int i = 0; i < c; i++) {
				int n = sc.nextInt(); // 학생수
			if(1 <= n && n <= 1000) {
				int jumsu[] = new int[n]; // 학생 1명의 n개의 점수 배열
				for(int j = 0; j < n; j++) {
					temp = sc.nextInt(); //학생들의 각 점수
					if(0 <= temp && temp <= 100) {// 학생들의 점수가 0이상 100이하의 정수
						jumsu[j] = temp; //j번의 학생 점수
						sum += jumsu[j]; // 학생 들의 점수
					}
				}
				avg = sum / n; // 학생들의 평균
				for(int j = 0; j < n; j++) { //학생 수만큼 반복
					if(jumsu[j] > avg) {
						cnt++; // 평균이 넘는 학생수 카운
					}
				}
				student[i] = 100*cnt/n; // 평균 넘는 학생수 / (학생수) * 100
			}
			temp = 0;// 각각 수들의 초기화
			sum = 0;
			cnt = 0;
		}
		for(int i = 0; i < student.length; i++)
			System.out.printf("%.3f%%\n",student[i]);
	}
}

//Eunji for문
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int[] result = new int[T];


		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			result[i] = A+B;
		}
		for(int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d\n",i+1,result[i]);
		}
	}
}

//Eunji if문
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력해주시오.");
		int year = sc.nextInt();
		if(year%4 == 0 &&(year% 100 != 0 || year%400 == 0))
			System.out.println(1);
		else
			System.out.println(0);
	}
}

//Eunji while문
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fir = 0;
		int sec = 0;
		int sum = 0;
		int cnt = 0;
		int temp = n;
		while(true) {

			fir = temp%10;
			sec = temp/10;
			sum = fir+sec;

			temp = sum%10 + fir*10;
			cnt++;
			if(n == temp)
				break;
		}
		System.out.println(cnt);
	}
}
