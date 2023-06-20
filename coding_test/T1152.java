package coding_test;

import java.util.Scanner;

public class T1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] word = sc.nextLine().toCharArray();
		int sum = 0;
		for(int i = 1;i < word.length;i++) {
			if(word[i] == ' ') {
				++sum;
			}
		}
		if(word[word.length-1] == ' ')
			sum--;
		System.out.println(sum+1);
		sc.close();
	}
}
