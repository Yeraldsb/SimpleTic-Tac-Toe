import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here


       /* int height = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= numberOfBridges; i++) {
            int bridges = scanner.nextInt();
            if (height >= bridges) {
                System.out.println("Will crash on bridge " + i);
                break;

            } else if (height < bridges && i == numberOfBridges) {
                System.out.println("Will not crash");
            }

        }*/
        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"

    }
}