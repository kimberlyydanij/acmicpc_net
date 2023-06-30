package coding_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String word = sc.next();
		char data[] = new char[a];
		int num[] = new int[a];
		for(int i = 0; i < a; i++) {
			data[i] = word.charAt(i);
			num[i] = data[i];
			if(num[i]>=65 && num[i]<97) 
				num[i] = num[i] + 32;
			else num[i] = num[i] - 32;
			System.out.printf("%s",Character.toString(num[i]));
	}
		System.out.println();
		sc.close();
}
}