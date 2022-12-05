package com.bankDetails;

import java.util.Scanner;

public class TestBankDetails {
	public static void main(String args[]) {
		Account fillDetails = new Account();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name:");
		String accountHolderName = sc.nextLine();
		fillDetails.setAccountHolderName(accountHolderName);

		System.out.print("Enter your account Number:");
		String accountNumber = sc.nextLine();
		fillDetails.setAccountNumber(accountNumber);

		System.out.print("Enter deposit amount: ");
		double damount = sc.nextDouble();
		fillDetails.depositeAmount(damount);

		System.out.print("Enter withdrawl amount: ");
		double wamount = sc.nextDouble();
		fillDetails.withdrawlAmount(wamount);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Account Holder's Name :" + fillDetails.getAccountHolderName());
		System.out.println("Account Number :" + fillDetails.getAccountNumber());
		System.out.println("Deposite amount:" + fillDetails.getAccountBalance());
		System.out.println("-----------------------------------------------------");
		System.out.println("Updated Balance:" + fillDetails.getAccountBalance());
		System.out.println("-----------------------------------------------------");

		System.out.println("--------Fund Transfer--------");
		Account rc = new Account();
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter Receivers Name:");
		String receiverName = bc.nextLine();
		rc.setReceiverName(receiverName);

		System.out.println("Enter Fund Amount To Be Transferred:");
		double fundAmount = sc.nextDouble();

		fillDetails.fundTransfer(rc, fundAmount);
		System.out.println("----------------------------------------------------");

		System.out.println("Updated Balance Of" + " "+ fillDetails.getAccountHolderName() + ": " + fillDetails.getAccountBalance());
		System.out.println("Updated Balance of" + " " + rc.getReceiverName() + ": " + rc.getAccountBalance());

	}
}
