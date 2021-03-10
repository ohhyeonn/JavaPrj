package homework;

import java.util.Scanner;

public class Homework_20210310 {

	public static void main(String[] args) {
		
		for(int i = 2; i<10 ; i++) {
			for(int j=1; j<10; j++) {
				int gop = i * j;
				System.out.printf("%d * %d = %d \t", i, j, gop);
			}
			System.out.println();
		}
		
		

	}

}
