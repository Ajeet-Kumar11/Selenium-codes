package practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest extends Base 
{
  @Test
  public void FreeCRMTest()
  {
	  Assert.assertEquals(false, true);
  }
  @BeforeMethod
  public void setUp() 
  {
	  initialization();
  }
  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }
  
}
