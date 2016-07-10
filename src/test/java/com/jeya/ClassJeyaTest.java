package com.jeya;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

/*	
	When Maven test it should find the junit class. Then it will create related files under \surefire-reports for
	each class with regarding results.
	
	<package name>.<Class name>.txt file will show the results with problems if there exists build failure
	TEST-<package name>.<Class name>.xml file will result green bar for success and red bar for failure.
	right click on xml file and open with -> JUnit View to view the bar and result.
	
 	Possible problem : 
 	Maven doesn't create file for a class.
 	
 	Reason:
 	Maven does not find JUnit tests to run.
 	
 	Fix:
 	By default Maven uses the following naming conventions when looking for tests to run:
	Test*
	*Test
	*TestCase
	Your test class doesn't follow these conventions.
	You should rename it or configure Maven Surefire Plugin to use another pattern for test classes.
	https://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#includes
*/
public class ClassJeyaTest extends TestCase{
	public void testAdd() {
		//fail("Not yet implemented");
		assertTrue(true); // just to make sure that it is running properly. not implemented actually.
	}
	
	 public ClassJeyaTest( String testName )
	    {
	        super( testName );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite(ClassJeyaTest.class);
	    }
}