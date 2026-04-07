package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private List <OrderItem> items  = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total (){
        double soma = 0.0;
        for (OrderItem it : items){
            soma += it.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status+ "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order Itens: \n");
        for (OrderItem item : items){
            sb.append(item + "\n");
        }
        sb.append("Total Price: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();

    }
}
