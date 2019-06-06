package in.ac.sharda.pizz_app.domain;

public class Product {

	private int id;
	private int price;
	private String name,description;
	
	// GETTERS AND SETTER BECAUSE "PRIVATE"
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//CONSTRUCTOR AUTO DEFINED..... 
	public Product(int id, int price, String name, String description) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	//Equals .....
	@Override
	public boolean equals(Object obj) {
		//Object is the instance of product
		if(obj!=null && obj instanceof Product)
			return ((Product)obj).getId() == id;
		return false;
	}
}