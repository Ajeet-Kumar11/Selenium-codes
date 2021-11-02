package testNgConcept;

import org.testng.annotations.Test;

public class EnableDisableTestMethodsInXmlFileUsingRegex 
{
	@Test()
	  public void m() 
	  {
		  System.out.println("enabled1");
	  }
	  @Test()
	  public void n() 
	  {
		  System.out.println("disabled");
	  }
	  @Test()
	  public void m3() 
	  {
		  System.out.println("enabled2");
	  }
	}


