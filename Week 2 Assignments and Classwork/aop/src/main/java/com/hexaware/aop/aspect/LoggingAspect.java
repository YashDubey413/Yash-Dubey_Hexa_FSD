package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exceptions.InvalidAccountNo;

@Component
@Aspect
public class LoggingAspect { // Aspect
	
	
	@Before(" execution(* com.hexaware.aop.service.*.*())")
	public void beforeLogs() { // Join Point
		
		System.out.println("Logging Before any Bank Service");
	}
	
	@After(" execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void afterLogs() { // Join Point
		
		System.out.println("Logging After any Fund Transfer");
	}
	
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.checkBalance(..))")
	public void afterReturningPointCut() {
		
	}
	
	@AfterReturning(pointcut="afterReturningPointCut()",returning="balance")
	public void afterReturningBalance(int balance) {
		System.out.println("Logs after returning balance amount: "+balance);
	}
	
	
	@AfterThrowing(pointcut="afterReturningPointCut()",throwing="e")
	public void afterThrowingExp(InvalidAccountNo e) {
		System.out.println("Logs after throwing exception: "+e);
	}
	
}
