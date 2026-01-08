package com.kodewala.exceptionhandling.userdefined.checked;

public class FundTransfer {

	int balance = 1000;

	public void doFundTransfer(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		} else {
			System.out.println("Funds transferred");
		}
	}

}
