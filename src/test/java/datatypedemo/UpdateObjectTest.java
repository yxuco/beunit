package datatypedemo;

import org.junit.Test;

import com.tibco.psg.beunit.TestHelper;

public class UpdateObjectTest {

	@Test
	public void testAddDataToPrimitiveArray() {
		try {
			TestHelper.assertRuleFunction(
					"/Test/UpdateObjectTest/testAddDataToPrimitiveArray",
					true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
