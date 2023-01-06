import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long usersNumber = scanner.nextLong();
        long number = 1;
        long factorial = 1;

        do {
            factorial *= number;
            number++;
        } while (factorial <= usersNumber);

        System.out.println(number - 1);
    }
}
