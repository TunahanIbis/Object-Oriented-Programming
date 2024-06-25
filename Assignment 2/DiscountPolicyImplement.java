// Rest of Problem IV

public class DiscountPolicyImplement implements DiscountPolicyInterface {
    private String count;
    private int itemCost;

    public void computeDiscount(String count, int itemCost) {
        this.count = count;
        this.itemCost = itemCost;
    }

    public String getcount() {
        return count;
    }

    public int getitemCost() {
        return itemCost;
    }

    public static void main(String[] args) {
        BultDiscount b = new BultDiscount(10, 15);
        System.out.println(b.computeDiscount(5, 5));
        BuyNItemsGetOneFree a = new BuyNItemsGetOneFree(4);
        System.out.println(a.computeDiscount(8, 14));
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        throw new UnsupportedOperationException("Unimplemented method 'computeDiscount'");
    }

    }
