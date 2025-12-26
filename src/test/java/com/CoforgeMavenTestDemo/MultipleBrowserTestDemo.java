package com.CoforgeMavenTestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleBrowserTestDemo {
	WebDriver driver;
	String ChromeBaseUrl="https://testng.org/";
	String FirefoxBaseUrl="https://www.hollandandbarrett.com/";
	String EdgeBaseUrl="https://www.selenium.dev/downloads/";

	@Test(priority=0)
	public void ChromeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\ChromeBrowserJars\\chromedriver.exe");//key value pair
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);
		String expectedTitle="Downloads | Selenium";
		String ActualTitle=driver.getTitle();
		String url=driver.getCurrentUrl();
		int urlLength=url.length();
		System.out.println("Current URL:" + url);
		System.out.println("URL Length:"+urlLength);
		
		if(ActualTitle.equals(expectedTitle)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....");
		}
		else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
		
		
	}
}
