class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    // Overriding method to apply specific price calculation for Electronics
    @Override
    public double calculatePrice() {
        // Electronics may have additional taxes or fees
        return this.price + (this.price * 0.10); // 10% tax
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    // Overriding method to apply specific price calculation for Clothing
    @Override
    public double calculatePrice() {
        // Clothing items may have seasonal sales
        return this.price - (this.price * 0.15); // 15% discount
    }
}

class Groceries extends Product {
    public Groceries(String name, double price) {
        super(name, price);
    }

    // Overriding method to apply specific price calculation for Groceries
    @Override
    public double calculatePrice() {
        // Groceries might have bulk discounts
        return this.price - (this.price * 0.05); // 5% discount
    }
}
