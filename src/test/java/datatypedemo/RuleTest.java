package datatypedemo;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class RuleTest {

	@BeforeClass
	public static void setupUpdatePrimitiveItem() {
		TestHelper.assertRuleFunction(
			"/Test/RuleTest/setupUpdatePrimitiveItem", true);
	}

	@Test
	public void testUpdatePrimitiveItemInPreproc() {
		TestHelper.assertRuleFunction(
			"/Test/RuleTest/testUpdatePrimitiveItemInPreproc", true);
	}

	@Test
	public void testUpdatePrimitiveItemInRule() {
		TestHelper.assertRuleFunction(
			"/Test/RuleTest/testUpdatePrimitiveItemInRule", false);
	}
}
