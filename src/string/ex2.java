package string;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] temp_arr = str.toCharArray();
        for(int i = 0; i < temp_arr.length; i++){
            if(65 <= temp_arr[i] && temp_arr[i] <= 90){
                temp_arr[i] += 32;
            } else {
                temp_arr[i] -= 32;
            }
        }
        str = new String(temp_arr);
        System.out.println(str);
    }
}
