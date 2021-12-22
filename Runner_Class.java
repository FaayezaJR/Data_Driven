package Org.Maven;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.Pom.Page_Object_Manager;
import com.helper.Reader_Manager;
public class Runner_Class extends Base_Class {
		    public static WebDriver driver = getBrowser("chrome");
		    public static Page_Object_Manager pom = new Page_Object_Manager(driver);
		    static Logger log = Logger.getLogger(Runner_Class.class);
		    public static void main(String args[]) throws Throwable{
		    PropertyConfigurator.configure("log4j.properties");
        	log.info("Browser launch");
        	String url = Reader_Manager.getInstanceRM().getInstanceCR().geturl();
		   	url(url);
			clickOnWebElement(pom.getInstanceHp().getSign_in());
			String username = Reader_Manager.getInstanceRM().getInstanceCR().getusername();
			inputValueElement(pom.getInstanceLp().getEmail(),username);
			String password = Reader_Manager.getInstanceRM().getInstanceCR().getpassword();
			inputValueElement(pom.getInstanceLp().getPassword(),password);
			clickOnWebElement(pom.getInstanceLp().getSign_btn());
			log.info("sign in sucessfully");
			clickOnWebElement(pom.getInstanceT().getTshirts());
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,550);");
			clickOnWebElement(pom.getInstanceTi().getTshirt_Img());
			driver.switchTo().frame(pom.getInstancef().getFrame());
			clickOnWebElement(pom.getInstanceA().getAdd_Cart());
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			clickOnWebElement(pom.getInstancepc().getCheckout());
			Thread.sleep(8000);
			clickOnWebElement(pom.getInstancepc1().getCheckout_1());
		    js.executeScript("window.scrollBy(0,850);");
			clickOnWebElement(pom.getInstancepc2().getCheckout_2());
			clickOnWebElement(pom.getInstancepc3().getCheckout_3());
			clickOnWebElement(pom.getInstancepc11().getCheckout_11());
		    Thread.sleep(3000);
			clickOnWebElement(pom.getInstancepc4().getCheckout_4());
		    Thread.sleep(3000);
	        js.executeScript("window.scrollBy(0,850);");
		    clickOnWebElement(pom.getInstancepc5().getCheckout_5());
	        js.executeScript("window.scrollBy(0,350);");
	        Thread.sleep(3000);
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        File destination = new File("C:\\Users\\faayeza\\eclipse-workspace\\Selenium_Testing\\screenshots//pic8.png");
	        FileUtils.copyFile(source, destination);
        	log.info("screenshot captured");
		}						
			}
		




