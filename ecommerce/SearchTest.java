import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {

        Product[] products = {
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Rice", "Groceries"),
            new Product("003", "Table", "Furniture")
        };

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        Product resultLinear = SearchAlgorithms.linearSearch(products, "002");
        System.out.println("Linear Search Result: " + resultLinear);

        Product resultBinary = SearchAlgorithms.binarySearch(products, "002");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
