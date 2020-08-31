import java.util.Scanner;

public class digits_of_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        // printDigitsRecursively(num);
        printDigitsIteratively(num);

        scn.close();
    }

    public static void printDigitsRecursively(int num) {
        if (num == 0) {
            return;
        }

        printDigitsRecursively(num / 10);
        System.out.println(num % 10);
    }

    public static void printDigitsIteratively(int num) {
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }

        int div = (int) Math.pow(10, digits - 1);
        while (div != 0) {
            System.out.println(num / div);
            num = num % div;
            div = div / 10;
        }
    }

}