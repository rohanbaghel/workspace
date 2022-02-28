package com.capgemini.testing.test;


import org.junit.Assert;
import org.junit.Test;

import com.capgemini.testing.model.StringUtility;

public class StringUtilityTest {

	@Test
	public void lengthTest(){
		StringUtility util = new StringUtility();
		Assert.assertEquals(9, util.getLength("Capgemini"));
	}
	
	@Test
	public void upperCaseTest(){
		StringUtility util = new StringUtility();
		Assert.assertEquals("HELLO", util.getUpperCase("hello"));
	}
	
	@Test
	public void splitStringTest(){
		StringUtility util = new StringUtility();
		String [] array = {"Hello","Good","Morning"};
		Assert.assertArrayEquals(array, util.splitString("Hello Good Morning"));
	}
}
