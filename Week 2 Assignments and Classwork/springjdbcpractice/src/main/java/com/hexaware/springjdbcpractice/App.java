package com.hexaware.springjdbcpractice;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbcpractice.config.AppConfig;
import com.hexaware.springjdbcpractice.models.HealthCareProvider;
import com.hexaware.springjdbcpractice.services.HealthCareProviderServiceImp;
import com.hexaware.springjdbcpractice.services.IHealthCareProviderService;

/**
 * @Author:Yash Dubey 
 * Date: 23/01/24 
 * Description: spring jdbc operations for Health Care Provider
 *   
 *
 */
public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IHealthCareProviderService service = context.getBean(HealthCareProviderServiceImp.class);

		boolean flag = true;

		while (flag) {

			System.out.println("\n\nWelcome to HealthCareProvider Management System***************");
			System.out.println("1. Insert");
			System.out.println("2. Select By Name");
			System.out.println("3. Select All");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				HealthCareProvider healthCareProvider = readData();
				boolean isInserted = service.createHealthCareProvider(healthCareProvider);

				if (isInserted) {
					System.out.println("Record Inserted Successfully..");
				} else {
					System.err.println("Failed to insert..");
				}
				break;

			case 2:
				scanner.nextLine();
				System.out.println("Enter Health Care Provider Name:");
				String name = scanner.nextLine();

				List<HealthCareProvider> list = service.selectHealthCareProviderByName(name);
				list.stream().forEach(System.out::println);
				break;

			case 3:
				List<HealthCareProvider> listAll = service.selectAllHealthCareProvider();
				listAll.stream().forEach(System.out::println);
				break;

			case 4:
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
