package algorithm.String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int[] sArray = new int[100];

        for (int i = 0; i < s.length(); i++) {
            sArray[i] = s.charAt(i);
        }

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] - 'a' < 0) {
                sArray[i] += 'a';
            } else if (sArray[i] - 'a' > 0){
                sArray[i] -= 'a';
            }
            s = sArray.toString();
        }

        System.out.println(s);
    }
}
