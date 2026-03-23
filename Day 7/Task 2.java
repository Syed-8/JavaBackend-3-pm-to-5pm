package Assignment7;

public class ProductPrice {
	int productid;
	String productname;
	int productprice;
	int productquantity;
	int finalprice;
	
	ProductPrice(int i,String s ,int p,int q){
		productid = i;
		productname = s;
		productprice = p;
		productquantity = q;
	}
	

	 void CalculateTotalPrice(){
		 
		 finalprice = productprice*productquantity;
		 
		 System.out.println("ID :" + productid);
		 System.out.println("Name :" + productname);
		 System.out.println("Price :" + productprice);
		 System.out.println("Quantity :" + productquantity);
		 
		 System.out.println("Enter the Final Price :" + finalprice);
		 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductPrice p1 = new ProductPrice(1,"Iphone",55000,2);
		ProductPrice p2 = new ProductPrice(2,"Samsung",65000,2);
		
		
		p1.CalculateTotalPrice();
		p2.CalculateTotalPrice();
		
		
		
	}

}
