package string;

import java.util.Scanner;

public class re_one9one9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();

        int[] countA = new int[26];
        int[] countB = new int[26];

        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i) - 'a']++;
        }
        for (int j = 0; j < b.length(); j++) {
            countB[b.charAt(j) - 'a']++;
        }

        int sum = 0;

        for (int k = 0; k < countA.length; k++) {
            if (countA[k] > countB[k]) {
                sum += countA[k] - countB[k];
            } else if (countB[k] > countA[k]) {
                sum += countB[k] - countA[k];
            }
        }

        System.out.println(sum);
    }
}
