import java.util.Scanner;

public class Ex02_ScoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 어떤값(콘솔)을 입력받기 위한sc
		int[][] score = null;// 참조타입은 null로 초기화(일반변수는 값)
		String[] student = null;
		String[] subject = { "국어", "영어", "수학", "과학" };
		// 분석 기능 추가
		// 1.모든학생들의 총점,과목별점수,평균점수를 전체 보여주고
		// 1등이 누구인지 출력.
		// 꼴등이 누구인지 출력
		// 반평균이 몇점인지 출력

		while (true) {
			System.out.println("1.학생수 입력 2.점수 입력 3.점수리스트 4.분석(평균) 5.종료");
			try {

				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					// 학생의 수를 입력받고 학생의 이름까지 입력하는 로직
					// +2차원 배열을 입력받은 학생의수로 초기화시켜줘야한다.
					System.out.println("학생의 수를 입력해주세요.");
					// try{}catch while(true) 추가가 가능하다.
					int std_cnt = Integer.parseInt(sc.nextLine());
					student = new String[std_cnt];
					// <-학생 세명의 정보를 입력받을수있다.
					// 1차원 배열 == for문 하나만 있어도 전체 index에 모두 접근이 가능하다.
					// 배열의크기(array.length)
					for (int i = 0; i < student.length; i++) {
						System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요.");
						student[i] = sc.nextLine();
					}
					score = new int[std_cnt][subject.length+1];
					//국 , 영 , 수  
					// 0[0]0 [0]1 [0]2 0[학생1]
					// 1[0]0 [0]1 [0]2 1[학생2]
					// 2[0]0 [0]1 [0]2 2[학생3]
					//국 , 영 , 과
					// 0[0]0 [0]1 [0]2 [0]3 [0]4 0[학생1]
					// 1[0]0 [0]1 [0]2 [0]3 1[학생2]
					// 2[0]0 [0]1 [0]2 [0]3 2[학생3]
					// 3[1]0 [1] <-ArrayIndexOutboundException(배열의 크기를 벗어남)
				} else if (menu == 2) {
					if (student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요.메뉴1");
						continue;
					}
					// 2차원 배열의 모든 행에 접근하는 반복문
					for (int i = 0; i < score.length; i++) {
						System.out.println(student[i] + "의 점수를 입력해주세요.");
						for (int j = 0; j < score[i].length-1; j++) {
							System.out.println(subject[j] + "번째 과목의 점수를 넣어주세요.");
							score[i][j] = Integer.parseInt(sc.nextLine());
							score[i][score[i].length - 1] += score[i][j];
							//4 - 1 = 3
							//0 1 2 3  
						}
					}
				} else if (menu == 3) {
					//[] [] [] [] + 총점 []
					for (int i = 0; i < score.length; i++) {
						System.out.println(student[i] + "의 점수");
						for (int j = 0; j < score[i].length-1; j++) {
							System.out.print(score[i][j] + " ");
						}
						System.out.println();
					}
				} else if (menu == 4) {
					for (int i = 0; i < score.length; i++) {
					
						for (int j = 0; j < score[i].length-1; j++) {
							System.out.print(subject[j] + " 점수 : " + score[i][j]);
						}
						System.out.println(student[i] + "평균 : " + (score[i][score[i].length -1]/subject.length ));
						System.out.println(student[i] + "총점 : " + (score[i][score[i].length -1]));
					}
				} else if (menu == 5) {

				} else {
					System.out.println("없는 메뉴입니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못된입력입니다.");
			}
		}

	}
}
