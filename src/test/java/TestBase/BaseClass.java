package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import java.text.SimpleDateFormat;


public class BaseClass {	

		public static WebDriver  dr;
		public Logger logger;
		public Properties p;		
		
		
		@BeforeClass(groups= {"sanity", "master"})//not mentioned regression anywhere so can't write it here
		@Parameters({"os","browser"})
		public void setup( String os, String br) throws IOException
		{
			
			//loading properties file
			FileReader file=new FileReader(".//src/test/resources/Config.properties");
			 p=new Properties();
			 p.load(file);			
			
			//loading log4j file 
		logger =LogManager.getLogger(this.getClass());
			
		
//		//For os
//		if (p.getProperty("execution_env").equalsIgnoreCase("remote"))
//		{
//			DesiredCapabilities capabilities=new DesiredCapabilities();
//			
//			if (os.equalsIgnoreCase("windows")) 
//			{
//				capabilities.setPlatform(Platform.WIN11);
//			}
//			else if (os.equalsIgnoreCase("mac"))
//			{
//				capabilities.setPlatform(Platform.MAC);
//			}
//			else
//			{
//				System.out.println("No matching of the given OS");
//				return;
//			}
//			//Browser
//			switch (br.toLowerCase()) 
//			{
//			case "chrome":capabilities.setBrowserName("chrome");			
//			break;
//			case "Edge":capabilities.setBrowserName("Edge");			
//			break;
//			default: System.out.println("No browser found");
//			return;				
//			}
//			@SuppressWarnings({ "deprecation", "unused" })
//			WebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444."),capabilities);
//		}
		
		
//		else if (p.getProperty("execution_env").equalsIgnoreCase("local"))
//		{
//			//Launching the browser Based on condotion for local
//			switch (br.toLowerCase()) 
//			{
//			case "chrome":
//			break;
//			case "Edge":dr=new EdgeDriver();
//			break;	
//			default:System.out.println("No matching Browser");
//				return;
//			}
//		}
		
		
		
		
		
			
		    dr=new ChromeDriver();
			dr.manage().deleteAllCookies();
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			//To get value from  the  property 
			dr.get(p.getProperty("Url"));
			dr.manage().window().maximize();
		}
		
		@AfterClass(groups= {"sanity", "master"})//not mentioned regression anywhere so can't write it here
		public void tearDown()
		{
			dr.close();
		}

		public String captureScreen(String name) throws IOException {
			// TODO Auto-generated method stub
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
			TakesScreenshot t =(TakesScreenshot)dr;
			File sourFile=t.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+".\\Screenshot\\"+ "_"+name+ "_"+timeStamp+".png";
			File targetFile=new File(targetFilePath);
			Files.copy(sourFile, targetFile);
			return targetFilePath;
		}
		

//		public String randomeString()
//		{
//			String generatedString=RandomStringUtils.randomAlphabetic(5);
//			return generatedString;
//		}
//		
//		public String randomeNumber()
//		{
//			String generatedString=RandomStringUtils.randomNumeric(10);
//			return generatedString;
//		}
//		
//		public String randomAlphaNumeric()
//		{
//			String str=RandomStringUtils.randomAlphabetic(3);
//			String num=RandomStringUtils.randomNumeric(3);
//			
//			return (str+"@"+num);
//		}
	}



