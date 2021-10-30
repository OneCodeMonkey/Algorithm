// AC: Runtime: 111 ms, faster than 99.28% of Java online submissions for Apply Discount Every n Orders.
// Memory Usage: 71.8 MB, less than 56.12% of Java online submissions for Apply Discount Every n Orders.
// .
// T:O(n), S:O(n)
//
class Cashier {
    private int customerIndex = 0;
    private final int discountMod;
    private final int discountValue;
    private HashMap<Integer, Integer> productToPrice;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        discountMod = n;
        discountValue = discount;
        productToPrice = new HashMap<>();
        for (int i = 0; i < products.length; i++) {
            productToPrice.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        customerIndex++;
        double sum = 0;
        for (int i = 0; i < product.length; i++) {
            sum += productToPrice.get(product[i]) * amount[i];
        }
        if (customerIndex % discountMod == 0) {
            sum = sum * (100.00000 - discountValue) / 100;
        }

        return sum;
    }
}