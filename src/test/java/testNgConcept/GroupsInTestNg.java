package testNgConcept;

import org.testng.annotations.Test;

public class GroupsInTestNg 
{
  @Test(groups= {"smoke"})
  public void m1() 
  {
	  System.out.println("smoke groups executed");
  }
  @Test(groups= {"regression"})
  public void m2() 
  {
	  System.out.println("regression groups executed");
  }
}
