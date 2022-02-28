package com.capgemini.testing.test;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.testing.model.Calculator;

public class CalculatorTest {

	@Test
	public void addTest(){
		Calculator cal = new Calculator();
		Assert.assertEquals(7, cal.add(3,4));
	}
}
