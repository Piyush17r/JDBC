package project;

import java.util.ArrayList;
import java.util.Scanner;

public class mainclass {
	
	static void menu() {
		System.out.println("1-Add Stock");
		System.out.println("2-view Stock");
		System.out.println("3-Search Stock");
		System.out.println("4-Edit Stock");
		System.out.println("5-Delete Stock");
		System.out.println("0-Exit");
		
	}
	
	public static void main(String[]args) {
		int opt;
		Scanner sc = new Scanner(System.in);
		ArrayList<shop> shopList =new ArrayList<shop>();
		do {
			shop s =new shop();
			menu();
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter Product ID");
				s.setId(sc.nextInt());
				System.out.println("Enter Product Name");
				sc = new Scanner(System.in);
				s.setName(sc.next());
				System.out.println("Enter Product Price");
				s.setPrice(sc.nextInt());
				System.out.println("Enter Product Quantity");
				s.setQuantity(sc.nextInt());
				System.out.println("Enter Product Company");
				s.setCompany(sc.next());
				
			
				break;
			case 2:
				s.displayitems(shopList);
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				
			default:
				break;
			}
	
		}while (opt != 0);
			
	}

}
