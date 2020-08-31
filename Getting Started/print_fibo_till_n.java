import java.util.Scanner;

public class print_fibo_till_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int a = 0;
        int b = 1;
        while (--t > -1) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        scn.close();
    }
}