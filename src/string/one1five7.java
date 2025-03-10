package string;

import java.util.Scanner;

public class one1five7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next().toLowerCase(); // 소문자로 변환

        int[] countA = new int[26];
        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i) - 'a']++; // 소문자로 변환했으므로 안전
        }

        int temp = countA[0];
        int maxIndex = 0;
        boolean check = true;
        for (int i = 1; i < countA.length; i++) {
            if (temp < countA[i]) {
                temp = countA[i];
                maxIndex = i;
                check = true;
            } else if (temp == countA[i]) {
                check = false;
            }
        }

        if (check) {
            char ch = (char) (maxIndex + 'A'); // 대문자로 출력
            System.out.println(ch);
        } else {
            System.out.println("?");
        }
    }
}

