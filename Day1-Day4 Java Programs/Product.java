package wd;

public class Product {
	String name;  //instance
	double price;  //instance
	static int Total_Products=0;  //static
	Product(String n,double p){
		name=n;
		price=p;
		Total_Products++;
	}
	void display() {
		double gst=price*0.18;  //local 
		double finalPrice=price+gst;  //local
		System.out.println(name+" final price with GST: "+ finalPrice);
		
	}
	public static void main(String[] args) {
		Product p1=new Product("Laptop",60000);
		Product p2=new Product("Mobile", 30000);
		p1.display();
		p2.display();
		System.out.println("Total Products in Cart : "+ Total_Products);
	}
	

}
