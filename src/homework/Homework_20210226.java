package homework;

public class Homework_20210226 {

	public static void main(String[] args) {

		int kor, eng;
		int math;
		int total;
		double avg;

		kor = 65;
		eng = 72;
		math = 86;

		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("┌─────────────────────────┐");
		System.out.println("│        성적 출력		  │");
		System.out.println("└─────────────────────────┘");
		System.out.printf("국어 : %-6.2f\n",(double)kor);
		System.out.printf("영어 : %-6.2f\n",(double)eng);
		System.out.printf("수학 : %-6.2f\n",(double)math);
		System.out.printf("총점 : %-6.2f\n",(double)total);
		System.out.printf("평균 : %-6.2f\n",avg);
		System.out.println("───────────────────────────");
		
	}

}
