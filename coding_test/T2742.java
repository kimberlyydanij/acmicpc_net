package coding_test;

import java.util.Scanner;

public class T2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = a;i > 0; i--) {
			System.out.println(i);
		}
		sc.close();
	}
}
