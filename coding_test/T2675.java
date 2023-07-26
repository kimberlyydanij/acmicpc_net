package coding_test;

import java.util.Scanner;

public class T2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                for (int x = 0; x < b; x++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}



