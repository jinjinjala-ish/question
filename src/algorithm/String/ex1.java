package algorithm.String;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char c = scanner.next().charAt(0);

        s = s.toUpperCase();
        c = Character.toUpperCase(c);

        int answer = 0;
    /*    for(int i =0; i < s.length(); i++){
            if(s.charAt(i)==c){
                answer++;
            }
        } */
        for (char x : s.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
