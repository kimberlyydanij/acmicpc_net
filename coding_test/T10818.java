package coding_test;

import java.util.Scanner;

public class T10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		for(int i = 0;i < a; i++) {
			b[i] = sc.nextInt();
		}
		int max = b[0];
		int min = b[0];
		for(int i = 0;i < a; i++) {
			if(max < b[i]) max = b[i];
			if(min > b[i]) min = b[i];
		}
		sc.close();
		System.out.printf("%d %d",min,max);
	}
}
