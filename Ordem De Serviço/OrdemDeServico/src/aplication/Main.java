package aplication;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birth);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n ; i++) {
            System.out.println("Enter #" + (i+1) + " item data:" );
            System.out.print("Product name: ");
            String itemName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(new Product(itemName, price), quantity);
            order.addItem(orderItem);

        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);
    }
}
