package com.hexaware.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.IProductService;
import com.hexaware.springjdbc.service.ProductServiceImp;

/**
 * Hello world!
 *
 */
public class App {
	
	static Scanner scanner=new Scanner(System.in);
	

	public static void main( String[] args )
    {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		IProductService service=context.getBean(ProductServiceImp.class);
		
		boolean flag=true;
		
		while(flag) {
		
		System.out.println("\n\nWelcome to Department Management System***************");
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. Select By Id");
		System.out.println("5. Select All");
		System.out.println("6. Exit");
		
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			Product product=readData();
			boolean isInserted=service.createProduct(product);
			
			if(isInserted) {System.out.println("Record Inserted Successfully..");}
			else {System.err.println("Failed to insert..");}
			
			break;
		case 2:
			Product updatedProduct = readData();

			boolean isUpdated = service.updateProduct(updatedProduct);

			if (isUpdated) {
				System.out.println("Record Updated successfully...");
			} else {

				System.err.println("Update fail...");
			}

			break;

		case 3:
			System.out.println("Enter pid");
			boolean isDeleted=service.deleteProductbyId(scanner.nextInt());
			if(isDeleted) {
				System.out.println("Record Deleted Successfully..");
				}
			else {
				System.err.println("Failed to delete..");
				}
			break;
			
		case 4:
			System.out.println("Enter pid");
			int pid=scanner.nextInt();
			
			Product productFound=service.selectProductbyId(pid);
			if(productFound!=null) {
				System.out.println(productFound);
			}
			else {
				//throw new productnot found
				System.err.println("Product not found");
			}
			break;
		
		case 5:
			List<Product> list=service.selectAll();
			list.stream().forEach(System.out::println);
			break;
			
			
			
		case 6:
			flag=false;
			break;
	

		default:
			break;
		}
        
        
    }
}
	
	public static Product readData() {
		
		Product product=new Product();
		System.out.println("Enter Product Id:");
		product.setProductId(scanner.nextInt());
		
		System.out.println("Enter Product Name:");
		product.setProductName(scanner.next());
		
		System.out.println("Enter Price:");
		product.setPrice(scanner.nextDouble());
	
		return product;
	}
	
	
	
}
