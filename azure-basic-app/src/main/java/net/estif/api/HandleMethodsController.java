package net.estif.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleMethodsController {
	
	@GetMapping("/getproduct")
	public Product getproduct() {
		return new Product("nice", "20", "here");
	}
	
	@GetMapping("/getproducts")
	public List<Product> getproducts() {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("nice", "20", "here"));
		products.add(new Product("very", "20", "there"));
		products.add(new Product("very nice", "20", "every where"));
		
		return products;
	}
	
	@PostMapping("/addproduct")
	public void  createproduct(@RequestBody Product product) {
		System.out.println(product);
	}
	@PutMapping("/")
	public String update() {
		return "get request";
	}
	@DeleteMapping("/")
	public String delete() {
		return "get request";
	}
	
	
}
