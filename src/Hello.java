public class Hello {

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

		System.out.println("������������������������������������������������������");
		System.out.println("��        ���� ���		  ��");
		System.out.println("������������������������������������������������������");
		System.out.printf("���� : %d\n",kor);
		System.out.printf("���� : %d\n",eng);
		System.out.printf("���� : %d\n",math);
		System.out.printf("���� : %d\n",total);
		System.out.printf("��� : %-6.2f\n",avg);
		System.out.println("������������������������������������������������������");
		
	}

}
