package test;

import java.math.BigInteger;
import java.util.Scanner;

public class T1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger bigA = sc.nextBigInteger();
		BigInteger bigB = sc.nextBigInteger();
		System.out.println(bigA.divide(bigB));
		System.out.println(bigA.remainder(bigB));
	}

}
