import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int squared = 1;
        int i = 1;
        do {
            squared = i * i;
            if (squared <= num) {
                System.out.println(squared);
                i++;
            }
        } while (squared <= num);
    }
}
