import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int resultado;
        while (num != 1) {
            System.out.println(num + " ");
            System.out.println();
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.println(num + " ");
    }
}