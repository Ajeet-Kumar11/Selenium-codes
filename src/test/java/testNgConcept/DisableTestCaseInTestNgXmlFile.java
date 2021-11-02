package testNgConcept;

import org.testng.annotations.Test;

public class DisableTestCaseInTestNgXmlFile 
{
	@Test()
	  public void m1() 
	  {
		  System.out.println("enabled1");
	  }
	  @Test()
	  public void m2() 
	  {
		  System.out.println("disabled");
	  }
	  @Test()
	  public void m3() 
	  {
		  System.out.println("enabled2");
	  }
	}

