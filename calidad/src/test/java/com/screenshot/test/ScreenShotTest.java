package com.screenshot.test;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	/** metodo que agrega la fecha al archivo de la validacion */
	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date date = new Date(0);
		return dateFormat.format(date);
	}
/**
 * Código que extrae la captura de pantalla
 * 
 * @Rule public TestRule watcher = new TestWatcher() { protected void
 *       failed(Throwable throwable,Description description) { File
 *       screnshotFile =
 *       ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try { File
 *       screenshotFile; FileUtils.copyFile(screenshotFile, new
 *       File("evidencia_"+description.getMethodName()+getDate()+".jpg")); }
 *       catch (Exception e) { e.printStackTrace(); }
 * 
 *       }
 * 
 * @Override protected void finished(Description description) { driver.quit(); }
 * 
 *           };
 * 
 *           @SuppressWarnings("deprecation")
 * @Test public void test() {
 *       driver.get("http://opencart.abstracta.us/index.php?route=common/home");
 *       WebElement searchBox = driver.findElement(By.name("q"));
 *       searchBox.sendKeys("ipod - Buscar con Google"); searchBox.submit();
 * 
 *       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * 
 *       assertEquals("Esto ocasionara un error", driver.getTitle());
 * 
 *       }
 * 
 *       }
 * 
 */
