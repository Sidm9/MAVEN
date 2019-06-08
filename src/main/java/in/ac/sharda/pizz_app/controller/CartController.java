package in.ac.sharda.pizz_app.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import in.ac.sharda.pizz_app.domain.Product;
//4.) CREATED A REST CONTROLLER 

@RestController

public class CartController {
	// 5.) ADDED A LIST OF CART HAVING PRODUCT
	List<Product> del = new ArrayList<>();

	public List<Product> addProduct(Product product) {
		for (int i = 0; i < 20; i++) {
			this.del.add(new Product(i, i * 100, "Name " + i, "Description " + i));
		}
		return this.del;
	}

	// *** 6.) ADDED A BEHAVIOUR MAPPING IN CARTCONTROLLER TO REMOVE ITEMS FROM THE
	// CART
	@GetMapping("/list/delete")
	public List<Product> delete(Product p) {
		
		return this.del;
	}

	@GetMapping("/count/list")
	public int countProduct() {
		// 7.) COUNT ITEMS IN CART
		return this.del.size();
	}

}
