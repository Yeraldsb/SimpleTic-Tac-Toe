import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cases = scanner.next();

        switch (cases) {
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }
    }
}