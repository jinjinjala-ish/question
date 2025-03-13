package algorithm.String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            str[i] = s;

            String[] strings = new String[str.length];
            strings[i] = Arrays.toString(s.toCharArray());
            for (int j = 0; j < strings.length; j++) {
                String tmp;
                strings[j] = strings[j+1];
                tmp = strings[j];
                strings[j+1] = tmp;
            }
        }

        System.out.println(strings);



    }
}
