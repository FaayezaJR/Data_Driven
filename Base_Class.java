package Org.Maven;	
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base_Class {
public static String value;
public static WebDriver driver;
public static WebDriver getBrowser(String type) { 
					 if (type.equalsIgnoreCase("chrome")) {
						 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Driver new//chromedriver.exe");
						 driver = new ChromeDriver();
			    }
					 else if (type.equalsIgnoreCase("firefox")) {
						 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//Driver new//chromedriver.exe");
						 driver = new FirefoxDriver();
				}
					 driver.manage().window().maximize();
					 return driver;
				 }

				 public static void clickOnWebElement(WebElement element) {
				 element.click();
				 }
				 public static void inputValueElement(WebElement element, String Value)
				 {
					 element.sendKeys(Value);
				 }
					 
				 public static void url(String url) {
					 
				 driver.get(url);
			}
				 
				 public static String Read_particular_Data(String path, int row_index, int cell_index) throws Throwable  {
						File f = new File ("C:\\Users\\faayeza\\eclipse-workspace\\Maven.Archetype.quickstart\\Test cases.xlsx");
						FileInputStream fi = new FileInputStream(f);
						Workbook wb = new XSSFWorkbook(fi);
					    Sheet sheet = wb.getSheetAt(0);	
						Row row = sheet.getRow(row_index);
					    Cell cell = row.getCell(cell_index);
					    CellType cellType = cell.getCellType();
					    if (cellType.equals((CellType.STRING))) {
					    value = cell.getStringCellValue();
							
						}
					    else if (cellType.equals((CellType.NUMERIC))) {
					    	double cellValue = cell.getNumericCellValue();
					    	int Val = (int) cellValue;
					    	value = String.valueOf(Val);
					    }
					    return value;
		}}
		
		
		
		
		
		


