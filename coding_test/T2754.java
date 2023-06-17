package coding_test;

import java.util.Scanner;

public class T2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		String a = sc.next();
		switch (a) {
		case "A+":
			answer = "4.3";
			break;
		case "A0":
			answer = "4.0";
			break;
		case "A-":
			answer = "3.7";
			break;
		case "B+":
			answer = "3.3";
			break;
		case "B0":
			answer = "3.0";
			break;
		case "B-":
			answer = "2.7";
			break;
		case "C+":
			answer = "2.3";
			break;
		case "C0":
			answer = "2.0";
			break;
		case "C-":
			answer = "1.7";
			break;
		case "D+":
			answer = "1.3";
			break;
		case "D0":
			answer = "1.0";
			break;
		case "D-":
			answer = "0.7";
			break;
		default:
			answer = "0.0";
			break;
		}
		System.out.println(answer);
		sc.close();
	}
}
