package coding_test;

import java.util.Scanner;

public class T2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(b >= 45)
			b = b - 45;
		else { 
			a = a -1;
			b = b + 60 - 45;
		}
		if(a<0)
			a = a + 24;
		System.out.printf("%d %d\n",a,b);
}
}