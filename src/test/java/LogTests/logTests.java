package LogTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.math3.analysis.function.Log;
import org.testng.annotations.Test;

import utility.BaseClass;

public class logTests extends BaseClass {
  
	@Test
	 public void testCase1() {
	  Log.startTestCase("testCase1");
	  Log.info("This is testCase1");
	  Log.startTestCase("testCase1");
	 }
	 @Test
	 public void testCase2() {
	  Log.startTestCase("testCase2");
	  Log.info("This is testCase2");
	  Log.startTestCase("testCase2");
	 }
	 @Test
	 public void testCase3() {
	  Log.startTestCase("testCase3");
	  Log.info("This is testCase3");
	  Log.startTestCase("testCase3");
	 }

	}

