import java.util.Scanner;
public class Fruits { //super class
	Scanner s = new Scanner(System.in);
	
	protected double weight, price;  
	protected int quantity;
	public Fruits() {//constructor with no argument
		System.out.println("Fruits constructor is invoke"); 
		System.out.print("Please enter weight(kg): ");
		this.weight = s.nextDouble();
		System.out.print("Please enter your quantity: ");
		this.quantity = s.nextInt(); 	
			
	}
	
	public Fruits(double W, int Q, double P) {//constructor with argument
		
		setWeight(W,Q);
		setPrice(P,W);
		
	}
	
	public void setWeight(double W, int Q) {
		
	}
	
	public void setPrice(double Price, double W) {
		
		if(this.weight > 0.5)
			this.price = 16.5;
		else
			this.price = 18.5;
		
		System.out.println("Price: RM" + this.price);
	}
	public double getWeight() {
		return this.weight;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;			
	}
	public double TotalWeight() {//overriding method
		return this.weight*this.quantity;
	}
	
	
	public String toString(){//overriding method
		return("Weight: " + this.weight +"\n" + "Quantity: " + this.quantity +"\n" + "Total Weight: " + TotalWeight() + "\n" + "Price: RM" + getPrice());
	}
	

}
