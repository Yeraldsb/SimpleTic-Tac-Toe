import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = indexOfMaxValue(array);
        int index = Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(max);
        System.out.println(index);

    }

    private static int indexOfMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

}