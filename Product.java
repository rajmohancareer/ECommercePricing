class Product {
 
String name ;
double price ;
 

//constructor
public Product(String name, double price){
    this.name = name;
    this.price = price;
}

//method to calculate (to be overridden in the class)
 public double calculatePrice(){
    return this.price;
 }
    
// Method overloading: Calculate price with discount
public double calculatePrice(double discountPercentage) {
    return this.price - (this.price * discountPercentage / 100);
}
}