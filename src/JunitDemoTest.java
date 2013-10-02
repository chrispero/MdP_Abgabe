import static org.junit.Assert.*;

import org.junit.Test;


public class JunitDemoTest  {

	@Test
	public void test() {
		JunitDemo testObject = new JunitDemo();
		assertTrue(testObject.isEmpty(""));
		assertFalse(testObject.isEmpty("test"));
		assertEquals(testObject.capitalize(""),"");
		assertEquals(testObject.capitalize("ABC"),"Abc");
		assertEquals(testObject.capitalize("abend"),"Abend");
		assertEquals(testObject.capitalize("aDvEnT"),"Advent");
		assertEquals(testObject.reverse(""), "");
		assertEquals(testObject.reverse("Test Hsz"), "zsH tseT");
		assertEquals(testObject.join(""), "");
		assertEquals(testObject.join("a","b","c"), "a b c");		
	}

}
