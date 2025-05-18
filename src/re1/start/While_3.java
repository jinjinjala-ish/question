package re1.start;

public class While_3 {
    public static void main(String[] args) {
        int condition = 100;
        int sum = 0;
        int count = 1;


        while(sum <= condition){
            sum += count;
            System.out.println(sum + " = " + count + " + " + sum);
            if(sum > condition){
                System.out.println("10보다 처음올 큰 값: " +count);
            }
            count++;
        }
    }
}
