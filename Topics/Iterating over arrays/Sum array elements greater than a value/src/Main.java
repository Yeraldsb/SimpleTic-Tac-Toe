import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] elements = new int[arraySize];
        int sum = 0;


        for (int i = 0; i < elements.length; i++) {
            elements[i] = sc.nextInt(); //fill and read the next number of the array
        }

        int n = sc.nextInt();
        for (int j = 0; j < elements.length; j++) {
            if (elements[j] > n) {
                sum += elements[j];
            }
        }
        System.out.println(sum);

    }
}