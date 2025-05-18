package re1.start;

import java.util.Scanner;

public class ScannerSwitchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int num = 1;

        while (num == 1) {
            System.out.println("1.상품입력, 2.결제, 3.프로그램종료");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String productName = scanner.next();
                    System.out.println();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int productPrice = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    int productCount = scanner.nextInt();
                    price = productPrice * productCount;
                    System.out.println("상품명: " + productName + "가격: " + productPrice + "수량: " + productPrice + "합계: " + price);
                    break;
                case 2:
                    System.out.println("총 비용: " + price);
                    price = 0;
                    break;
                case 3:
                    System.out.println("프로그램종료");
                    num = 0;
                    break;
            }
        }
    }


}
