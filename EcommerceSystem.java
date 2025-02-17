public class EcommerceSystem {
    public static void main(String[] args) {
        // Create objects for different products
        Product product1 = new Electronics("Laptop", 1000);
        Product product2 = new Clothing("T-shirt", 50);
        Product product3 = new Groceries("Apple", 2);

        // Use method overriding to calculate prices based on product type
        System.out.println("Electronics Price: $" + product1.calculatePrice());
        System.out.println("Clothing Price: $" + product2.calculatePrice());
        System.out.println("Groceries Price: $" + product3.calculatePrice());

        // Demonstrate method overloading for price calculation with discount
        System.out.println("Laptop Price with 20% Discount: $" + product1.calculatePrice(20));
        System.out.println("T-shirt Price with 10% Discount: $" + product2.calculatePrice(10));
        System.out.println("Apple Price with 5% Discount: $" + product3.calculatePrice(5));
    }
}
