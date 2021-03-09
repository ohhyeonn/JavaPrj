package ex3.array;

import java.util.Random;

public class Program3 {

	public static void main(String[] args) {
		char[] chs = new char[10];
		
		for(int i=0; i< 10; i++) {
		
			chs[i] = (char)('J'-i);
		
		}
		
		for(int i=0 ; i<10; i++) {
			
			System.out.printf("%c ", chs[i]);
		}
		
		System.out.println("");
		
		
		for(int i=0; i<5;i++) {
			char temp=0;
			temp = chs[i];
			chs[i] = chs[9-i];
			chs[9-i] = temp;
		}
		
		
		for(int i=0 ; i<10; i++) {
			
			System.out.printf("%c ", chs[i]);
		}
		
		
		
		
	}

}
