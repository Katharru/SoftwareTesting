import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testLoginPage {
	WebDriver driver=null;
	@BeforeClass
	public  void setupforClass()
	{
	driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	}
	@BeforeMethod
	public void ClearText()
	{
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).clear(); 
		
	}
	@Test(priority = 1)
	public void testMainHeading()
	{
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://javabykiran.com/selenium/login.html");
	String ActualText=driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
	System.out.println(ActualText);
	String ExpectedText="Welcome Here";
	Assert.assertEquals(ActualText, ExpectedText);
    }
	@Test(priority = 2)
	public void testHeading()
	{
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://javabykiran.com/selenium/login.html");
	String Actual=driver.findElement(By.xpath("/html/body/div/div/p")).getText();
	String ExpectedHeading="Login to manage your tests and categories";
	Assert.assertEquals( Actual,ExpectedHeading );
	}
	@Test (priority = 3)
	public void testKiranAcademyHeading()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/login.html");	
		String Actual=driver.findElement(By.xpath("/html/body/div/div/div/img")).getText();
		String Expected="Kiran Academy";
		Assert.assertEquals(Actual, Expected);
		
		
	}
	@Test(priority = 4)
	public void testLoginButton()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/login.html");	
		String Actual=driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).getText();
		String Expected="LOGIN";
		Assert.assertEquals(Actual , Expected);
	}
	    
	 @Test(priority = 5)
	  public void TestValidNameandPass()
	{
//    WebDriver drive=new ChromeDriver();
//    drive.get("https://javabykiran.com/selenium/login.html");
    SoftAssert s=new SoftAssert();	
    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Rushikesh Kathar");
		 s.assertEquals("Rushikesh Kathar", "Rushikesh Kathar");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rushi@123");
         s.assertEquals("Rushi@123","Rushi@123" );
         driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	}
	 
	 @Test(priority = 6)
	 public void testinvalidNameAndvalidPass()
	 {
//		 WebDriver drive=new ChromeDriver();
//		 driver.get("https://javabykiran.com/selenium/login.html");
		 SoftAssert s=new SoftAssert();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("%%%%%%%");
		 s.assertEquals("%%%%%%%", "Rushikesh Kathar");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rushi@123");
         s.assertEquals("Rushi@123","Rushi@123" );
         driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	 }
	 
	 @Test(priority = 7)
	 public void testvalidNameandinvalidPass()
	 {
//		 WebDriver drive=new ChromeDriver();
//		 drive.get("https://javabykiran.com/selenium/login.html");
		 SoftAssert s=new SoftAssert();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Rushikesh Kathar");
		 s.assertEquals("Rushikesh Kathar", "Rushikesh Kathar");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rushi@123");
         s.assertEquals("&&&&&&&&&","Rushi@123" );
         driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	 }
	 @Test(priority = 8)
	public void testonlyEnterPass()
	{
//		 WebDriver drive=new ChromeDriver();
//		 drive.get("https://javabykiran.com/selenium/login.html");
		 SoftAssert s=new SoftAssert();
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rushi@123");
         s.assertEquals("Rushi@123","Rushi@123" );
         driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		 
	}
	 @Test(priority = 9)
	 public void testonlyenterName()
	 {
//		 WebDriver drive=new ChromeDriver();
//		 drive.get("https://javabykiran.com/selenium/login.html");
		 SoftAssert s=new SoftAssert();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Rushikesh Kathar");
		 s.assertEquals("Rushikesh Kathar", "Rushikesh Kathar");
		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	 }
	 @Test 
	 public void testClickonOnlyLogin()
	 {
//		 WebDriver drive=new ChromeDriver();
//		 drive.get("https://javabykiran.com/selenium/login.html");
		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		 
	 }
	 @Test(priority = 10)
	 public void testErrorMessage()
	 {
//	 WebDriver drive=new ChromeDriver();
//	 drive.get("https://javabykiran.com/selenium/login.html"); 
	 String ActualText=	 driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
	 String Expected="Please Enter Valid Name and Password ";
	 Assert.assertEquals(ActualText, Expected);
	 }
	 @Test(priority = 11)
	
	  public void testLongUserName()
	  {
//		  WebDriver drive=new ChromeDriver();
//		  drive.get("https://javabykiran.com/selenium/login.html"); 
	      driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rudncdndsbdsdbcdscnklsnc"); 
	 
	 }
	 @Test(priority = 12)
		
	  public void testLongPassword()
	  {
//		  WebDriver drive=new ChromeDriver();
//		  drive.get("https://javabykiran.com/selenium/login.html"); 
	      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("rudncdndsbdsdbcdscnklsnc"); 
	 
	 }
	 @Test(priority = 13)
		
	  public void testPaawordSpealing()
	  {
//		  WebDriver drive=new ChromeDriver();
//		  drive.get("https://javabykiran.com/selenium/login.html"); 
	     String ActualText=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText() ;
	      String Expected="Password";
	      Assert.assertEquals(ActualText,Expected);
	 }
	 @Test(priority = 14)
		
	  public void testUseranemeSpelling()
	  {
//		  WebDriver drive=new ChromeDriver();
//		  drive.get("https://javabykiran.com/selenium/login.html"); 
	      String ActualText=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText() ;
	      String Expected="Username";
	      Assert.assertEquals(ActualText,Expected);
	 }
	 
	 
}