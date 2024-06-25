// Write your solutions into the parts where you see:
// YOUR CODE STARTS HERE

// YOUR CODE ENDS HERE
// Do not change anything except those.

public class Assignment1 {
	/**
	 * Takes a date as a string, splits it with the separator "-"
	 * and returns its parts as an integer array. For example, day value
	 * of the date can be accessed with parsedDate[0],
	 * month value with parsed date[1] etc.
	 * 
	 * @param date a date in the format DD-MM-YYYY
	 * @return day, month, year values of the date
	 */
	public static int[] parseDate(String date) {
		// DO NOT CHANGE ANYTHING
		String[] parts = date.split("-");
		int[] parsedDate = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			parsedDate[i] = Integer.parseInt(parts[i]);
		}

		return parsedDate;
	}

	public static int calculateDaysBetween(String date1, String date2) {
		int[] parsedDate1 = parseDate(date1);
		int[] parsedDate2 = parseDate(date2);

		// DO NOT CHANGE ANYTHING EXCEPT THIS PART
		// Use parsedDate1 and parsedDate2 arrays to access day,
		// month and year values, and make your calculations.

		// YOUR CODE STARTS HERE

		// We should sum the difference between days, by accepting a month 30 days and a year 360 days. 
		int differencebtwdays = (parsedDate2[0] - parsedDate1[0]) + ((parsedDate2[1] - parsedDate1[1]) * 30) + ((parsedDate2[2] - parsedDate1[2]) * 360);
		System.out.println(differencebtwdays);
		return 0;

		// YOUR CODE ENDS HERE
	}

	public static double shoppingCartPrice(String[] shoppingCart) {
		// DO NOT CHANGE ANYTHING EXCEPT THIS PART
		// YOUR CODE STARTS HERE
		// The values for shopping items are like;
		double cokePrice = 12.32;
		double chipsPrice = 19.98;
		double chocolatePrice = 7.12;
		double popcornPrice = 5.67;

		// The total price can be found by using "if" function;
		double totalPrice = 0.0;
		for (int i = 0; i < shoppingCart.length; i++) {
			String item = shoppingCart[i];
			if (item.equals("coke")) {
				totalPrice += cokePrice;
			} else if (item.equals("chips")) {
				totalPrice += chipsPrice;
			} else if (item.equals("chocolate")) {
				totalPrice += chocolatePrice;
			} else if (item.equals("popcorn")) {
				totalPrice += popcornPrice;
			}
		}
		return totalPrice;

		// YOUR CODE ENDS HERE
	}

	public static void shoppingCartPercentage(String[] shoppingCart) {
		// DO NOT CHANGE ANYTHING EXCEPT THIS PART
		// YOUR CODE STARTS HERE
		double cokePrice = 12.32;
		double chipsPrice = 19.98;
		double chocolatePrice = 7.12;
		double popcornPrice = 5.67;

		double totalCokePrice = 0.0;
		double totalChipsPrice = 0.0;
		double totalChocolatePrice = 0.0;
		double totalPopcornPrice = 0.0;

		double totalPrice = 0.0;
		for (int i = 0; i < shoppingCart.length; i++) {
			String item = shoppingCart[i];
			if (item.equals("coke")) {
				totalCokePrice += cokePrice;
			} else if (item.equals("chips")) {
				totalChipsPrice += chipsPrice;
			} else if (item.equals("chocolate")) {
				totalChocolatePrice += chocolatePrice;
			} else if (item.equals("popcorn")) {
				totalPopcornPrice += popcornPrice;
			}
		}

		totalPrice = totalCokePrice + totalChipsPrice + totalChocolatePrice + totalPopcornPrice;

		Double[] totalPriceList = { totalCokePrice, totalChipsPrice, totalChocolatePrice, totalPopcornPrice };

		for (int i = 0; i < 4; i++) {
			int numStars = (int) Math.round(((totalPriceList[i] / totalPrice) * 100));
			String star = "*".repeat(numStars);
			String shoppingitemname = "";
			if (i == 0) {
				shoppingitemname = "coke";
			} else if (i == 1) {
				shoppingitemname = "chips";
			} else if (i == 2) {
				shoppingitemname = "chocolate";
			} else if (i == 3) {
				shoppingitemname = "popcorn";
			}
			System.out.println(String.format("%s %s", star, shoppingitemname));
		}

		// YOUR CODE ENDS HERE
	}

	public static void main(String[] args) {
		// You can make your tests here
		calculateDaysBetween("11-10-2023", "22-10-2023"); // 12
		calculateDaysBetween("30-12-2022", "01-01-2023"); // 1
		String[] shoppingCart = { "coke", "chips", "chips", "popcorn" };
		System.out.println(shoppingCartPrice(shoppingCart));
		shoppingCartPercentage(shoppingCart);
	}
}