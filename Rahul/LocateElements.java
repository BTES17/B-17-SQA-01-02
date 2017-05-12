import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LocateElements {

	public static void main(String[] args) {


	String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
	String drivepath=System.setProperty("webdriver.gecko.driver",url);
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.facebook.com/");
	String expectedURL="https://www.facebook.com/";
	String actualURL=driver.getCurrentUrl();
	System.out.println(actualURL);
	
	if(actualURL.equals (expectedURL))
	{
		System.out.println("URL of the application - URL passed");		
	}
	else
	{
		System.out.println("Test Case Failed");
		
	}
	
	}

}
