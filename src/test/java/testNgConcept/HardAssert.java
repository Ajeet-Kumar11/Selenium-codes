package testNgConcept;

import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssert 
{
  @Test
  public void f() 
  {
	  System.out.println("enter url");
	  System.out.println("enter username");
	  System.out.println("enter password");
	  Assert.assertEquals(true, true);
	  System.out.println("enter name");
	  System.out.println("enter last name");
	  Assert.assertEquals(true, false);
	  System.out.println("close the browser");
  }
}
