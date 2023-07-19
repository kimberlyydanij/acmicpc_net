package coding_test;

import java.util.Scanner;

public class T14652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.printf("%d %d",(c/b),(c % b));
	}
}
