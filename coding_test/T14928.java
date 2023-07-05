package coding_test;

import java.math.BigInteger;
import java.util.Scanner;

public class T14928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		sc.close();
		BigInteger b = BigInteger.valueOf(20000303);
		System.out.println(a.remainder(b));
	}
}
