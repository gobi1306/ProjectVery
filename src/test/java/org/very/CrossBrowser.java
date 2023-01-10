package org.very;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void browsers(String browserName) {
		if (browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browserName.contains("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if (browserName.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		}
			
		 
		
			
		}


