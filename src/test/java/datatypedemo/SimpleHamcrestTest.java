package datatypedemo;

import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class SimpleHamcrestTest {
	public static final String folder = "/Test/SimpleHamcrestTest/";
	
	@Test
	public void testFalseAllOf() {
		TestHelper.assertRuleFunction(
			folder + "testFalseAllOf", true);
	}

	@Test
	public void testTrueAllOf() {
		TestHelper.assertRuleFunction(
			folder + "testTrueAllOf", true);
	}

	@Test
	public void testFalseAnyOf() {
		TestHelper.assertRuleFunction(
			folder + "testFalseAllOf", true);
	}

	@Test
	public void testTrueAnyOf() {
		TestHelper.assertRuleFunction(
			folder + "testTrueAllOf", true);
	}

	@Test
	public void testFalseEveryItem() {
		TestHelper.assertRuleFunction(
			folder + "testFalseEveryItem", true);
	}

	@Test
	public void testTrueEveryItem() {
		TestHelper.assertRuleFunction(
			folder + "testTrueEveryItem", true);
	}

	@Test
	public void testFalseHasItem() {
		TestHelper.assertRuleFunction(
			folder + "testFalseHasItem", true);
	}

	@Test
	public void testTrueHasItem() {
		TestHelper.assertRuleFunction(
			folder + "testTrueHasItem", true);
	}

	@Test
	public void testFalseNotMatcher() {
		TestHelper.assertRuleFunction(
			folder + "testFalseNotMatcher", true);
	}

	@Test
	public void testTrueNotMatcher() {
		TestHelper.assertRuleFunction(
			folder + "testTrueNotMatcher", true);
	}

	@Test
	public void testFalseNotValue() {
		TestHelper.assertRuleFunction(
			folder + "testFalseNotValue", true);
	}

	@Test
	public void testTrueNotValue() {
		TestHelper.assertRuleFunction(
			folder + "testTrueNotValue", true);
	}

	@Test
	public void testFalseNullValue() {
		TestHelper.assertRuleFunction(
			folder + "testFalseNullValue", true);
	}

	@Test
	public void testTrueNullValue() {
		TestHelper.assertRuleFunction(
			folder + "testTrueNullValue", true);
	}

	@Test
	public void testFalseNotNullValue() {
		TestHelper.assertRuleFunction(
			folder + "testFalseNotNullValue", true);
	}

	@Test
	public void testTrueNotNullValue() {
		TestHelper.assertRuleFunction(
			folder + "testTrueNotNullValue", true);
	}

}
