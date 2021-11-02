package testNgConcept;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterSpecificToTestCase 
{
  @Test
  @Parameters({"a","b"})
  public void  sum(int c,int d) 
  {
	  System.out.println(c+d);
  }
}
