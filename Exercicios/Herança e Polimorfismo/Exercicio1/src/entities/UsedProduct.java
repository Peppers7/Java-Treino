package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
    LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.priceTag();
    }
}
