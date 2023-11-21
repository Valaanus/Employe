package com.cg.Demojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.Demojunit.AmountBank;
import com.cg.Demojunit.AmountInsufficientFundsException;

public class AmountBankTest {
	AmountBank ba=new AmountBank();
	
	@Test
	public void test() throws AmountInsufficientFundsException {
		assertEquals(true,ba.withdraw(9000));
		assertEquals(true,ba.withdraw(100));
		assertEquals(true,ba.withdraw(100000));
		assertEquals(true,ba.withdraw(0));
	}
	
}
