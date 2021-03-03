package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework_20210303 {

	public static void main(String[] args) throws IOException {
		
		int a,b,c,d,e,x,y;
		
		
		FileOutputStream fos = new FileOutputStream("C:\\tool\\eclipse-workspace\\JavaPrj\\score.txt");
		PrintStream ps = new PrintStream(fos);
		ps.printf("37 62 98 100 50");
		
		ps.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:\\tool\\eclipse-workspace\\JavaPrj\\score.txt");
		Scanner scan = new Scanner(fis);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		
		scan.close();
		fis.close();
	
		
		x = a|b;
		y = c&d;
		
		FileOutputStream fos2 = new FileOutputStream("C:\\tool\\eclipse-workspace\\JavaPrj\\score_result.txt");
		PrintStream ps2 = new PrintStream(fos2);
		ps2.printf("%d %d",x,y);
		
		ps.close();
		fos.close();
		
		
		
		
		
		
	}

}
