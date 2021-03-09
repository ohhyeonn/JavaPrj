package ex3.array;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		int[] kors = new int[6];
		Random rand = new Random();
		
		
		for(int i=0 ; i<6; i++) {
			kors[i]=(rand.nextInt(45)+1);
		}
		
		for(int i =0; i<6; i++) {
			System.out.printf("%d ", kors[i]);
			
		}
	}

}
