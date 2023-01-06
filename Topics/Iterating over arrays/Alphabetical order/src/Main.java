import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String[] characters = scanner.nextLine().split(" ");
        boolean ordered = true;

        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i].compareTo(characters[i + 1]) >= 1) {
                ordered = false;
            }
        }

        System.out.println(ordered);

    }

}