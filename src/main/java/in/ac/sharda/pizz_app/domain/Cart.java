package in.ac.sharda.pizz_app.domain;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Cart {
	private int id;     //*** 8.) ADDED A STATE ITEM IN THE CART
	public Set<Product> uniqueItem=new TreeSet<>();
	private int cartid; //*** 9.) ADDED A STATE THAT MAKES YOUR CART UNIQUE
	// IMPORTED A LIST NAMED AS PRODUCT
	// ...Added a new Array List
	public List<Product> products;
	public void add()
    {
    	for(int i=0;i<20;i++)
    	{
    		this.uniqueItem.add(new Product(i,i*100,"Name "+i,"Description: "+i));
    	}
    }

	public void removeitem(Product product) {
		this.products.remove(product);   //***10 ADDED A BEHAVIOUR TO REMOVE ITEM  
	}
	public void add(Product product) {
		this.products.add(product);   //***11 ADDED A BEHAVIOUR TO ADD ITEM  
	}
	//*** 12.) ALL POSSIBLE CONSTRUCTORS
	public Cart(Set<Product> uniqueItem, int cartid, List<Product> products) {
		this.uniqueItem = uniqueItem;
		this.cartid = cartid;
		this.products = products;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	@Override
	public boolean equals(Object arg0) {

    	if(arg0 instanceof Cart)
    	{
    		return ((Cart)arg0).getCartid()==cartid;
    	}
    	return false;
    }
	

}
