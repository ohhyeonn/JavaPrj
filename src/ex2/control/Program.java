package ex2.control;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor, eng;
		int math;
		int total;
		double avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		boolean more = true;
		Scanner scan = new Scanner(System.in);
		
		while(more)
		{
			
			
			
			
		System.out.println("┌─────────────────────────┐");
		System.out.println("│        성적 입력		  │");
		System.out.println("└─────────────────────────┘");
		
		
		
		System.out.print("국어성적을 입력하세요 : ");
		kor = scan.nextInt();
			
		System.out.print("영어성적을 입력하세요 : ");
		eng = scan.nextInt();		
		

		System.out.print("수학성적을 입력하세요 : ");
		math = scan.nextInt();
		System.out.println("───────────────────────────");
		
		
		
		
		
		
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
		
		
		System.out.println("계속할시 true, 그만할시 false");
		
		
		
		more = scan.nextBoolean();

		
		}
		
		System.out.println("good bye~");
	}

}
