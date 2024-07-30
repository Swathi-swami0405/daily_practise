import java.util.*;
public class Inventory{
    public ArrayList<Product> arr;
    class Product{
    int product_id;
    String product_name;
    int quantity;
    float price;
    }
    public Product(int product_id, String product_name, int quantity, float price){
        this.product_id=product_id;
        this.product_name=product_name;
        this.quantity=quantity;
        this.price=price;
    }
    public Inventory(){
        arr= new ArrayList<Product>();
    }
    public void addProduct(Product product){
        arr.add(product);
        System.out.println("Product added successfully");
    }
    public void display(){
        for (Product pro: arr){
            System.out.println(product);
        }
    }
    public static void main(String[] args){
        Inventory inventory= new Inventory();
        Product p1= new Product(1, "Laptop", 10, 999.99);
        inventory.addProduct(p1);
        
    }
}