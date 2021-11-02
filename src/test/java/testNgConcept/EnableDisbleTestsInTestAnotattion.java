package testNgConcept;

import org.testng.annotations.Test;

public class EnableDisbleTestsInTestAnotattion 
{
  @Test(enabled=true)
  public void m1() 
  {
	  System.out.println("enabled1");
  }
  @Test(enabled=false)
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
