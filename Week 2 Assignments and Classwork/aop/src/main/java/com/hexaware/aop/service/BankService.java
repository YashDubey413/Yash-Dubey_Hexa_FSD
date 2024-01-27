package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exceptions.InvalidAccountNo;

@Service
public class BankService {
	
	
	
	public void deposit() {
		System.out.println("Amount Deposited Successfully..");
		
	}
	
	public void withdraw() {
		System.out.println("Amount Withdrawn Successfully..");
		
	}
	
	public void fundTransfer() {
		System.out.println("Fund Transfered Successfully..");
		
	}
	
	public int checkBalance(int acno) throws InvalidAccountNo {
		int balance=0;

		if (acno>0) {
			balance= 5000;
		}
		else {
			throw new InvalidAccountNo();
		}
		return balance;
		
	}
	
	public void login() {
		System.out.println("Log in Successful");
	}
	

}
