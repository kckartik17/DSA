import java.util.Scanner;

public class print_all_primes_till_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        scn.close();
        for (; low <= high; low++) {
            int count = 0;
            for (int div = 2; div * div <= low; div++) {
                if (low % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(low);
            }
        }
    }
}