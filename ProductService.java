package com.day.two;
import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public class ProductService {
	List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public void removeProduct(Product p) {
		products.remove(p);
	}
	
	public Product getProduct(String name) {
		for(Product p : products) {
			if(p.getName().equals(name)) return p;
		}
		return null;
	}
	
	public List<Product> getAllProducts() {
		return products;
	}
	
	public List<Product> getProductWithText(String text){
		List<Product> prods = new ArrayList<>();
		for(Product p : products) {
			String name = p.getName().toLowerCase();
			String type = p.getType().toLowerCase();
			String place = p.getPlace().toLowerCase();
			if(name.contains(text) || type.contains(text) || place.contains(text)) {
				prods.add(p);
			}
		}
		return prods;
	}
	
	public List<Product> getProductByPlace(String place){
		List<Product> prdts = products.stream()
        .filter(p -> p.getPlace().toLowerCase().equals(place))
        .collect(Collectors.toList());
		
		return prdts;
	}
	
	public List<Product> getProductOutOfWarranty(){
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		List<Product> prds = products.stream()
				.filter(p -> p.getWarranty() < year)
				.collect(Collectors.toList());
		
		return prds;
	}
}
