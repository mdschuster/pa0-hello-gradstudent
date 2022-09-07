package edu.wit.cs.comp5900.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;

import edu.wit.cs.comp5900.PA0a;
import junit.framework.TestCase;

public class PA0aTestCase extends TestCase {
	
	@SuppressWarnings("serial")
	private static class ExitException extends SecurityException {}
	
	
	@Override
    protected void setUp() throws Exception 
    {
        super.setUp();
    }
	
	@Override
    protected void tearDown() throws Exception 
    {
        super.tearDown();
    }
	
	public void testOutput() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final String expected = "Hello World!";
		
		System.setOut(new PrintStream(outContent));
		try {
			PA0a.main(new String[] { "foo" });
		} catch (ExitException e) {}
		
		assertEquals(String.format("%s%n", expected), outContent.toString());
		
		System.setOut(null);
	}

}
