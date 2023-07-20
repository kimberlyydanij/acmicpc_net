package coding_test;

import java.util.Scanner;

public class T20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		System.out.printf("%.0f %.0f",(a*0.78),(a-(a*0.2*0.22)));
	}
}
