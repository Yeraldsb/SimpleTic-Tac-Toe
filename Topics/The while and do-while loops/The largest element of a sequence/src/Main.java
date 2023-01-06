
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        int value = 0;

        do {
            num = scanner.nextInt();
            if (num > value) {
                value = num;

            }
        } while (num != 0);
        System.out.println(value);

    }
}