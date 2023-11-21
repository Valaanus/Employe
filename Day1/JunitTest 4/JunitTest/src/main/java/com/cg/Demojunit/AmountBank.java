package com.cg.Demojunit;

public class AmountBank{
	private int amount=10000;
	public boolean withdraw(int amountToWithdraw) throws AmountInsufficientFundsException {
		if(amountToWithdraw>amount)
		{
			throw new AmountInsufficientFundsException();
		}
		amount-=amountToWithdraw;
		return true;
	}

public static void main() {
}
}