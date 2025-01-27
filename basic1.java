package goorm;

import java.util.Scanner;

public class basic1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		String s = input.next();
		
		String s2 = s.toUpperCase();
		String s3 = s.toLowerCase();
		
		for (int k = 0; k < i; k++) {
			char a = s.charAt(k);
			char b = s2.charAt(k);
			
			if (a != b)
				System.out.print(b);
			else
				System.out.print(s3.charAt(k));
		}
		input.close();
		
		
	}

}
