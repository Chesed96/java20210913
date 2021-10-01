import java.util.Scanner;

public class Ex08_TestBool {
	public static void main(String[] args) {
		//Scanner를 통해서 숫자 두개를 입력받는다.
		//입력된 값 두개가 같은지 다른지를 true , false로 콘솔창에 출력하세요.
		Scanner sc = new Scanner(System.in);
		//1.sc.nextLine() x 2 <- String -> int ( Integer == Wrapper Class)
		//2.boolean 
		String str1 = sc.nextLine(); //한번 엔터를 치기 전까지의 숫자를 String으로 받아옴
		String str2 = sc.nextLine(); //두번 엔터를 치기 전까지
		System.out.println("첫번째 숫자" + str1 + " 두번째 숫자 " + str2);
		int num1 = Integer.parseInt(str1); //str1에 담긴 String - > int num1대입
		int num2 = Integer.parseInt(str2); 
														//1    1	  //네  : 아니오
		System.out.println("num1과 num2가 같은지?" + (num1 == num2 ? "같다" : "다르다" ) );
		System.out.println("num1과 num2가 다른지?" + (num1 != num2 ? "다르다" : "같다"));
		System.out.println("num1과 num2중 num1이 큰지?" + (num1 > num2 ? "네" : "아니오"));
		System.out.println("num1과 num2중 num2이 큰지?(초과)" + (num1 < num2 ? "네" : "아니오"));
		System.out.println("num1과 num2중 num2와 같거나 큰지?(이상)" + (num1 <= num2 ? "네" : "아니오"));
											//num1과 num2중에 num2가 큰지?
		
	}
}
