package in.ac.sharda.pizz_app.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int id;     //*** 8.) ADDED A STATE ITEM IN THE CART
	private int cartId; //*** 9.) ADDED A STATE THAT MAKES YOUR CART UNIQUE
	// IMPORTED A LIST NAMED AS PRODUCT
	// ...Added a new Array List
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		this.products.add(product);
	}
	public void removeitem(Product product) {
		this.products.remove(product);   //***10 ADDED A BEHAVIOUR TO REMOVE ITEM  
	}

}
