package testNgConcept;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotationExecutionSequence
{
  @Test
  public void f() 
  {
	  System.out.println("test method executed");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("After method method executed");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class executed");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After class executed");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before test executed");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("after test executed");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suite executed");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("after suite executed");
  }

}
