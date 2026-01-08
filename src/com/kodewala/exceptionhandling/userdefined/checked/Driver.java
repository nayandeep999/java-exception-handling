package com.kodewala.exceptionhandling.userdefined.checked;

public class Driver {

	public static void main(String[] args) {
		FundTransfer f = new FundTransfer();
		try {
			f.doFundTransfer(100);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}

	}

}
