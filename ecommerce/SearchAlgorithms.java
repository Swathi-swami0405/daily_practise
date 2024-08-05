public class SearchAlgorithms {

    public static Product linearSearch(Product[] products, String targetProductId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId))
                return product;
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String targetProductId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(targetProductId);

            if (comparison == 0)
                return products[mid];
            else if (comparison < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
