package string;

import java.util.Scanner;

public class one9one9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine(); //(aabbcc)
        String str2 = scanner.nextLine();//(xxyybb)

        int[] count1 = new int[26]; //a~z의 방을 만듦
        int[] count2 = new int[26]; //a~z의 방을 만듦

        //count 배열(알파벳의 빈도를 저장하는 배열)
        countArr(count1, str1);
        countArr(count2, str2);
        /*for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++; //각 방의 해당하는 수를 올림(a:2, b:2, c: 2)
        }
        for (int j = 0; j < str2.length(); j++) {
            count2[str2.charAt(j) - 'a']++; //(x:2, y:2, b:2)
        }*/

        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += Math.abs(count1[i] - count2[i]); //Math.abs()는 절댓값을 리턴하는 함수임
            /*if (count1[i] > count2[i]) { //count1의 a, c에 해당하는 값이 더 클 경우
                sum += count1[i] - count2[i]; //2-0 = 2, 2-0 = 2
            } else if (count2[i] > count1[i]) {//count2의 x, y에 해당하는 값이 더 클 경우
                sum += count2[i] - count1[i]; //2-0 = 2, 2-0 = 2
            }*/
        }
        System.out.println(sum); //8
    }

    public static void countArr(int[] count, String str) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
    }
}
