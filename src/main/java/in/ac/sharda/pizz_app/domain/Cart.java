package in.ac.sharda.pizz_app.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int id;     //*** 8.) ADDED A UNIQUE ITEM IN THE CART
	// IMPORTED A LIST NAMED AS PRODUCT
	// ...Added a new Array List
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		this.products.add(product);
	}

}
