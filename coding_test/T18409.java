package coding_test;

import java.util.Scanner;

public class T18409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        for (int i = 0; i < a; i++) {
            char c = s.charAt(i);
            for (int j = 0; j < 5; j++) {
                if (c == vowels[j]) {
                    sum++;
                    break;
                }
            }
        }
        sc.close();
        System.out.println(sum);
    }
}


