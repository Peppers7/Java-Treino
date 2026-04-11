import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        int   n = sc.nextInt();
        sc.nextLine();
        Product[] vector = new Product[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            vector[i] = new Product(name, price);
        }

        for (int i = 0; i < n; i++) {
            sum += vector[i].getPrice();
        }

        double average = sum/n;

        System.out.printf("AVARAGE PRICE = %.2f", average);
    }
}