import java.util.Arrays;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString(){
    return "Заказ[покупатель=" + customer + ", товары=" + Arrays.toString(basket) + "]";
}
}


