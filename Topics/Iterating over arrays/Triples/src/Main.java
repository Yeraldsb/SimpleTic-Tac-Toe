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

        for (int i = 0; i < array.length; i++) {
            if (i + 3 > array.length) {
                break;
            }
            if (array[i] == array[i + 1] -1 && array[i] == array[i + 2] -2) {
                count++;
            }
        }
        System.out.println(count);
    }
}