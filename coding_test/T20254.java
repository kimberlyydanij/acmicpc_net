package coding_test;

import java.util.Scanner;

public class T20254 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		System.out.println((a*56)+ (b*24)+(c*14)+(d*6));
	}
}
