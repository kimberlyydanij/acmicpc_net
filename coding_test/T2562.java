package coding_test;

import java.util.Scanner;

public class T2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data[] = new int[9];
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < 9; i++) {
			data[i] = sc.nextInt();
			if(data[i]>max) {
				max = data[i];
				maxIndex = i; }
		}
		sc.close();
		System.out.println(max);
		System.out.println(maxIndex+1);
	}
}
