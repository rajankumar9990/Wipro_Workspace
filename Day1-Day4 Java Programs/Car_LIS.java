package wd;

public class Car_LIS {
	String model;    //instance
	double price;     //instance
	static String shopName="Car World";      //static
	Car_LIS(String m,double p){
		model=m;
		price=p;
	}
	void display_discount() {
		double discount_price=price*0.8;    //20% discount
		System.out.println(model + " at " + shopName + " costs " + discount_price + " after discount.");
	}
	public static void main(String[] args) {
		Car_LIS c1=new Car_LIS("Alto",150000);
		Car_LIS c2=new Car_LIS("BMW",5000000);
		c1.display_discount();
		c2.display_discount();
		
		//static variable change
		
		System.out.println("\n");
		shopName="Car Kharido";
		System.out.println("After changing showroom name:");

		c1.display_discount();
		c2.display_discount();
		
		
	}

}
