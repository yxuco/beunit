package datatypedemo;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.tibco.psg.beunit.TestHelper;

@RunWith(value = org.junit.runners.Suite.class)
@SuiteClasses(value = { 
	CreateObjectTest.class, 
	UpdateObjectTest.class,
	RuleTest.class, 
	SimpleHamcrestTest.class, 
	BE_AssertionTest.class })
public class DataTypeDemoTestSuite {

	@BeforeClass
	public static void initialize() throws Exception {
		TestHelper.setServerUrl("http://localhost:8989");
	}
}
