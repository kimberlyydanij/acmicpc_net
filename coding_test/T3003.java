package coding_test;

import java.util.Scanner;

public class T3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		int b[] = {1,1,2,2,2,8};
		for(int i = 0;i < 6;i++) {
			a[i] = sc.nextInt();
			b[i] = b[i] - a[i];
			System.out.printf("%d ",b[i]);
		}
		System.out.println();
		sc.close();	
	}
}

