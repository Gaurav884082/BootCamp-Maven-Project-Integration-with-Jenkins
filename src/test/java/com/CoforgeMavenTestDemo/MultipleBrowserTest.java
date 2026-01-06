package com.CoforgeMavenTestDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	WebDriver driver;
	String ChromeBaseUrl = "https://www.selenium.dev/downloads/";
	String FirefoxBaseUrl = "https://www.hollandandbarrett.com/";
	String EdgeBaseUrl = "https://testng.org/";

	@Test(priority = 2)
	public void ChromeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\ChromeBrowserJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);

		String expectedTitle = "Downloads | Selenium";
		String actualTitle = driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current URL: " + url);
		System.out.println("URL Length: " + urlLength);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}

		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}

	@Test(priority = 1)
	public void FirefoxTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\FirefoxBrowserJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(FirefoxBaseUrl);

		String expectedTitle = "Holland & Barrett - The UK's Leading Health & Wellness Store";
		String actualTitle = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed");
		} else {
			System.out.println("Title not matched: Test Script Failed");
		}
		driver.quit();
	}

	@Test(priority = 0)
	public void EdgeTest() {
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\EdgeBrowserJars\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(EdgeBaseUrl);

		String expectedTitle = "TestNG Documentation";
		String actualTitle = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed");
		} else {
			System.out.println("Title not matched: Test Script Failed");
		}
		driver.quit();
	}

	@Test(priority = 3)
	public void ChromeTest1() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\ChromeBrowserJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);

		String expectedTitle = "Selenium";
		String actualTitle = driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current URL: " + url);
		System.out.println("URL Length: " + urlLength);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}

		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}

	@Test(priority = 4)
	public void ChromeTest2() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\ChromeBrowserJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);

		String expectedTitle = "Raghavendra";
		String actualTitle = driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current URL: " + url);
		System.out.println("URL Length: " + urlLength);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}

		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}

	@Test(priority = 5)
	public void ChromeTest4() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\ChromeBrowserJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);

		String expectedTitle = "Downloads 3| Selenium";
		String actualTitle = driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current URL: " + url);
		System.out.println("URL Length: " + urlLength);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}

		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}

	@Test(priority = 6)
	public void EdgeTestUpdate() {
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\EdgeBrowserJars\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(EdgeBaseUrl);

		String expectedTitle = "TestNG Documentation";
		String actualTitle = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed");
		} else {
			System.out.println("Title not matched: Test Script Failed");
		}
		driver.quit();
	}

	@Test(priority = 7)
	public void IDLocatorExample() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCompletePrograms\\BootCampMavenIntegrationWithJenkinsDemo\\ChromeBrowserJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		//driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//driver.quit();
		
	}
	}

