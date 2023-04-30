package project;

import java.util.ArrayList;

public class shop {
	private int  id;
	private int price;
	private int quantity;
	private String name;
	private String Company;
	
	
	
	//functions start
	
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public void addstock(shop s){
		this.id =s.id ;
		this.name=s.name;
		this.price=s.price;
		this.quantity=s.quantity;
		this.Company=s.Company;
		
		
	}
	
	public void viewstock() {
		
	}
	
	public void searchstock() {
		
	}
	
	public void editstock() {
		
	}
	
	public void deletestock() {
		
	}
	
	public void displayitems(ArrayList<shop>arr) {
		for (shop shop : arr) {
			System.out.println("**------------------------------------**");
			System.out.println("Product ID"+shop.id);
			System.out.println("Product Name"+shop.name);
			System.out.println("Product Parice"+shop.price);
			System.out.println("Product Quantity"+shop.quantity);
			System.out.println("Product Company"+shop.Company);
			System.out.println("**------------------------------------**");
			
		}
	}
	
	
	
	
	

}
