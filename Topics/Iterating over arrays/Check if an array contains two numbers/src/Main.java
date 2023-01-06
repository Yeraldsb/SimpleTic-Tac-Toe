import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        boolean check = false;
        int result =0;


        for (int i =0; i< array.length; i++){
             array[i] = scanner.nextInt();
        }

        for (int i = 0; i <array.length -1; i++){
            if (array[i] == array[i + 1] ){
                check = true;
            }
        }
        System.out.println(check);
    }
}