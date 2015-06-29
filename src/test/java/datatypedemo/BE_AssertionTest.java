package datatypedemo;

import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class BE_AssertionTest {
	public static final String folder = "/Test/BE_AssertionTest/";
	
	@Test
	public void testFalseInstanceOfConcept() {
		TestHelper.assertRuleFunction(
			folder + "testFalseInstanceOfConcept", true);
	}

	@Test
	public void testTrueInstanceOfConcept() {
		TestHelper.assertRuleFunction(
			folder + "testTrueInstanceOfConcept", true);
	}

	@Test
	public void testFalseInstanceOfEvent() {
		TestHelper.assertRuleFunction(
			folder + "testFalseInstanceOfEvent", true);
	}

	@Test
	public void testTrueInstanceOfEvent() {
		TestHelper.assertRuleFunction(
			folder + "testTrueInstanceOfEvent", true);
	}

	@Test
	public void testFalseInstanceOfDateTime() {
		TestHelper.assertRuleFunction(
			folder + "testFalseInstanceOfDateTime", true);
	}

	@Test
	public void testTrueInstanceOfPrimitive() {
		TestHelper.assertRuleFunction(
			folder + "testTrueInstanceOfPrimitive", true);
	}

}
