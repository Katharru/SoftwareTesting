import java.awt.Desktop.Action;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Exit;

public class DashBoardPage {

private String ActualTExt;

    WebDriver   driver=null;
       @BeforeClass
      public void ClassSetUp()
{      
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://javabykiran.com/selenium/admin.html");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
}

//	@Test(priority = 1)
//	public void CheckAdminHeading()
//	{
//		 WebDriver driver=new ChromeDriver();
//	     driver.get("https://javabykiran.com/selenium/admin.html");
//	     String Actual=driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
//	     String Expected="Admin Page";
//	     Assert.assertEquals(Actual, Expected);
//	     driver.quit();
//	}
//	
//	
//	@Test (priority = 2)
//	 public void CheckingNevHeading()
//	 {
//		ArrayList<String> Ar=new ArrayList<String>();
//		Ar.add("Catageri");
//		Ar.add("Subcategrioes");
//		Ar.add("Logout");
//		WebDriver driver=new ChromeDriver();
//	   driver.get("https://javabykiran.com/selenium/admin.html");
//	   for(int i=1;i<=3;i++) {
//	   String Actual=driver.findElement(By.xpath("/html/body/header/nav/a["+i+"]")).getText();
//	   String Expected= Ar.get(i-1);
//	   Assert.assertEquals(Actual, Expected);
//	     }
//	   driver.quit();
//	 }
//	@Test(priority = 3)
//	public void testCheckHeadings()
//	{
//		ArrayList<String> Ar=new ArrayList<String>();
//		Ar.add("Category ID");
//		Ar.add("Category Name");
//		Ar.add("Created At");
//		Ar.add("Modified At");
//		Ar.add("Actions");
//		
//       WebDriver driver=new ChromeDriver();
//       driver.get("https://javabykiran.com/selenium/admin.html");
//       for(int i=1;i<=5;i++) {
//       String Actual=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+(i)+"]")).getText();
//       System.out.println(Actual);
//       String Expected=Ar.get(i-1);
//      
//       Assert.assertEquals(Actual, Expected);
//       }
//       driver.quit();
//	 }
//	  @Test(priority = 4)
//	  public void testcheckingCategoryData()
//	  {
//		  ArrayList<String> Arr=new ArrayList<String>();
//		  Arr.add("1");
//		  Arr.add("Mathematics");
//		  Arr.add("2024-11-07");
//		  Arr.add("2024-11-08");
//		  
//		  WebDriver driver=new ChromeDriver();
//		  driver.get("https://javabykiran.com/selenium/admin.html");
//		  for(int i=1;i<=4;i++)
//		  {
//		String Actual=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td["+i+"]")).getText();
//		System.out.println(Actual);
//	    String Expected=Arr.get(i-1);	  
//	    Assert.assertEquals(Actual, Expected);		  
//		  }
//		  driver.quit();
//	  }
//	  
//	 @Test(priority = 5)
//	 public void testAddSubcategory()
//	 {
//		 WebDriver driver=new ChromeDriver();
//	     driver.get("https://javabykiran.com/selenium/admin.html");
//	     driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
//	     driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("Math");
//	     driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();	  
//	 }
//   
//      @Test(priority = 6)
//      public void TestEmptyTextBox()
//      {
//    	 WebDriver driver=new ChromeDriver();
// 	     driver.get("https://javabykiran.com/selenium/admin.html");
// 	     driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
// 	     driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
//      } 
//      @Test
//      public void TestDeleteButton()
//      {
//    	  WebDriver driver=new ChromeDriver();
//  	     driver.get("https://javabykiran.com/selenium/admin.html");
//  	    
//  	     driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
//  	     Alert alert=driver.switchTo().alert();
//         
//          alert.dismiss();
//      } 
//	@Test
//	public void TestCheckDeleteButton() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/admin.html");
//		for (int i = 1; i <= 2; i++) {
//			for (int j = 1; j <= 5; j++) {
//				String ActualTExt = driver
//						.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[" + i + "]/td[" + j + "]"))
//						.getText();
//				System.out.println(ActualTExt);
//			}
//		}
//		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr/td[5]/button[2]")).click();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
//		String Expected="1 Mathematics 2024-11-07 2024-11-08 Edit Delete";
//		Assert.assertEquals(ActualTExt, Expected);
//	}
//     @Test
//     public void testDropDownIsDisplayed()
//    {
//    	    WebDriver driver=new ChromeDriver();
//    		driver.get("https://javabykiran.com/selenium/admin.html");
//    	    driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
//    	    driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
//    	    WebElement webselct=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
//    	    Assert.assertFalse(webselct.isDisplayed());
//    	    
//    	    
//    }
//	@Test
//	public void testDropDownHasfiveOptions()
//	{
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://javabykiran.com/selenium/admin.html");
//    driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
//    driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
//    
//   WebElement webselct=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
//    Select sec=new Select(webselct);
//    List<WebElement> webList=sec.getOptions();
//    Assert.assertEquals(webList.size(), 5);
//    
//	}
	
//  @Test
//  public void testElementPresentOrnot()
//  {
//	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://javabykiran.com/selenium/admin.html");
//	  driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
//	  WebElement Web=  driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]"));
//	  WebElement webselct=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
//	  Select Sc=new Select(webselct);
//	  List<WebElement>Webb= Sc.getOptions();
//	  boolean exist=false;
//	  for (WebElement webElement : Webb) {
//	  if(webElement.getText().equals("Technology"));
//	  exist=true;
//	  Assert.assertTrue(exist);
//	} 
//  }
//  @Test
//	public void testListProperlyPresentOrNot()
//	{
//	  LinkedList<String>LS=new LinkedList<String>();
//
//	  LS.add("Mathematics");
//	  LS.add("Science");
//	  LS.add("Technology");
//	  LS.add("Arts");
//	  
//	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://javabykiran.com/selenium/admin.html");
//	  driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
//	  WebElement w=  driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]"));
//	  w.click();
//	 
//		
//		WebElement we= driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
//		we.click();
//		Select s=new Select(we);
//		for(int i=1;i<5;i++)
//		{
//		WebElement Actual=	driver.findElement(By.xpath("//*[@id=\"parent-category\"]/option["+i+"]"));
//		String Expertd=	LS.get(i-1);
//	
//		Assert.assertEquals(Actual, Expertd);
//		}
//	}
//      @Test
//      public void testDefaultValueselected()
//      {
//    	  WebDriver driver=new ChromeDriver();
//    	  driver.get("https://javabykiran.com/selenium/admin.html");
//    	  driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
//    	    driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
//    	  WebElement webselct=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
//    	  Select Sc=new Select(webselct);
//    	String SS=  Sc.getFirstSelectedOption().getText();
//    	System.out.println(SS);
//    	Assert.assertEquals(SS, "Mathematic");
//    	  
//      }
      @Test
      public void testDropdownIsSingleselect()
      {
//    	  WebDriver driver=new ChromeDriver();
//    	  driver.get("https://javabykiran.com/selenium/admin.html");
    	  driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
    	  driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
    	  WebElement webselct=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
    	  Select Sc=new Select(webselct);  
    	  Sc.
    	  
      }
	
}
