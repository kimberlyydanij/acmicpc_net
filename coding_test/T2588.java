package coding_test;

import java.util.Scanner;

public class T2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		sc.close();
		int c = b / 100;
		b = b % 100;
		int d = b / 10;
		b = b % 10;
		System.out.println(a*b);
		sum += a*b;
		System.out.println(a*d);
		sum += a*d*10;
		System.out.println(a*c);
		sum += a*c*100;
		System.out.println(sum);
	}
}
