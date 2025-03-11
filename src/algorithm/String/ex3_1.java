package algorithm.String;

import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String answer = "";

        int max = 0;

        String[] str = s.split(" ");
        for (String x : str) {
            int len = x.length();
            if (len > max) {
                max = len;
                answer = x;
            }
        }

        System.out.println(answer);
    }
}
