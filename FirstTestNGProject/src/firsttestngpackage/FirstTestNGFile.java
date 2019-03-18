package firsttestngpackage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import junit.framework.Assert;

@Listeners(firsttestngpackage.ListenerTest.class)

public class FirstTestNGFile {
    public String baseUrl = "http://www.demo.guru99.com/V4/";
    public WebDriver driver ; 
     @DataProvider(name="mngrcredential1")
     public Object[][] testdata1() throws Exception
     {
      return util.getDataFromExcel(util.filepath, util.sheetname, util.tablename);
     }
     @DataProvider(name="mngrcredential2")
     public Object[][] testdata2() throws Exception
     {
    	 Object[][] data2 = new Object[4][2];
    	 data2 [0][0]=util.username;
    	 data2 [0][1]=util.password;
    	 
    	 data2 [1][0]="invalid";
    	 data2 [1][1]="valid";
    	 
    	 data2 [2][0]="valid";
    	 data2 [2][1]="invalid";
    	 
    	 data2 [3][0]="invalid";
    	 data2 [3][1]="invalid";
    	 
    	 return data2;
     } 
     
    @DataProvider(name="newcstmr")
     public Object[][] testdata3() throws Exception
     {
     Object[][] data3 = new Object[6][8];
     
    	 data3 [0][0] ="Bikram Jena";
    	 data3 [0][1] ="24051995";
    	 data3 [0][2] ="Basudev nagar 4th lane";
         data3 [0][3] ="Berhampur";
         data3 [0][4] ="Odisha";
    	 data3 [0][5] ="760010";
    	 data3 [0][6] ="7205592595";
    	 data3 [0][7] ="vikramkj@gmail.com";
    	 data3 [0][8] ="12345";
    	 
    			 data3 [1][0] ="12345 bikram";
    	    	 data3 [1][1] ="24051995";
    	    	 data3 [1][2] =" ";
    	         data3 [1][3] ="@fdsr";
    	         data3 [1][4] ="123Odisha";
    	    	 data3 [1][5] ="abc760";
    	    	 data3 [1][6] =" ";
    	    	 data3 [1][7] =" ";
    	    	 data3 [1][8] ="@123456";
    	    	 
    	    			 data3 [2][0] ="@Bikram kesh jena";
    	    	    	 data3 [2][1] ="24051995";
    	    	    	 data3 [2][2] =" cskjsdc scjsdkcb csk";
    	    	         data3 [2][3] =" ";
    	    	         data3 [2][4] =" ";
    	    	    	 data3 [2][5] =" ";
    	    	    	 data3 [2][6] ="@12456789";
    	    	    	 data3 [2][7] =" dbvdjvb@gmail.com";
    	    	    	 data3 [2][8] ="7gdj@t";
    	    	    	 
    	    	    			 data3 [3][0] =" ";
    	    	    	    	 data3 [3][1] ="07111996";
    	    	    	    	 data3 [3][2] ="@basyfg gghf hhii";
    	    	    	         data3 [3][3] ="123jk";
    	    	    	         data3 [3][4] ="@fhfl";
    	    	    	    	 data3 [3][5] ="@76001";
    	    	    	    	 data3 [3][6] ="gj67886";
    	    	    	    	 data3 [3][7] =" bjfdb@gmail.com";
    	    	    	    	 data3 [3][8] ="27db8";
    	    	    	    	 
    	    	    	    			 data3 [4][0] ="  dsh dsb jena";
    	    	    	    	    	 data3 [4][1] ="25041987";
    	    	    	    	    	 data3 [4][2] ="vcdc cdhvcd h cdj";
    	    	    	    	         data3 [4][3] =" bcdjc";
    	    	    	    	         data3 [4][4] ="fdjs";
    	    	    	    	    	 data3 [4][5] ="2567869";
    	    	    	    	    	 data3 [4][6] =" 567890";
    	    	    	    	    	 data3 [4][7] ="ccsdjc@gmail.com";
    	    	    	    	    	 data3 [4][8] ="fevu234";
    	    	    	    	    	 
    	    	    	    	    	 return data3;
     }
    		 
