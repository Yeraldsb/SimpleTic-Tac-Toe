import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            count = array[j] == n ? ++count : count;
        }
        System.out.println(count);

    }
}