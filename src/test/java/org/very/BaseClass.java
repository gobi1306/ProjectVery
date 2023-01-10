package org.very;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	 
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("--disable-blink-features=AutomationControlled");
		//opts.addArguments("excludeSwitches", "enable-automation");
		driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
	}
	public static void fox() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt=new FirefoxOptions();
		opt.addPreference("excludeSwitches", "enable-automation");
		driver=new FirefoxDriver(opt);
		

	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void sentKeys(WebElement element, String key) {
		element.sendKeys(key);

	}

	public static void click(WebElement element) {
		element.click();

	}

	

	public static void selectbyindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void selectVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}

	public static void selectbyValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
	public static String readExcel(String path,String sheetName,int rowNO,int cellNo,String dateFormat) throws IOException {
		File f=new File(path);
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNO);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String name="";
		if(cellType==1) {
			name = cell.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(cell)) {
			
			 Date dateCellValue = cell.getDateCellValue();
			 SimpleDateFormat simp=new SimpleDateFormat(dateFormat);
			  name = simp.format(dateCellValue);
			
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			name = String.valueOf(l);
		}return name;
		
	}
	public static void mouseOver(WebElement element) {
		Actions a=new Actions(driver);

		a.moveToElement(element).perform();
		
	}
	public static void rightContextClick(WebElement element) {
		Actions a=new Actions(driver);

		a.contextClick(element).perform();
	}
	public static void name(WebElement element,WebElement element2) {
		Actions a=new Actions(driver);

		a.dragAndDrop(element, element2).perform();
		
	}
	public static void dobuleClick(WebElement element) {
		Actions a=new Actions(driver);
          a.click(element).perform();
	}
	public static void screenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File p = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileUtils.copyFile(p, f);
		
		
	}
	
	

}

