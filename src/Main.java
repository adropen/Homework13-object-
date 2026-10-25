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
    Order order2 = new Order("Артур", basket);
    Order order3 = new Order("Артур", new Product[]{product1, product2, product3});
    Order order4 = new Order("Артур", new Product[]{product2, product1, product3});
    System.out.println(order2.equals(order3));
    System.out.println(order2.equals(order4));
}