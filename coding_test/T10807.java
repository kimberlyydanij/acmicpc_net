package coding_test;

import java.util.Scanner;

public class T10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int data[] = new int[a];
		int sum = 0;
		for(int i = 0;i < a;i++) {
			data[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		sc.close();
		for(int j = 0;j < a;j++) {
			if(data[j]==b)
				sum++;
		}
		System.out.println(sum);
	}
}
