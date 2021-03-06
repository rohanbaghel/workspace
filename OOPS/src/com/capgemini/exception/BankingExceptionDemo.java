package com.capgemini.exception;

import java.util.Scanner;

public class BankingExceptionDemo {

	private static int withdrawalLimit;
	private static int balance;
	private static int totalAmountWithdrawan;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Banking application.");
		System.out.println("Enter customer name:");
		String name =sc.next();
		System.out.println("Enter the withdrawal Limit :");
		withdrawalLimit= sc.nextInt();
		System.out.println("Enter the current balance:");
		balance=sc.nextInt();
		for(;;){
			System.out.println("Enter the amount of withdrawal (-1 to exit):");
			int amount = sc.nextInt();
			if(amount==0 || amount <-1){
				System.out.println("Invalid withdrawal amount ");
				continue;
			}
			if(amount==-1){
				System.out.println("Thank you..!!");
				System.exit(0);
			}
			try{
			withdrawalAmount(name,amount);
			}catch(InsufficientFundException | WithdrawalLimitException e){
				System.out.println("Exception:"+e);
			}
		}
	}
	private static void withdrawalAmount(String name,int amount)throws InsufficientFundException,WithdrawalLimitException{
		if(amount>balance){
			throw new InsufficientFundException("Withdrawal of "+amount+" is denied due to insufficient funds"
					+balance);
		}
		else if ((totalAmountWithdrawan+amount)>withdrawalLimit){
			throw new WithdrawalLimitException("Withdrawal of "+amount+" is denied.\n"
					+ "Total Amount withdrawan today:"+totalAmountWithdrawan+"\n "
							+ "Withdrawal Limit: "+withdrawalLimit);
		}
		else{
			System.out.println("Hello "+name);
			System.out.println("Withdrawal of "+amount+" is complete.");
			balance-= amount;
			totalAmountWithdrawan+=amount;
			System.out.println("Balance: "+balance);
			System.out.println("Total Amount withdrawan today: "+totalAmountWithdrawan);
		}
	}
}
