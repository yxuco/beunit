package datatypedemo;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class RuleTest {

	@BeforeClass
	public static void setupUpdatePrimitiveItem() {
		try {
			TestHelper.assertRuleFunction(
					"/Test/RuleTest/setupUpdatePrimitiveItem", true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void testUpdatePrimitiveItemInPreproc() {
		try {
			TestHelper.assertRuleFunction(
					"/Test/RuleTest/testUpdatePrimitiveItemInPreproc", true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void testUpdatePrimitiveItemInRule() {
		try {
			TestHelper.assertRuleFunction(
					"/Test/RuleTest/testUpdatePrimitiveItemInRule", false);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
