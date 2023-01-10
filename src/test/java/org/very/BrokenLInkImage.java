package org.very;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLInkImage{

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println("count of available links: "+links.size());
		
		for (WebElement link : links) {
			String linkurl = link.getAttribute("src");
			System.out.println(linkurl);
			
			if (linkurl!=null) {
				
				//linkurl string to urrl
				
				URL url =new URL(linkurl);
				//conecction kuduthing
				URLConnection openConnection = url.openConnection();
				//typecasting
				HttpURLConnection h =(HttpURLConnection)openConnection;
				
				int code = h.getResponseCode();
				
				if (code!=200) {
					
					System.out.println("broken link: "+code);
					
				}
			}
		}
		
	
		
	}

}
