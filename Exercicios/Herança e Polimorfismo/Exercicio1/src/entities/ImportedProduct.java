package entities;

public class ImportedProduct extends Product {

    private Double CustomsFeee;

    public ImportedProduct(String name, double price, Double customsFeee) {
        super(name, price);
        CustomsFeee = customsFeee;
    }

    public Double getCustomsFeee() {
        return CustomsFeee;
    }

    public void setCustomsFeee(Double customsFeee) {
        CustomsFeee = customsFeee;
    }

    @Override
    public String priceTag() {
        return
    }

    public Double totalPrice(){
        setPrice(getPrice() + getCustomsFeee());
        return  getPrice();
    }
}
