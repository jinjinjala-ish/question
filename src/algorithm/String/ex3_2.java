package algorithm.String;

import java.util.Scanner;

public class ex3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String answer = "";

        int m = Integer.MIN_VALUE, pos;

        while ((pos = s.indexOf(' ')) != -1) {
            String tmp = s.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            s = s.substring(pos+1);
        }
        if (s.length() > m) {
            answer = s;
        }

        System.out.println(answer);

    }
}