    @DataProvider(name="editcstmr")
    public Object[][] testdata4() throws Exception
    {
    	Object[][] data4=new Object[2][6];
    	data4[0][0]="dbdks dsksd sksc 4th 5";
    			data4[0][1]="BBSR";
    					data4[0][2]="Delhi";
    							data4[0][3]="456790";
    									data4[0][4]="6785412367";
    											data4[0][5]="bkdsbx@gmail.com";
    											
    											data4[1][0]="dbdks dsksd sksc 4th 5";
    							    			data4[1][1]="BBSR";
    							    					data4[1][2]="Delhi";
    							    							data4[1][3]="4567y0";
    							    									data4[1][4]="6785yu2367";
    							    											data4[1][5]="bkdsbx@gmail.com";
    											
    											return data4;
    													
    }
    @DataProvider(name="cstmrid")
    public Object[][] testdata5() throws Exception
    {
    	Object[][] data5=new Object[4][1];
    	data5[0][0]="22505";
    			data5[1][0]="67895";
    					data5[2][0]="ghdc567";
    							data5[3][0]="dgvkdjsg";
    							
    							return data5;
    	
    }
    @DataProvider(name="dltcstmr")
    public Object[][] testdata6() throws Exception
    {
    	Object[][] data6=new Object[4][1];
    	data6[0][0]="22505";
    			data6[1][0]="423851";
    			
    			data6[2][0]="dfhs77";
    			data6[3][0]="vffsdvcjv";
    			return data6;
    }
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          File pathtobinary=new File(util.firefoxpath);
          FirefoxBinary ffbinary= new FirefoxBinary(pathtobinary);
          FirefoxProfile ffprofile=new FirefoxProfile();
           driver=new FirefoxDriver();
          
          driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
          driver.get(baseUrl);
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("c:\\screenshot1.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
      }
     
      @Test(priority=0,dataProvider="mngrcredential1")
      public void loginandverify(String username,String password) throws Exception 
      {
    	  driver.findElement(By.name("uid")).clear();
      driver.findElement(By.name("uid")).sendKeys(username);

	    // Enter Password
      driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);
 
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();

	    try
	    {
	    	Alert alert=driver.switchTo().alert();
	    	String actualboxmsg= alert.getText();
	    	assertEquals(actualboxmsg, util.expectalertboxtitle);
	    	alert.accept();
	    }
	    
