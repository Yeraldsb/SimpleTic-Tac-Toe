import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Long num1 = scanner.nextLong();
        char op = scanner.next().charAt(0);
        Long num2 = scanner.nextLong();

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num2 == 0 ? "Division by 0!" : num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}