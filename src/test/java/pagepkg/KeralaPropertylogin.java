package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeralaPropertylogin {
	 
	WebDriver driver;
	
	By kplogin=By.xpath("/html/body/header/div[1]/div/a[1]");
	By kpname=By.id("ulogin");
	By kppass=By.id("upass");
	By kploginclick=By.id("sub_logbtn");
	
	public KeralaPropertylogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String name,String pass)
	{
		driver.findElement(kpname).sendKeys(name);
		driver.findElement(kppass).sendKeys(pass);
	}
	public void loginclick()
	{
		driver.findElement(kploginclick).click();
	}

}
