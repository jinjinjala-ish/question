package re1.start;

import java.util.Scanner;

public class condEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while(count < 5){
            System.out.print("rating: ");
            double rating = scanner.nextDouble();

            System.out.println("출력: ");
            if (rating <= 9) {
                System.out.println("'어바웃타임'을 추천합니다.");
            }
            if (rating <= 8) {
                System.out.println("'토이스토리'를 추천합니다.");
            }
            if (rating <= 7) {
                System.out.println("'고질라'를 추천합니다.");
            }
            System.out.println();
            count++;
        }
    }
}
