package testNgConcept;

import org.testng.annotations.Test;

public class DependsOnMthd 
{
  @Test
  public void mobile()
  {
	  System.out.println(12/0);
  }
  @Test(dependsOnMethods="mobile")
  public void computer() 
  {
	  System.out.println("computer");
  }
  @Test(dependsOnMethods="mobile")
  public void tv() 
  {
	  System.out.println("tv");
  }
}
