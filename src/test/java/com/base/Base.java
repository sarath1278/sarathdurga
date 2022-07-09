package com.base;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void geturl(String url) {
		driver.get(url);
	}

	public void txtKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void navTo(String url) {
		driver.navigate().to(url);
	}

	public void navBack() {
		driver.navigate().back();
	}

	public void navForward() {
		driver.navigate().forward();
	}

	public void navRefresh() {
		driver.navigate().refresh();
	}

	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public void findByName(String name) {
		driver.findElement(By.name(name));
	}

	public void findByClassName(String className) {
		driver.findElement(By.className(className));
	}

	public void findByTagName(String tag) {
		driver.findElement(By.tagName(tag));
	}

	public void FindByXpath(String xpath) {
		driver.findElement(By.xpath(xpath));
	}

	public void FindByLink(String link) {
		driver.findElement(By.linkText(link));
	}

	public void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public void getTagName(WebElement element) {
		String text = element.getTagName();
		System.out.println(text);
	}

	
	public void getTitle() {
		driver.getTitle();
	}

	public void erase(WebElement element) {

		element.clear();
	}

	public void moveToElementId(String id) {
		WebElement element = driver.findElement(By.id(id));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void moveToElementName(String name) {
		WebElement element = driver.findElement(By.name(name));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void moveToElementClassName(String className) {
		WebElement element = driver.findElement(By.className(className));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void moveToElementTag(String tagName) {
		WebElement element = driver.findElement(By.tagName(tagName));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void moveToElementXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void moveToElementLink(String link) {
		WebElement element = driver.findElement(By.linkText(link));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void dragAndDropId(String source, String destination) {
		WebElement s = driver.findElement(By.id(source));
		WebElement d = driver.findElement(By.id(destination));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	public void dragAndDropName(String source, String destination) {
		WebElement s = driver.findElement(By.name(source));
		WebElement d = driver.findElement(By.name(destination));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	public void dragAndDropClassName(String source, String destination) {
		WebElement s = driver.findElement(By.className(source));
		WebElement d = driver.findElement(By.className(destination));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	public void dragAndDropXpath(String source, String destination) {
		WebElement s = driver.findElement(By.xpath(source));
		WebElement d = driver.findElement(By.xpath(destination));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	public void dragAndDropTag(String source, String destination) {
		WebElement s = driver.findElement(By.tagName(source));
		WebElement d = driver.findElement(By.tagName(destination));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	public void dragAndDropLink(String source, String destination) {
		WebElement s = driver.findElement(By.linkText(source));
		WebElement d = driver.findElement(By.linkText(destination));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	public void rightClickId(String data) {
		WebElement rightClick = driver.findElement(By.id(data));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
	}

	public void rightClickName(String data) {
		WebElement rightClick = driver.findElement(By.name(data));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
	}

	public void rightClickClassName(String data) {
		WebElement rightClick = driver.findElement(By.className(data));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
	}

	public void rightClickTag(String data) {
		WebElement rightClick = driver.findElement(By.tagName(data));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
	}

	public void rightClickxpath(String data) {
		WebElement rightClick = driver.findElement(By.xpath(data));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
	}

	public void rightClickLink(String data) {
		WebElement rightClick = driver.findElement(By.linkText(data));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
	}

	public void Robot(int keyCodePress, int keyCodeRelease) throws AWTException {
		java.awt.Robot robot = new java.awt.Robot();
		robot.keyPress(keyCodePress);
		robot.keyRelease(keyCodeRelease);
	}

	public void alertAccept(long seconds) {
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		alert.accept();
	}

	public void alertDismiss(long seconds) {
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		alert.dismiss();
	}

	public void alertSendKeys(long seconds, String data) {
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		alert.sendKeys(data);
	}

	public void alertGetText(long seconds) {
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		alert.getText();
	}

	public void doubleClickId(String data) {
		WebElement element = driver.findElement(By.id(data));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void doubleClickName(String data) {
		WebElement element = driver.findElement(By.name(data));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void doubleClickClassName(String data) {
		WebElement element = driver.findElement(By.className(data));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void doubleClickTagName(String data) {
		WebElement element = driver.findElement(By.tagName(data));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void doubleClickxpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void doubleClickLink(String data) {
		WebElement element = driver.findElement(By.linkText(data));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void takeScreenshot(String fileLocationAndName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ScreenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(fileLocationAndName);
		FileUtils.copyFile(ScreenshotAs, file);
	}

	public void jsExecutorId(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.id(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
	}

	public void jsExecutorName(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.name(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
	}

	public void jsExecutorClassName(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.className(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
	}

	public void jsExecutorTagName(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.tagName(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
	}

	public void jsExecutorXpath(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
	}

	public void jsExecutorLink(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.linkText(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
	}

	public void jsExecutorGetTextId(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.id(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String S = (String) executeScript;
		System.out.println(S);
	}

	public void jsExecutorGetTextName(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.name(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String S = (String) executeScript;
		System.out.println(S);
	}

	public void jsExecutorGetTextClassName(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.className(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String S = (String) executeScript;
		System.out.println(S);
	}

	public void jsExecutorGetTextTagName(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.tagName(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String S = (String) executeScript;
		System.out.println(S);
	}

	public void jsExecutorGetTextXpath(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String S = (String) executeScript;
		System.out.println(S);
	}

	public void jsExecutorGetTextLink(String locator, String setAttributeValueAndData) {
		WebElement element = driver.findElement(By.linkText(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(setAttributeValueAndData, element);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String S = (String) executeScript;
		System.out.println(S);
	}

	public void scrollDownId(String data) {
		WebElement scrollDown = driver.findElement(By.id(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public void scrollDownName(String data) {
		WebElement scrollDown = driver.findElement(By.name(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public void scrollDownClassName(String data) {
		WebElement scrollDown = driver.findElement(By.className(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public void scrollDownTagName(String data) {
		WebElement scrollDown = driver.findElement(By.tagName(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public void scrollDownXpath(String data) {
		WebElement scrollDown = driver.findElement(By.xpath(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public void scrollDownLink(String data) {
		WebElement scrollDown = driver.findElement(By.linkText(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	public void scrollUpId(String data) {
		WebElement scrollUp = driver.findElement(By.id(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public void scrollUpName(String data) {
		WebElement scrollUp = driver.findElement(By.name(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public void scrollUpClassName(String data) {
		WebElement scrollUp = driver.findElement(By.className(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public void scrollUpTagName(String data) {
		WebElement scrollUp = driver.findElement(By.tagName(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public void scrollUpXpath(String data) {
		WebElement scrollUp = driver.findElement(By.xpath(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public void scrollUpLink(String data) {
		WebElement scrollUp = driver.findElement(By.linkText(data));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	public void frameCountId(String data) {
		List<WebElement> framecount = driver.findElements(By.id(data));
		int size = framecount.size();
		System.out.println(size);
	}

	public void frameCountName(String data) {
		List<WebElement> framecount = driver.findElements(By.name(data));
		int size = framecount.size();
		System.out.println(size);
	}

	public void frameCountClassName(String data) {
		List<WebElement> framecount = driver.findElements(By.className(data));
		int size = framecount.size();
		System.out.println(size);
	}

	public void frameTagName(String data) {
		List<WebElement> framecount = driver.findElements(By.tagName(data));
		int size = framecount.size();
		System.out.println(size);
	}

	public void frameCountXpath(String data) {
		List<WebElement> framecount = driver.findElements(By.xpath(data));
		int size = framecount.size();
		System.out.println(size);
	}

	public void frameCountLink(String data) {
		List<WebElement> framecount = driver.findElements(By.linkText(data));
		int size = framecount.size();
		System.out.println(size);
	}

	public void switchFrameId(int frameNumber, String locator, String keys) {
		driver.switchTo().frame(frameNumber);
		WebElement element = driver.findElement(By.id(locator));
		element.sendKeys(keys);
	}

	public void switchFrameName(int frameNumber, String locator, String keys) {
		driver.switchTo().frame(frameNumber);
		WebElement element = driver.findElement(By.name(locator));
		element.sendKeys(keys);
	}

	public void switchFrameClassName(int frameNumber, String locator, String keys) {
		driver.switchTo().frame(frameNumber);
		WebElement element = driver.findElement(By.className(locator));
		element.sendKeys(keys);
	}

	public void switchFrameTagName(int frameNumber, String locator, String keys) {
		driver.switchTo().frame(frameNumber);
		WebElement element = driver.findElement(By.tagName(locator));
		element.sendKeys(keys);
	}

	public void switchFrameXpath(int frameNumber, String locator, String keys) {
		driver.switchTo().frame(frameNumber);
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(keys);
	}

	public void switchFrameLink(int frameNumber, String locator, String keys) {
		driver.switchTo().frame(frameNumber);
		WebElement element = driver.findElement(By.linkText(locator));
		element.sendKeys(keys);
	}

	public void switchOutFrame() {
		driver.switchTo().defaultContent();
	}

	public void dropMenuSelectIndexId(String locator, int index) {
		WebElement element = driver.findElement(By.id(locator));
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropMenuSelectIndexName(String locator, int index) {
		WebElement element = driver.findElement(By.name(locator));
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropMenuSelectIndexClassName(String locator, int index) {
		WebElement element = driver.findElement(By.className(locator));
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropMenuSelectIndexTagName(String locator, int index) {
		WebElement element = driver.findElement(By.tagName(locator));
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropMenuSelectIndexXpath(String locator, int index) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropMenuSelectIndexLink(String locator, int index) {
		WebElement element = driver.findElement(By.linkText(locator));
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropMenuSelectValueId(String locator, String data) {
		WebElement element = driver.findElement(By.id(locator));
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void dropMenuSelectValueName(String locator, String data) {
		WebElement element = driver.findElement(By.name(locator));
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void dropMenuSelectValueClassName(String locator, String data) {
		WebElement element = driver.findElement(By.className(locator));
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void dropMenuSelectTagName(String locator, String data) {
		WebElement element = driver.findElement(By.tagName(locator));
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void dropMenuSelectValueXpath(String locator, String data) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void dropMenuSelectValueLink(String locator, String data) {
		WebElement element = driver.findElement(By.linkText(locator));
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void dropMenuSelectVisibleId(String locator, String data) {
		WebElement element = driver.findElement(By.id(locator));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void dropMenuSelectVisibleName(String locator, String data) {
		WebElement element = driver.findElement(By.name(locator));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void dropMenuSelectVisibleClassName(String locator, String data) {
		WebElement element = driver.findElement(By.className(locator));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void dropMenuSelectVisibleTagName(String locator, String data) {
		WebElement element = driver.findElement(By.tagName(locator));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void dropMenuSelectVisibleXpath(String locator, String data) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void dropMenuSelectVisibleLink(String locator, String data) {
		WebElement element = driver.findElement(By.linkText(locator));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void maximize() {
		driver.manage().window().maximize();

	}
	public void implicityWaits() {
		
		driver.manage().window().maximize();
	}
	public String getAttributeValue(String attribuename,WebElement element) {
		String attribute = element.getAttribute(attribuename);
	//	System.out.println(attribute);
		return attribute;
		//System.out.println("");
		

	}

	public String getData(String sheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DurgaSarath\\Excel sheet\\Adact in hotel task.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/YY");
				res = dateformat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				res = valueOf.toString();

			}
			break;
		default:
			break;
		}
		return res;
	}
	public void name(String sheetname,int rownum,int columnum) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DurgaSarath\\Excel sheet\\Adact in hotel task.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(columnum);
	//	CellType cellType = cell.getCellType();
		String value = cell.getStringCellValue();
		cell.setCellValue(value);
		
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		//return element;
		
	
	}
	

	

}
