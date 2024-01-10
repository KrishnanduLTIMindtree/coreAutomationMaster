package utilTest;

import org.testng.annotations.Test;

import util.coreUtil;

public class functionTest {
	coreUtil c =new coreUtil();
	@Test
	public void functionTest() {
		
		c.function();
	}
	@Test
	public void functionAdvaceTest() {
	c.functionAdvance("Ram");	
	}

}
