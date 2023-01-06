import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;

        if (a < b && n != 0) {
            int bDiv = b / n;
            int aDiv = (a % n == 0) ? a / n - 1 : a / n;
            count = bDiv - aDiv;
            System.out.println(count);
        }
    }
}