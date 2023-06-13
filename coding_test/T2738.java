package coding_test;

import java.util.Scanner;

public class T2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] data1 = new int[a][b];
		int[][] data2 = new int[a][b];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				data1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				data2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.printf("%d ",data1[i][j]+data2[i][j]);
			}
			System.out.println();
		}

	}

}
