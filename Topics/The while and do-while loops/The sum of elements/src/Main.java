import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums;
        int sum = 0;
        do {
            nums = scanner.nextInt();
            sum += nums;
        } while (nums != 0);
        System.out.println(sum);
    }
}