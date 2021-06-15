package application;

public class CoffeeOrder {

	private int id;
	private int quantity;
	private String productName;
	private String customerName;	
	
	public CoffeeOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoffeeOrder(int id, int quantity, String productName, String customerName) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.productName = productName;
		this.customerName = customerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "CoffeeOrder [id=" + id + ", quantity=" + quantity + ", productName=" + productName + ", customerName="
				+ customerName + "]";
	}		
}
