package com.hexaware.hibernate_practice;

import java.util.List;
import java.util.Scanner;

import com.hexaware.hibernate_practice.models.HealthCareProvider;
import com.hexaware.hibernate_practice.services.HealthCareProviderServiceImp;
import com.hexaware.hibernate_practice.services.IHealthCareProviderService;

/**
 * Hello world!
 *
 */
public class App 
{	static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    
    {
    	
    	
        IHealthCareProviderService service=new HealthCareProviderServiceImp();
        
        boolean flag = true;

		while (flag) {

			System.out.println("\n\nWelcome to HealthCareProvider Management System***************");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Select By Name");
			System.out.println("5. Select All");
			System.out.println("6. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				HealthCareProvider healthCareProvider = readData();
				try {
				service.createHealthCareProvider(healthCareProvider);
				System.out.println("Inserted Successfully...");
				}
				catch(Exception e) {
					System.out.println("Sorry unable to enter record...");}
				break;
			
			case 2:
				HealthCareProvider healthCareProvider1 = readData();
				try {
				service.updateHealthCareProvider(healthCareProvider1);
				System.out.println("Updated Successfully...");
				}
				catch(Exception e) {
					System.out.println("Sorry unable to update record...");}
				break;
				
			case 3:
				HealthCareProvider healthCareProvider2 = readData();
				try {
				service.deleteHealthCareProvider(healthCareProvider2);
				System.out.println("Deleted Successfully...");
				}
				catch(Exception e) {
					System.out.println("Sorry unable to delete record...");}
				break;

			case 4:
				scanner.nextLine();
				System.out.println("Enter Health Care Provider Name:");
				String name = scanner.nextLine();

				List<HealthCareProvider> list = service.selectHealthCareProviderByName(name);
				list.stream().forEach(System.out::println);
				break;
		
			case 5:
				List<HealthCareProvider> listAll = service.selectAllHealthCareProvider();
				listAll.stream().forEach(System.out::println);
				break;

			case 6:
				flag = false;
				break;

			default:
				break;
			}

		}
	}

	public static HealthCareProvider readData() {

		HealthCareProvider healthCareProvider = new HealthCareProvider();

		System.out.println("Enter Healthcare Provider Id:");
		healthCareProvider.setHealthCareId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter Healthcare Provider Name:");
		healthCareProvider.setHealthcareProviderName(scanner.nextLine());
		
		System.out.println("Enter Healthcare Provider Gender (M/F):");
		healthCareProvider.setProviderGender(String.valueOf(scanner.next().charAt(0)));
		scanner.nextLine();
		System.out.println("Enter Healthcare Provider Address:");
		healthCareProvider.setAddress(scanner.nextLine());
		
		System.out.println("Enter Healthcare Provider Email:");
		healthCareProvider.setEmail(scanner.nextLine());

		return healthCareProvider;
	}
        
    }

