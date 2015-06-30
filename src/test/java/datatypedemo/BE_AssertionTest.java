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

	@Test
	public void testTrueConceptPrimitiveProperty() {
		TestHelper.assertRuleFunction(
			folder + "testTrueConceptPrimitiveProperty", true);
	}

	@Test
	public void testTrueConceptPrimitivePropertyArray() {
		TestHelper.assertRuleFunction(
			folder + "testTrueConceptPrimitivePropertyArray", true);
	}

	@Test
	public void testTrueConceptReferenceProperty() {
		TestHelper.assertRuleFunction(
			folder + "testTrueConceptReferenceProperty", true);
	}

	@Test
	public void testTrueConceptReferencePropertyArray() {
		TestHelper.assertRuleFunction(
			folder + "testTrueConceptReferencePropertyArray", true);
	}

	@Test
	public void testTrueContainedConceptProperty() {
		TestHelper.assertRuleFunction(
			folder + "testTrueContainedConceptProperty", true);
	}

	@Test
	public void testTrueEventPayload() {
		TestHelper.assertRuleFunction(
			folder + "testTrueEventPayload", true);
	}

	@Test
	public void testTrueEventProperty() {
		TestHelper.assertRuleFunction(
			folder + "testTrueEventProperty", true);
	}
}
