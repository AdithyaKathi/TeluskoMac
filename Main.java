package com.day.two;

import com.day.two.Product;
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService service = new ProductService();
		
		Product product = new Product("Lenovo FlexPad","Laptop","Brown Table",2024);
		
		// Add The Products
		service.addProduct(product);
		service.addProduct(new Product("Vivo Y51","Mobile","Desk",2022));
		service.addProduct(new Product("Vooc Charger","Charger","Adapter",2024));
		service.addProduct(new Product("Sony Bravia","Television","Living Room",2024));
		service.addProduct(new Product("Voltas","AC","Hall",2024));
		
		
		// Get All The Products
		  List<Product> products = service.getAllProducts(); 
		  for(Product p : products){ 
			  System.out.println(p); 
		  }
		 
		
		
		System.out.println("===========================================================================");
		
		System.out.println("A Particular Product");
		Product p = service.getProduct("Voltas");
		System.out.println(p);
		
		System.out.println("Searching Product By Text :");
		List<Product> prods = service.getProductWithText("vivo");
		
		for(Product pr : prods) {
			System.out.println(pr);
		}
		
		System.out.println("============================================================================");
		System.out.println("Searching Product By Place : ");
		
		
		List<Product> prod = service.getProductByPlace("desk");
		for(Product p1 : prod) {
			System.out.println(p1);
		}
		
		System.out.println("=============================================================================");
		System.out.println("Getting Products Out Of Warranty : ");
		List<Product> ps = service.getProductOutOfWarranty();
		for(Product pr : ps) {
			System.out.println(pr);
		}
		

	}

}
