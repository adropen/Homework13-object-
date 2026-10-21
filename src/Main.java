void main() {
    Product product1 = new Product(8, "Мормышка", 250, "Рыбак");
    Product product2 = new Product(2, "Банан", 15, "Фрукт");
    Product product3 = new Product(8, "Поплавок", 1150, "Рыбак");
    Product[] basket = {product1, product2, product3};
    System.out.println(product1);
    System.out.println(product2);
    System.out.println(product3);
    System.out.println(product1.equals(product2));
    System.out.println(product1.equals(product3));
    Order order1 = new Order("Артур", basket);
    System.out.println(order1);

}