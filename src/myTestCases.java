import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {

	WebDriver driver = new ChromeDriver();
	String myURL = "https://www.almosafer.com/en?ncr=1";
	
	
	@BeforeTest
	public void mySetup () {
		driver.get(myURL);
		
		
	}
	
	
	@Test 
	public void myTest () {
		
		
		
	}
	
	
}
