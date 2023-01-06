import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // for (int i =0; i <= userNum; i++)

        int num = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (num <= counter) {
                    break;
                }
                counter++;
                System.out.println(i);
            }
        }
    }
}