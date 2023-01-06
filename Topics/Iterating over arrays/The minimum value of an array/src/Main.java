import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int num = array[0];    //Initialize minValue with first element of the array
        for (int j = 0; j < array.length; j++) {
            if (array[j] < num) {
                num = array[j];
            }
        }
        System.out.println(num);
    }
}