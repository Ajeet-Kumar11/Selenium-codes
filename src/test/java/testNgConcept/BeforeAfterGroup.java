package testNgConcept;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroup 
{
  @BeforeGroups("smoke")
  public void BeforeGroupss()
  {
	 System.out.println("before groups execcuted"); 
  }
  @Test(groups= {"smoke"})
  public void m1()
  {
	  System.out.println("smoke");
  }
  @Test(groups= {"smoke"})
  public void m2()
  {
	  System.out.println("smoke1");
  }
  @Test()
  public void m3()
  {
	  System.out.println("regression");
  }
  @AfterGroups("smoke")
  public void AfterGroupss()
  {
	 System.out.println("After groups execcuted"); 
  }
}
