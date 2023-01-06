import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int number;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number == 1) {
                larger += 1;
            } else if (number == -1) {
                smaller += 1;
            } else if (number == 0) {
                perfect += 1;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}