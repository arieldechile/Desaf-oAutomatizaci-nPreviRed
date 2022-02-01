package calidad;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IngresarOpencart {

	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/** Ingresar a URL: opencart.abstracta.us */
		driver.get("http://opencart.abstracta.us/index.php?route=common/home");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void FlujoCompra() {
		/** Seleccionar caja de búsqueda */
		WebElement searchbox = driver.findElement(By.name("search"));
		searchbox.clear();
		// Ingresar Producto
		searchbox.sendKeys("ipod Classic");
		// Añadir al carro

		// searchbox.submit();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// assertEquals("ipod Classic - Your Store",driver.getTitle());

	}
	// @After
	// public void tearDown() {
	// driver.quit();
}
