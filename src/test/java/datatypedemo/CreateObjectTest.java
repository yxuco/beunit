package datatypedemo;

import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class CreateObjectTest {

	@Test
	public void testCreatePrimitiveItem() {
		TestHelper.assertRuleFunction(
			"/Test/CreateObjectTest/testCreatePrimitiveItem", true);
	}

	@Test
	public void testCreateContainer() {
		TestHelper.assertRuleFunction(
			"/Test/CreateObjectTest/testCreateContainer", true);
	}
}
