package pack01_if;

public class Ex01_if {
	public static void main(String[] args) {
		//if == 만약에 ( 조건식 )
		//조건식 : 반드시 네 또는 아니오 (참 , 거짓 ) (true , false)
		//조건식이 될수 없는것 : 1+1 , 니이름이 뭐니?...
		//조건식이 될 수 있는것 : (1+1)==2 , 니이름은 ㅇㅇㅇ이냐 ? 
		int score = 75;
		//if(조건식) {    참일때 실행할 코드        }//
		if(score > 90) {
			//↑ 식이 참일때'만' 실행할 코드
			System.out.println("점수가 90보다 큽니다.");
		}
		
		if(score == 75) {
			int a = 10;
			System.out.println("점수가 75점");
		}
		if(score > 0) {
			int a =10;
			System.out.println("점수가 0보다큼");
		}
		if(score >= 0) {
			int a = 10;
			System.out.println("점수가 0보다 같거나 크다.");
		}
		if(score < 100) {
			System.out.println("점수가 100보다 작다.");
		}
		
		//score에 값은 그대로 둔 상태에서 
		//if문 하나를 더 선언하고 score 75값을 비교했을때 참이되는 조건식을
		//하나 넣고 콘솔창에 70보다 큽니다 라는 문자열을 출력
	
	
	}
}
