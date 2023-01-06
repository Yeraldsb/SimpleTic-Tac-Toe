import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int current;
        for (int i = 0; i < number; i++) {
            current = scanner.nextInt();
            if (current % 6 == 0) {
                sum = sum + current;
            }
        }
        System.out.println(sum);
    }
}