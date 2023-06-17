package coding_test;

import java.util.Scanner;

public class T5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[31];
		do {
			int b = sc.nextInt();
			a[b] = 1;
		} while (sc.hasNextInt());
		
		for (int i = 1; i < 31; i++) {
			if (a[i] == 0)
				System.out.println(i);
		}
		sc.close();
	}

}