// Problem I
    // Create an abstract class DiscountPolicy. It should have a single abstract method computeDiscount that will return the discount for the purchase of a given number of a single item.
    // The methods has two parameters count and itemCost.

    abstract class DiscountPolicy {
        public abstract double computeDiscount(int count, double itemCost);
    }

    // Problem II
    // Derive a class BulkDiscount from DiscountPolicy as descibed in problem 1. It should have a constructor that has two parameters, minimum and percent.
    // It should define the method computeDiscount so that if the quantity purchased of an item is more than minimum, the discount is percent percent.

    class BultDiscount extends DiscountPolicy {
        int minimum;
        double percent;

        public BultDiscount(int minimum, int percent) {
            this.minimum = minimum;
            this.percent = percent;
        }

        // If count is greater than minimum, itemCost and percent of the discount should be multiplied to see how much discount we are going to get.

        public double computeDiscount(int count, double itemCost) {
            if (count > minimum) {
                return itemCost * (percent / 100);
            } else {
                return 0.0;
            }
        }
    }

    // Problem III
    // Derive a class BuyNItemsGetOneFree from DiscountPolicy, as described in problem 1. The class should have a constructor that has a single parameter n.
    // In addition, the class should define the method computeDiscount so that every nth item is free.

    class BuyNItemsGetOneFree extends DiscountPolicy {
        int n;

        public BuyNItemsGetOneFree(int n) {
            this.n = n;
        }

        // Result of the division between count and n will tell us which item is going to be free.

        public double computeDiscount(int count, double itemCost) {
            int free = count / n;
            return free * itemCost;
        }
    }

    // Tests
    public class DiscountPolicyTest {
        public static void main(String[] args) {
            BultDiscount b = new BultDiscount(10, 15);
            System.out.println(b.computeDiscount(5, 5));
            BuyNItemsGetOneFree a = new BuyNItemsGetOneFree(4);
            System.out.println(a.computeDiscount(8, 14));
        }
    }