	    catch(NoAlertPresentException Ex)
	    {
	    	String text1=driver.findElement(By.linkText("Manger Id")).getText();
	    	assertTrue(text1.contains("Manger"));
	    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("c:\\screenshot2.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    }
     }
      @Test(priority=1, dataProvider="newcstmr")
      public void verifynewcustomer(String cstmrname, String dob, String adrs, String city, String state,String pin, String telno, String email, String pswd) throws Exception
      {
    	  driver.findElement(By.linkText("New Customer")).click();
    	 String textcstmr= driver.findElement(By.linkText("Add New Customer")).getText();
    	  assertTrue(textcstmr.contains("Add New Customer"));
    	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("c:\\screenshot3.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	  
    	  driver.findElement(By.name("name")).clear();
    	  driver.findElement(By.name("name")).sendKeys(cstmrname);
    	  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).clear();
    	  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
    			  driver.findElement(By.name("dob")).clear();
    			  driver.findElement(By.name("dob")).sendKeys(dob);
    					  driver.findElement(By.name("addr")).clear();
    					  driver.findElement(By.name("addr")).sendKeys(adrs);
    							  driver.findElement(By.name("city")).clear();
    							  driver.findElement(By.name("city")).sendKeys(city);
    									  driver.findElement(By.name("state")).clear();
    									  driver.findElement(By.name("state")).sendKeys(state);
    											  driver.findElement(By.name("pinno")).clear();
    											  driver.findElement(By.name("pinno")).sendKeys(pin);
    											  driver.findElement(By.name("telephoneno")).clear();
    											  driver.findElement(By.name("telephoneno")).sendKeys(telno);
    											  driver.findElement(By.name("emailid")).clear();
    											  driver.findElement(By.name("emailid")).sendKeys(email);
    											  driver.findElement(By.name("password")).clear();
    											  driver.findElement(By.name("password")).sendKeys(pswd);
    													  driver.findElement(By.name("sub")).click();
    													  
    													  try
    													  {
    														  Alert alert1= driver.switchTo().alert();
    														  String actualboxmsg1= alert1.getText();
    														  assertEquals(actualboxmsg1,"please fill all fields");
    													  }
    													  catch (NoAlertPresentException Ex)
    													  {
    														  String veritext=driver.findElement(By.className("heading3")).getText();
    														  assertEquals(veritext,"Customer Registered Successfully!!!");
    														  File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    															try {
    																FileUtils.copyFile(scrFile1, new File("c:\\screenshot4.png"));
    															} catch (IOException e) {
    																
    																e.printStackTrace();
    															}
    														  driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[14]/td/a")).click();
    														  
    													  }
    	  
      }
      @Test(priority=2,dataProvider="cstmrid")
      public void clickedltcstmr(String cstmrID) throws Exception
      {
    	  driver.navigate().back();
    	  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
    	  File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile4, new File("c:\\screenshot5.png"));
			} catch (IOException e) {
			
				e.printStackTrace();
			}
    	  driver.findElement(By.name("cusid")).sendKeys(cstmrID);
    	  driver.findElement(By.name("AccSubmit")).click();
    	  try
    	  {
    		  Alert alert=driver.switchTo().alert();
    		  String actualboxtitle5=alert.getText();
    		  assertEquals(actualboxtitle5,"Customer does not exist!!");
    		  assertEquals(actualboxtitle5,"Please fill all fields");
    		  alert.accept();
    	  }
    	  catch(NoAlertPresentException Ex)
    	  {
    		String headingtext1= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")).getText();
    		assertEquals(headingtext1,"Edit Customer");
    		File scrFile2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		try {
				FileUtils.copyFile(scrFile2, new File("c:\\screenshot6.png"));
			} catch (IOException e) {
			
				e.printStackTrace();
			}
    	  }
      }
      @Test(priority=3,dataProvider="editcstmr")
      public void editcstmr(String address, String city, String state, String pin, String mobno, String email)
      {
    	  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
    	  File scrFile3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		try {
				FileUtils.copyFile(scrFile3, new File("c:\\screenshot7.png"));
			} catch (IOException e) {
			
				e.printStackTrace();
			}
    	  
    	  driver.findElement(By.name("addr")).clear();
    	  driver.findElement(By.name("addr")).sendKeys(address);
    	  driver.findElement(By.name("city")).clear();
    	  driver.findElement(By.name("city")).sendKeys(city);
    	  driver.findElement(By.name("state")).clear();
    	  driver.findElement(By.name("state")).sendKeys(state);
    	  driver.findElement(By.name("pinno")).clear();
    	  driver.findElement(By.name("pinno")).sendKeys(pin);
    	  driver.findElement(By.name("telephoneno")).clear();
    	  driver.findElement(By.name("telephoneno")).sendKeys(mobno);
    	  driver.findElement(By.name("emailid")).clear();
    	  driver.findElement(By.name("emailid")).sendKeys(email);
    	  
    	  driver.findElement(By.name("sub")).click();
    	 try
    	 {
    		 Alert alert=driver.switchTo().alert();
    		 String actualboxmsg6= alert.getText();
    		 assertEquals(actualboxmsg6,"No Changes made to Customer records");
    		 alert.accept();
    	 }
    	 catch(NoAlertPresentException Ex)
    	 {
    		String headingtext6= driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[1]/td/p")).getText();
    		assertEquals(headingtext6,"Customer details updated Successfully!!!");
    		driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[14]/td/a")).click();
    	 }
      }
      @Test(priority=4,dataProvider="dltcstmr")
      
    	 public void deletecstmr(String cstmrid) throws Exception
    	 {
    	  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
    	  driver.findElement(By.name("cusid")).clear();
    	  driver.findElement(By.name("cusid")).sendKeys(cstmrid);
    	  
    	 try
    	 {
    		 Alert alert=driver.switchTo().alert();
    		 String actualboxtext6= alert.getText();
    		 assertEquals(actualboxtext6,"Please fill all fields");
    		 alert.accept();
    		 assertEquals(actualboxtext6,"Do you really want to delete this Customer?");
    		 alert.accept();
    		 assertEquals(actualboxtext6,"Customer does not exist!!");
    		 alert.accept();
    		 assertEquals(actualboxtext6,"Customer deleted Successfully");
    		 alert.accept();
    	 }
    	 catch(NoAlertPresentException Ex) 
    	 
    	 {
    		 String headingtext6=driver.findElement(By.xpath("/html/body/div[2]/h2")).getText();
    		 assertEquals(headingtext6,"Guru99 Bank");
    	 }
    	  
    	 
      }
      
      
      
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}