package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.KeralaPropertylogin;
import pagepkg.Kpregisterpage;

public class Kptest {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.keralaproperty.in");
	}
	@Test
	public void test()
	{
		Kpregisterpage ob=new Kpregisterpage(driver);
		ob.loginclick();
		ob.newuserclick();
		ob.dropdown();
		ob.setvalues("sidharth s","snairsidharth771@gmail.com", "abcd123", "abcd123", "9961874063");
		ob.createclick();
		KeralaPropertylogin ob1=new KeralaPropertylogin(driver);
		ob1.setvalues("sidharth s", "abcd123");
		ob1.loginclick();
	}
	
	

}

