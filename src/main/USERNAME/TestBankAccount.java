//package ca.uwo.csd.cs2212.USERNAME;

package main.USERNAME;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFund() {
		BankAccount acc = new BankAccount(10);
		double amount = acc.debit(5);
		Assert.assertEquals(5.0, amount);
	}

}
