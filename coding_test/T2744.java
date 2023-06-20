package coding_test;

import java.util.Scanner;

public class T2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int a = word.length();
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
