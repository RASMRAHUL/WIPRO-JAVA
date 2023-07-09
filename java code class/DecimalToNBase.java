import java.util.Scanner;

public class DecimalToNBase {
    public static void DectoNBase(int n, int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % n;

            if (remainder <= 9) {
                result.insert(0, remainder);
            } else {
                char symbol = (char) ('A' + remainder - 10);
                result.insert(0, symbol);
            }

            num /= n;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the decimal number (num): ");
        int num = scanner.nextInt();

        DectoNBase(n, num);
    }
}
