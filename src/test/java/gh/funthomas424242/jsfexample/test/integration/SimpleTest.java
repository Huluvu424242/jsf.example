package gh.funthomas424242.jsfexample.test.integration;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

@Category(IntegrationTest.class)
public class SimpleTest {

	private WebDriver driver;
	private String baseUrl;
	private final StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() {
		try {
			driver = new FirefoxDriver();
		} catch (Exception ex) {
			if (driver == null) {
				startFireFox();
			}
		}
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	}

	private void startFireFox() {
		final File file = new File(
				"C:\\usr\\portableapps\\PortableApps\\FirefoxPortable\\FirefoxPortable.exe");
		final FirefoxBinary binary = new FirefoxBinary(file);
		final FirefoxProfile profile = new FirefoxProfile();
		driver = new FirefoxDriver(binary, profile);
	}

	@Test
	@Category(IntegrationTest.class)
	public void testColdFusionLoadedIT() throws Exception {
		driver.get(baseUrl);
		final WebElement link = driver.findElement(By.xpath("/html/body/p/a"));
		final String linkText = link.getText();
		System.out.println("LinkText:" + linkText);
		link.click();
		// assertEquals("coldfusion",
		// driver.findElement(By.xpath("//table/tbody/tr[2]/td"))
		// .getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
