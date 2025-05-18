package re1.start;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        int[][] students = new int[4][1];

        for (int i = 0; i < students.length; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
            System.out.print("국어점수: ");
            sum += scanner.nextInt();
            System.out.print("영어점수: ");
            sum += scanner.nextInt();
            System.out.print("수학점수: ");
            sum += scanner.nextInt();
            students[i][0] = sum;
            sum = 0;
        }
        for (int i = 0; i <students.length; i++){
            average = (double) students[i][0] / 3;
            System.out.println(i+1 + "번 학생의 총점: " + students[i][0] + " 평균: " + average);
        }
    }
}
