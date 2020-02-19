package assignment2;

public final class Product {
	final String name;
	final String description;
	final double price;
	final int maximumQuanity;
	Product(String name, String description, double price, int maximumQuanity){
		this.name = name;
		this.description = description;
		this.price = price;
		this.maximumQuanity = maximumQuanity;
	}
	String getName() {
		return name;
	}
	String getDescription() {
		return description;
	}
	double getPrice() {
		return price;
	}
	int getMaximumQuanity() {
		return maximumQuanity;
	}
	public String toString() {
		return("Product name: "+ getName()
				+ "\nProduct description: " + getDescription()
				+ "\nPrice: $"+ getPrice()
				+ "\nMaximum quanity allowed to be ordered: "+ getMaximumQuanity());
	}
}
