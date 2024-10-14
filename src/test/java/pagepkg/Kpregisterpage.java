package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Kpregisterpage {
	
	WebDriver driver;
	
	By kplogin=By.xpath("/html/body/header/div[1]/div/a[1]");
	By kpnewuser=By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/a");
	By kpdropdown=By.id("listowner");
	By kpname=By.id("utitle");
	By kpemail=By.id("umail");
	By kppass=By.id("memberpass");
	By kprepass=By.id("repass");
	By kpno=By.id("umobile");
	By kpcreate=By.id("sub_regbutton");
	
	public Kpregisterpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginclick()
	{
		driver.findElement(kplogin).click();
	}
	public void newuserclick()
	{
		driver.findElement(kpnewuser).click();
	}
	public void dropdown()
	{
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"listowner\"]"));
    	Select iama=new Select((dropdown));
    	iama.selectByIndex(1);
	}
	public void setvalues(String name,String email,String pass,String repass,String number)
	{
		
		driver.findElement(kpname).sendKeys(name);
		driver.findElement(kpemail).sendKeys(email);
		driver.findElement(kppass).sendKeys(pass);
		driver.findElement(kprepass).sendKeys(repass);
		driver.findElement(kpno).sendKeys(number);
	}
	public void createclick()
	{
		driver.findElement(kpcreate).click();
	}
	


}
