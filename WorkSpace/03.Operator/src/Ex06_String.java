
public class Ex06_String {
	public static void main(String[] args) {
		String str1 = "KYM" + 6.0; //DataType = ?
		String str2 = str1 + "0525" ; // DataType = ?
		System.out.println(str1);//DataType = ?
		System.out.println(str2);//DataType = ?
		//String의 특징은 String을 어떤 데이터 타입에 더하든 String
		
		String str3 = "문자열" + (3 + 6) ; // == ?
		String str4 = 3 + 6 + "문자열"; // == ?
		System.out.println(str3);
		System.out.println(str4);
	}
}
