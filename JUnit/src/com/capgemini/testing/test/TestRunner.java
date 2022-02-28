package com.capgemini.testing.test;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result testResult = JUnitCore.runClasses(TestSuite.class);
		
		for(Failure failure:testResult.getFailures()){
			System.out.println(failure);
		}
		if(testResult.wasSuccessful()){
			System.out.println("The Test was successful.");
		}
		else{
			System.out.println("Test case failed...");
		}
	}

}
