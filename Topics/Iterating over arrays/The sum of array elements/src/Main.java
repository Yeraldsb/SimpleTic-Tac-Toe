import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code hereç
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}