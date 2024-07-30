import java.util.*;

public class Inventory {
    public static class Product {
        public int productId;
        public String productName;
        public int quantity;
        public double price;

        // Constructor
        public Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }
        @Override
        public String toString() {
            return "[" + productId + ", '" + productName + "', " + quantity + ", " + price + "]";
        }
    }


    public List<Product> products;

    // Constructor
    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to update a product
    public void updateProduct(int productId, String field, Object newValue) {
        for (Product product : products) {
            if (product.productId == productId) {
                switch (field) {
                    case "name":
                        product.productName = (String) newValue;
                        break;
                    case "quantity":
                        product.quantity = (int) newValue;
                        break;
                    case "price":
                        product.price = (double) newValue;
                        break;
                    default:
                        System.out.println("Invalid field!");
                        return;
                }
                System.out.println("Product updated successfully!");
                return;
            }
        }
    }

    // Method to delete a product
    public void deleteProduct(int productId) {
        products.removeIf(product -> product.productId == productId);
    }

    // Method to display all products
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        boolean b= true;
        while(b){
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose a number");
        System.out.println("1. add products");
        System.out.println("2. update products");
        System.out.println("3. delete products");
        System.out.println("4. display products");
        System.out.println("5. exit");
        int ch=sc.nextInt();
            switch(ch){
            case 1: {
                System.out.println("Enter how many products you want to add");
                int times=sc.nextInt(); 
                for (int i=0; i<times;i++){
                    System.out.println("Enter product name");
                    String productName= sc.next();
                    sc.nextLine();
                    System.out.println("Enter product id");
                    int productId=sc.nextInt();
                    System.out.println("Enter quantity");
                    int quantity=sc.nextInt();
                    System.out.println("Enter price");
                    double price= sc.nextDouble();
                    Product product1 = new Product(productId,productName,quantity,price);
                    inventory.addProduct(product1);
                    
                }
                break;      
            }
            case 2:
            {
                System.out.println("Enter the product ID to be updated");
                    int productId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter the field to be updated (name/quantity/price):");
                    String field = sc.nextLine();
                    System.out.println("Enter the new value:");
                    Object newValue = null;
                    switch (field) {
                        case "name":
                            newValue = sc.nextLine();
                            break;
                        case "quantity":
                            newValue = sc.nextInt();
                            break;
                        case "price":
                            newValue = sc.nextDouble();
                            break;
                        default:
                            System.out.println("Invalid field!");
                            continue;
                    }
                    inventory.updateProduct(productId, field, newValue);
                    break;
            }
            case 3:
            {
                System.out.println("Enter product id to be deleted");
                int prod_id=sc.nextInt();
                inventory.deleteProduct(prod_id);
                break;
            }
            case 4:
            {
                System.out.println("Inventory");
                inventory.displayProducts();
                break;
            }
            case 5:
            {
            b=false;
            break;
            }
        }  
        sc.close();
        }
    }
}
