package com.moderntests.applitools;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModernTestV2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirjhar\\eclipse-workspace\\com.moderntests.applitools\\src\\main\\resources\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		VisualGridRunner runner = new VisualGridRunner(1);
		Eyes eyes = new Eyes(runner);
		setUp(eyes);
		try {
			ultraFastTest(webDriver, eyes);

		} finally {
			tearDown(webDriver, runner);
		}
	}
	public static void setUp(Eyes eyes) {

		Configuration config = new Configuration();
		config.setApiKey("cIdTIET3smUNQBSuSTWmXgb5hQw7fLmNQfz8rxUzp1w110");
		config.setBatch(new BatchInfo("Modern Test V2"));
		config.addBrowser(800, 600, BrowserType.CHROME);
		config.addBrowser(700, 500, BrowserType.FIREFOX);
		config.addBrowser(1600, 1200, BrowserType.IE_11);
		config.addBrowser(1024, 768, BrowserType.EDGE_CHROMIUM);
		config.addBrowser(800, 600, BrowserType.SAFARI);
		config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
		eyes.setConfiguration(config);
	}

	public static void ultraFastTest(WebDriver webDriver, Eyes eyes) throws Exception {

		try {

			webDriver.get("https://demo.applitools.com/gridHackathonV2.html");

			// Call Open on eyes to initialize a test session
			eyes.open(webDriver, "Applitools UltrafastGrid", "Cross Browser Testing Demo App", new RectangleSize(1200, 700));
					
			webDriver.findElement(By.xpath("//*[@id=\"product_4\"]")).click();

			// Check product description
			eyes.check(Target.window().fully().withName("Appli ACG React Terra"));
			webDriver.findElement(By.xpath("//*[@id=\"IMG____9\"]")).click();
			Thread.sleep(5000);
			
			// Script for shopping experience and other UI Tests
			webDriver.findElement(By.xpath("//*[@id=\"SPAN__checkmark__107\"]")).click();
			webDriver.findElement(By.xpath("//*[@id=\"filterBtn\"]")).click();
			eyes.check(Target.window().fully().withName("Filter Result"));
			
			// Call Close on eyes to let the server know it should display the results
			eyes.closeAsync();

		} finally  {
			eyes.abortAsync();
		}

	}

	private static void tearDown(WebDriver webDriver, VisualGridRunner runner) {
		// Close the browser
		webDriver.quit();
		TestResultsSummary allTestResults = runner.getAllTestResults(false);
		System.out.println(allTestResults);
	}

}
