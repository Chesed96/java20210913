package pack01_if;

import java.util.Scanner;

public class Ex03_if_else {
	public static void main(String[] args) {
		//일반적으로 방금까지 사용한 단순 if문 뒤에 else라는 키워드를 통해
		//if(조건식) 부분이 참이 아닐때 실행하는 블럭을 만든다.
		//if(조건식){  참일때 실행  }else {    거짓일때 실행     }
		int score = 75;
		if(score > 90) {
			//참일때의 실행부
			System.out.println("점수가 90점보다 큽니다.");
		}else {
			int a = 0;
			System.out.println("점수가 90점보다 작습니다.");
			//거짓일때의 실행부
		}
		//if(){}else{} 문을 이용하여 
		//숫자를 입력받아 그 숫자가 짝수인지 홀수인지를 출력하세요.(콘솔)
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine(); //<- int형 
		int num = Integer.parseInt(inputData);
		//if( 짝수 또는 홀수 둘중에 하나만 분별하면된다) else {  }
		if( num % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		if( num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
