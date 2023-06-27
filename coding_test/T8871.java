package coding_test;

import java.util.Scanner;

public class T8871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = (a+1)*2;
		int c = (a+1)*3;
		System.out.printf("%d %d", b,c);
		sc.close();
	}
}
