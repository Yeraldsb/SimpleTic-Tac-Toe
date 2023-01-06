import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arrayElements = new int[arraySize];
        boolean contains = false;

        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int j = 0; j < arrayElements.length; j++) {
            if (n == arrayElements[j]) {
                contains = true;
            }
        }
        System.out.println(contains);
    }
}