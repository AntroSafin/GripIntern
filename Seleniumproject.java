package antro;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumproject {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:/ECLIPSE WORKSPACE/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		String actual=driver.getTitle();
		String estimated="The Sparks Foundation | Home";
		if(actual.equalsIgnoreCase(estimated))
		{
			System.out.println("Test 1 successfull");
		}
		else
		{
			System.out.println("Test 1 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/about/vision-mission-and-values/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		boolean status = driver.findElement(By.className("b-nav")).isDisplayed();
		if(status)
		{
			System.out.println("Test 2 successfull");
		}
		else
		{
			System.out.println("Test 2 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/policies-and-code/code-of-ethics-and-conduct/");
		driver.manage().window().maximize();
		boolean status2 = driver.findElement(By.className("media-body")).isDisplayed();
		if(status2)
		{
			System.out.println("Test 3 successfull");
		}
		else
		{
			System.out.println("Test 3 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/links/software-and-app/");
		driver.manage().window().maximize();
		boolean status3 = driver.findElement(By.className("w3l-blog-list")).isDisplayed();
		if(status3)
		{
			System.out.println("Test 4 successfull");
		}
		else
		{
			System.out.println("Test 4 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/links/software-and-app/");
		driver.manage().window().maximize();
		boolean status4 = driver.findElement(By.className("top-header-agile-right")).isDisplayed();
		if(status4)
		{
			System.out.println("Test 5 successfull");
		}
		else
		{
			System.out.println("Test 5 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		boolean status5 = driver.findElement(By.className("flex-active")).isDisplayed();
		if(status5)
		{
			System.out.println("Test 6 successfull");
		}
		else
		{
			System.out.println("Test 6 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/links/ai-in-education/");
		driver.manage().window().maximize();
		String actual_cus=driver.getTitle();
		String estimated_cus="The Sparks Foundation | Home";
		if(actual_cus.equalsIgnoreCase(estimated_cus))
		{
			System.out.println("Test 7 successfull");
		}
		else
		{
			System.out.println("Test 7 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/links/ai-in-education/");
		driver.manage().window().maximize();
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("scrollBy(0,5000)");
		driver.findElement(By.className("b-nav")).click();
		if(driver.getTitle().equals("The Sparks Foundation | Home"))
		{
			System.out.println("Test 8 successfull");
		}
		else
		{
			System.out.println("Test 8 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/policies-and-code/service-quality-values/");
		driver.manage().window().maximize();
		boolean s = driver.findElement(By.className("b-nav")).isDisplayed();
		if(s)
		{
			System.out.println("Test 9 successfull");
		}
		else
		{
			System.out.println("Test 9 unsuccessfull");
		}
		driver.get("http://www.thesparksfoundationsingapore.org/join-us/brand-ambassador/");
		driver.manage().window().maximize();
		boolean s1 = driver.findElement(By.className("clearfix")).isDisplayed();
		if(s1)
		{
			System.out.println("Test 10 successfull");
		}
		else
		{
			System.out.println("Test 10 unsuccessfull");
		}
		driver.close();
		driver.quit();
	}

}
