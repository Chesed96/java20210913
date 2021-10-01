package pack01_if;

public class Ex07_TestIfelse {
	public static void main(String[] args) {
		//int형 데이터를 저장할수있는 변수 code라는 변수를 선언하고
		//값을 할당하면서 테스트합니다.
		//if else if문 사용해서 처리.
		//값이 1이면 콘솔창에 '남자'라고 출력이됨.
		//값이2이면 콘솔창에  '여자' , 3이면 남자 , 4이면 여자
		//그외에 값은 주민등록번호 오류.
		int code = 5;
		//논리연산자 && AND 논리곱 ( 모든 조건을 만족해야지만 TRUE반환 ) 1 * 0 = 0;
			//뒤에 조건을 전부 따짐
		//논리연산자 || OR  논리합 ( 하나의 조건이라도 만족하면 TRUE반환 )1 + 0 = 1;
			//하나의 조건을 만족하면 뒤에 조건은 무시. 
		//논리연산자를 이용해서 5번도 남자 6번은 여자.
		//if () {} else if{} else { }
		if(code == 1 || code == 3 || code == 5 ) {
			System.out.println("남자");
		}else if(code == 2 || code == 4 || code == 6) {
			System.out.println("여자");
		}else {
			System.out.println("주민등록번호 오류 ");
		}
	}
}
