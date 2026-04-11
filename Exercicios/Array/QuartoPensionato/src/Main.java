import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        sc.nextLine();
        Rent[] rent = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            System.out.println();

            rent[room] = new Rent(name, email);
        }
        System.out.println("\nBusy rooms:");

        for (int i = 0; i < 10; i++) {
            if (rent[i] != null){
                System.out.println(i + ": " + rent[i].getName() + rent[i].getEmail());
            }
        }

    }
}