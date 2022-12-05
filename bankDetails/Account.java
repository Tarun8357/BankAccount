package com.bankDetails;

public class Account {

	private String accountHolderName;
	private String accountNumber;
	private double accountBalance;
	private String receiverName;

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void depositeAmount(double damount) {
		double bankBalance = getAccountBalance();
		setAccountBalance(damount + bankBalance);
		System.out.println("Amount Deposited Succesfully ...." + "Your account Balaance is " + getAccountBalance());

	}

	public void withdrawlAmount(double wamount) {

		double bankBalance = getAccountBalance();
		if (bankBalance >= wamount) {
			setAccountBalance(bankBalance - wamount);
			System.out
					.println("Amount Withdrwaled Succesfully...." + "Your account Balaance is " + getAccountBalance());
		} else {
			System.out.print("Insufficient Fund");
		}

	}

	public void fundTransfer(Account receiverName, double fundAmount) {
		double selfAccountBalance = getAccountBalance();
		double receiverBalance = receiverName.getAccountBalance();
		if (selfAccountBalance >= fundAmount) {
			setAccountBalance(selfAccountBalance - fundAmount);
			receiverName.setAccountBalance(receiverBalance + fundAmount);
			System.out.println("Transaction Successful.... ");

		} else {
			System.out.println("Transaction Failed.....Due to insufficient funds");
		}

	}

}
