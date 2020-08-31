import java.util.Scanner;

public class print_digits_in_reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        printDigitsReverseIteratively(num);
        // printDigitsReverseRecursively(num);
        scn.close();

    }

    private static void printDigitsReverseIteratively(int num) {
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }

    public static void printDigitsReverseRecursively(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num % 10);
        printDigitsReverseRecursively(num / 10);

    }
}