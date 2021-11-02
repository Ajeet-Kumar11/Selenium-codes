package testNgConcept;

import org.testng.annotations.Test;

public class InnvocationCnt
{
  @Test(invocationCount=5)
  public void f() 
  
  {
	  System.out.println("f");
  }
}
