package traditional_test_v2;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TraditionalTestsV2 {
	
	WebDriver driver; 
	
	@Test(alwaysRun = true)
	@Parameters("browser")
	public void TraditionalTestsV2(String browserName) throws InterruptedException, Exception
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Nirjhar\\eclipse-workspace\\TraditionalTests\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.applitools.com/gridHackathonV2.html");
			driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"OPTION____200\"]")).getText() + "   "
					+ "  Task:1-1 | Test Name:Incomplete Text Found - TraditionalTestsV2 | DOMID:sort | Browser:firefox | ViewPort:1200X700");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"UL____21\"]")).getText() +  
					"  Task:1-2 | Test Name:MenuBar Present - TraditionalTestsV2 | DOMID:UL____21 | Browser:firefox | ViewPort:1200X700");
			// Script for finding Add to Favorites button on Mousehover for firefox
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//*[@id=\"IMG__imgfluid__215\"]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]"))).click().build().perform();
			System.out.println("Task:1-3 | Test Name:Mousehover element Present - TraditionalTestsV2 | DOMID:" + driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]")).getAttribute("id")
					+ "| Browser:firefox | ViewPort:1200X700");
			
			// Script for product details validation.
			driver.findElement(By.xpath("//*[@id=\"product_1\"]")).click();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshot2/firefox.jpg"));
			System.out.println("Task 3 Screenshot for firefox is taken ! - Product Details test");
			driver.findElement(By.xpath("//*[@id=\"IMG____9\"]")).click();
			
			//Script for Shopping Experience Test
			driver.findElement(By.xpath("//*[@id=\"SPAN__checkmark__107\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"filterBtn\"]")).click();
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File src=tsc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshot2/firefoxfilteroutput.jpg"));
			
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirjhar\\eclipse-workspace\\TraditionalTests\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.applitools.com/gridHackathonV2.html");
			driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"OPTION____200\"]")).getText()
					+   "    Task:1-1 | Test Name:Incomplete Text Found - TraditionalTestsV2 | DOMID:sort | Browser:chrome | ViewPort:1200X700");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"UL____21\"]")).getText() +  
					"  Task:1-2 | Test Name:MenuBar Present - TraditionalTestsV2 | DOMID:UL____21 | Browser:chrome | ViewPort:1200X700");
			// Script for finding Add to Favorites button on Mousehover for chrome
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//*[@id=\"IMG__imgfluid__215\"]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]"))).click().build().perform();
			System.out.println("Task:1-3 | Test Name:Mousehover element Present - TraditionalTestsV2 | DOMID:I__tiheart__225 | Browser:chrome | ViewPort:1200X700");
			
			// Script for product details validation.
			driver.findElement(By.xpath("//*[@id=\"product_1\"]")).click();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshot2/chrome.jpg"));
			System.out.println("Task 3 Screenshot for chrome is taken ! - Product Details test");
			driver.findElement(By.xpath("//*[@id=\"IMG____9\"]")).click();
			
			//Script for Shopping Experience Test
			driver.findElement(By.xpath("//*[@id=\"SPAN__checkmark__107\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"filterBtn\"]")).click();
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File src=tsc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshot2/chromefilteroutput.jpg"));
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Nirjhar\\eclipse-workspace\\TraditionalTests\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.applitools.com/gridHackathonV2.html");
			driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"OPTION____200\"]")).getText()
					+ "  Task:1-1 | Test Name:Incomplete Text Found - TraditionalTestsV2 | DOMID:sort | Browser:edge | ViewPort:1200X700");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"UL____21\"]")).getText() +  
					"  Task:1-2 | Test Name:MenuBar Present - TraditionalTestsV2 | DOMID:UL____21 | Browser:edge | ViewPort:1200X700");
			// Script for finding Add to Favorites button on Mousehover for edge
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//*[@id=\"IMG__imgfluid__215\"]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]"))).click().build().perform();
			System.out.println("Task:1-3 | Test Name:Mousehover element Present - TraditionalTestsV2 | DOMID:"+driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]")).getAttribute("id")
								+ "| Browser:edge | ViewPort:1200X700");
			
			// Script for product details validation.
			driver.findElement(By.xpath("//*[@id=\"product_1\"]")).click();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshot2/edge.jpg"));
			System.out.println("Task 3 Screenshot for edge taken ! - Product Details test");
			driver.findElement(By.xpath("//*[@id=\"IMG____9\"]")).click();
			
			//Script for Shopping Experience Test
			driver.findElement(By.xpath("//*[@id=\"SPAN__checkmark__107\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"filterBtn\"]")).click();
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File src=tsc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshot2/edgefilteroutput.jpg"));
		}
		else if(browserName.equalsIgnoreCase("tablet"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Nirjhar\\eclipse-workspace\\TraditionalTests\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().setSize(new Dimension(768,1024));
			driver.get("https://demo.applitools.com/gridHackathonV2.html");
			driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"OPTION____200\"]")).getText()
					+ "    Task:1-1 | Test Name:Incomplete Text Found - TraditionalTestsV2 | DOMID:sort | Browser:tablet | ViewPort:768X1024");
			driver.findElement(By.xpath("//*[@id=\"DIV__hamburgerh__12\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"DIV__mainmenu__15\"]")).getText();
			WebElement element = driver.findElement(By.id("I__ticlose__20"));
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"DIV__mainmenu__15\"]")).getText() +  
					"  Task:1-2 | Test Name:Hamburger MenuBar Present - TraditionalTestsV2 | DOMID:DIV__hamburgerh__12 | Browser:tablet | ViewPort:768X1024");
			// Script for finding Add to Favorites button on Mousehover for Tablet for V2
			driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]")).getAttribute("id");
			System.out.println("Task:1-3 | Test Name:Add to Favorites button for tablet | DOMID:" + driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]")).getAttribute("id")
					+ "| Browser:tablet | ViewPort:768X1024");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"A__btnsearchm__59\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"INPUTtext__formcontro__62\"]")).sendKeys("Appli Ait x Night");
			driver.findElement(By.xpath("//*[@id=\"INPUTsubmit__btnfullwid__63\"]")).click();
			
			// Script for product details validation.
			driver.findElement(By.xpath("//*[@id=\"product_1\"]")).click();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshot2/tablet.jpg"));
			System.out.println("Task 3 Screenshot for tablet is taken ! - Product Details test");
			driver.findElement(By.xpath("//*[@id=\"IMG____9\"]")).click();
			
			//Script for Shopping Experience Test
			driver.findElement(By.xpath("//*[@id=\"ti-filter\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"SPAN__checkmark__107\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"filterBtn\"]")).click();
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File src=tsc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshot2/tabletfilteroutput.jpg"));
			
		}
		else if(browserName.equalsIgnoreCase("mobile"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Nirjhar\\eclipse-workspace\\TraditionalTests\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().setSize(new Dimension(500,700));
			driver.get("https://demo.applitools.com/gridHackathonV2.html");
			driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"OPTION____200\"]")).getText() + 
					"     Task:1-1 | Test Name:Incomplete Text Found - TraditionalTestsV2 | DOMID:UL____21 | Browser:mobile | ViewPort:500X700");
			driver.findElement(By.xpath("//*[@id=\"DIV__hamburgeri__14\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"DIV__mainmenu__15\"]")).getText();
			driver.findElement(By.xpath("//*[@id=\"I__ticlose__20\"]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"DIV__mainmenu__15\"]")).getText() +  
					"  Task:1-2 | Test Name:Hamburger MenuBar Present - TraditionalTestsV2 | DOMID:DIV__hamburgeri__14 | Browser:mobile | ViewPort:500X700");
			// Script for finding Add to Favorites button for Mobile for V2
			driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]")).getAttribute("class");
			System.out.println("Task:1-3 | Test Name:Add to Favorites button for Mobile | DOMID:"+ driver.findElement(By.xpath("//*[@id=\"I__tiheart__225\"]")).getAttribute("class") 
					+"| Browser:mobile | ViewPort:500X700");
			// Script for Search bar in mobile in V2
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"A__btnsearchm__59\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"INPUTtext__formcontro__62\"]")).sendKeys("Appli Ait x Night");
			driver.findElement(By.xpath("//*[@id=\"INPUTsubmit__btnfullwid__63\"]")).click();
			
			// Script for product details validation.
			driver.findElement(By.xpath("//*[@id=\"product_1\"]")).click();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshot2/mobile.jpg"));
			System.out.println("Task 3 Screenshot for mobile is taken ! - Product Details test");
			driver.findElement(By.xpath("//*[@id=\"IMG____9\"]")).click();
			
			//Script for Shopping Experience Test
			driver.findElement(By.xpath("//*[@id=\"ti-filter\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"SPAN__checkmark__107\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"filterBtn\"]")).click();
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File src=tsc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshot2/mobilefilteroutput.jpg"));
			
		}
		
		driver.quit();
	}

}
