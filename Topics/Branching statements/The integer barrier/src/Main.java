import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int userInput = 0;
        int sum = 0;
        while (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
            sum += userInput;
            if (userInput == 0) {
                System.out.println(sum);
                break;
            } else if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }

        }
    }
}