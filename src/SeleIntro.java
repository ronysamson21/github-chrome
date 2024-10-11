import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleIntro {

	public static void main(String[] args) {
		
		//invoking browser
		//Chrome - ChromeDriver - Methods
		//ChromeDriver driver= new ChromeDriver();
		
		//chromedriver.exe
		//steps to invoke chrome driver
		//selenium manager
		//invoke manually
		System.setProperty("webdriver.chrome.driver", "/users/ronysamson/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
	

	}

}
