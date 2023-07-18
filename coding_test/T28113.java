package coding_test;

import java.util.Scanner;

public class T28113 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	sc.close();
    	if(N==A && A==B) 
    		System.out.println("Anything");
    	else if(A <= B)
    		System.out.println("Bus");
    	else
    	System.out.println("Subway");
 
    }
}






