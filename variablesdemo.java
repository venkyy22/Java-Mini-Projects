import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chicken:");
        int chickens = Integer.parseInt(scanner.nextLine());

        System.out.println("Bacon (kg):");
        double baconKg = Double.parseDouble(scanner.nextLine());

        scanner.nextLine(); // Clears the leftover newline

        System.out.println("Tractor:");
        String tractor = scanner.nextLine();

        System.out.println("\nAnd finally, a summary:");
        System.out.println(chickens);
        System.out.println(baconKg);
        System.out.println(tractor);
    }
}
