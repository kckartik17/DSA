import java.util.Scanner;

public class is_a_number_prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (--t > -1) {
            int num = scn.nextInt();
            int count = 0;
            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(num + " is Prime.");
            } else {
                System.out.println(num + " is Not Prime.");
            }
        }
        scn.close();
    }
}