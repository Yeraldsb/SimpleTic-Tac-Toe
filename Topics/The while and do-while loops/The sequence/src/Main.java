import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nums;
        int max = 0;

        do {
            nums = scanner.nextInt();
            if (nums > max && nums % 4 == 0 && nums != 8) {
                max = nums;
            }

        }while (scanner.hasNext());
        System.out.println(max);
        scanner.close();
    }
}
