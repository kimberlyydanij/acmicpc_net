package coding_test;

import java.util.Scanner;

public class T2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
			for(int i = 1;i <= a;i++) {
				int b = a - i;
				for(int j = 1;j <= b; j++) {
					System.out.printf(" ");
				}
				for(int x = 1;x <= i; x++) {
					System.out.printf("*");
				}
				System.out.println();
		}
		sc.close();
	}
}
