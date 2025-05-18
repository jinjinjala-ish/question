package re1.start;

import java.util.Scanner;

public class MethodEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇번출력할까? ");
        int count = scanner.nextInt();

        printMessage(count);

    }

    public static void printMessage(int count){
        for (int i = 0; i < count; i++) {
            String message = "hello, world";
            System.out.println(message);
        }
    }
}
