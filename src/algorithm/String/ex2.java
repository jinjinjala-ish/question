package algorithm.String;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String answer = "";
                                               //32
     /*   for(char x : s.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }*/

        for (char x : s.toCharArray()) {
            if (x > 65 && x < 97) {
                answer += Character.toLowerCase(x);
            }
             else {
                answer += Character.toUpperCase(x);
            }
        }

        System.out.println(answer);
    }

}
