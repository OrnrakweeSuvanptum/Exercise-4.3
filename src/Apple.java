
public class Apple extends Fruits { //sub class
	
	private double discount; 
	
	Apple() {
		super();
	}

	public double TotalPrice() {
		
		price = this.price*this.quantity;
		return price;
	}
	public double calDiscount() {
	
		discount = TotalPrice()*5/100;
		return discount; 
	}
	
	public double calPriceAfterDiscount() {
		
		price = TotalPrice() - discount; 
		return price; 
	}
	
	public String toString() {
		return ("Total Price: RM" + TotalPrice() + "\n" + "Discount: RM" + calDiscount() + "\n" + "Total Price after discount: RM" + calPriceAfterDiscount());
	}

}
