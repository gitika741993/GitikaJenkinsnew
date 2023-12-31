package GitikaJenkins.JenkinsTest;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;




public class Basecl {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public Basecl()
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\gitika\\GitikaEclipseProject1\\JenkinsTest\\data.properties");
			prop.load(ip);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initialization()
	{    
		ChromeOptions options = new ChromeOptions();
		ChromeDriverManager.chromedriver().setup();
	   // options.addArguments("--remote-allow-origins=*");
		/*
		 * options.addArguments("--disable-dev-shm-usage");
		 * options.addArguments("--ignore-ssl-errors=yes");
		 * options.addArguments("--ignore-certificate-errors");
		 * options.setExperimentalOption("useAutomationExtension", false);
		 * options.addArguments("--disable-extensions");
		 * options.addArguments("--headless"); options.addArguments("--disable-gpu");
		 * options.addArguments("--no-sandbox");
		 * 
		 * options.addArguments("--no-sandbox"); options.addArguments("--incognito");
		 * options.addArguments("--disable-application-cache");
		 * options.addArguments("--disable-dev-shm-usage"); //
		 * options.addArguments("--headless",
		 * "--window-size=1920,1200","--ignore-certificate-errors");
		 * options.addArguments("--headless");
		 */
	   // options.setAcceptInsecureCerts(true);
	    
	    //WebDriver driver = new ChromeDriver(options);
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			
			driver= new ChromeDriver(options);
		//	driver = WebDriverManager.Chrome(ChromeDriverManager().install())
		
		}
			
		if(browsername.equals("FF"))
		{
			
			driver= new FirefoxDriver();
		}
		
		if(browsername.equals("IE"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}


}
