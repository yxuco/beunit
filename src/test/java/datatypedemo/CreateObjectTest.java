package datatypedemo;

import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class CreateObjectTest {

	@Test
	public void testCreatePrimitiveItem() {
		try {
			TestHelper.assertRuleFunction(
					"/Test/CreateObjectTest/testCreatePrimitiveItem", true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void testCreateContainer() {
		try {
			TestHelper.assertRuleFunction(
					"/Test/CreateObjectTest/testCreateContainer", true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
