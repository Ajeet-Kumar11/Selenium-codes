package testNgConcept;

import org.testng.annotations.Test;

public class Priority 
{
	@Test()
	  public void mobile()
	  {
		  System.out.println("Mobile");
	  }
	  @Test(priority=1)
	  public void computer() 
	  {
		  System.out.println("computer");
	  }
	  @Test(priority=2)
	  public void tv() 
	  {
		  System.out.println("tv");
	  }
	}

