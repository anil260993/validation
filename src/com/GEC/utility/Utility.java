package com.GEC.utility;

import java.util.List;
import java.util.concurrent.TimeUnit;
import com.GEC.MIS.popup.*;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	public static WebDriver driver;
	public static String block = null;

	public static void launch(String Browsername) throws Exception { // lauching browser with GEC application
		if (Browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/vassar/Documents/chromedriver");
			driver = new ChromeDriver();

			driver.get("http://apgrace.vassarlabs.com/dev");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("launched site in chrome");

		} else if (Browsername.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new ChromeDriver();

			driver.get("http://apgrace.vassarlabs.com/dev");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("launched site in firefox");
		}
	}

	public static void drillDown_To_BlockOrDistrictOrState(String state_OR_District_OR_Country) // for drilling down one
																								// level in forward and
																								// backward
			throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='MIS view']")).click();// clicking on misview
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("//*[contains(text(),'" + state_OR_District_OR_Country + "')]"))
					.isDisplayed()) {// checking where sending text is matching with State/District
				driver.findElement(By.xpath("//*[contains(text(),'" + state_OR_District_OR_Country + "')]")).click();// if
																														// match
																														// click
																														// on
																														// State/District
				System.out.println(
						"navigated to  Selected state_OR_District_OR_Country:: " + state_OR_District_OR_Country);// print
																													// state/District

			}
		} catch (NoSuchElementException e) {
			System.out.println(state_OR_District_OR_Country
					+ "  state/District/Country is not present in list plz eneter valid   state/District/Country ");// if
																													// text
			//Alert_message(state_OR_District_OR_Country + " District is not present in list plz eneter valid   District ")	;																									// doesn't
																													// match
																													// with
																													// state/District
		}
	}

	public static void drillDown_To_BlockOrDistrictOrState(String state, String district) throws InterruptedException {// used
																														// to
																														// drilldown
																														// two
																														// level
																														// in
																														// forward
																														// and
																														// backward

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='MIS view']")).click();// clicking on misview

		try {
			Thread.sleep(5000);
			if (driver.findElement(By.xpath("//*[contains(text(),'" + state + "')]")).isDisplayed()) {// checking where
																										// sending text
																										// is matching
				Thread.sleep(5000);																			// with State
				driver.findElement(By.xpath("//*[contains(text(),'" + state + "')]")).click();// if match click on State
				System.out.println(" navigated to ---->State::" + state);// print state

			}
		} catch (NoSuchElementException e) {
			System.out.println(state + "  state is not present in list plz eneter valid   state ");// if text doesn't
																									// match with state
		}
		try {
			Thread.sleep(5000);
			if (driver.findElement(By.xpath("//*[contains(text(),'" + district + "')]")).isDisplayed()) {// checking
																											// where
																											// sending
																											// text is
																											// matching
				Thread.sleep(5000);																					// with
																											// District
				driver.findElement(By.xpath("//*[contains(text(),'" + district + "')]")).click();// if match click on
																									// District
				System.out.println(" navigated to ---->District::" + district);// print District
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException e) {
			System.out.println(district + " District is not present in list plz eneter valid   District ");// if text
																								// doesn't
																											// match
																											// with
																										// District
		}

	}

	public static void MIS_Filter_Selection(String year, String Monsoon_or_NonMonsoon_or_Annual, String view,
			String Computation)// filterc without selecting category
			throws InterruptedException {
		if (Monsoon_or_NonMonsoon_or_Annual.equalsIgnoreCase("Monsoon")
				|| Monsoon_or_NonMonsoon_or_Annual.equalsIgnoreCase("Non-Monsoon")) {// checking monsoon or non-monsoon
			filter_dropdown_selection( year,  Monsoon_or_NonMonsoon_or_Annual, view, Computation); 

			driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[5]/button"))
					.click();// clicking on submit button without selecting category submit button position
								// will change based on category

			System.out.println("  Applied Filter ---->   year::" + year + "     Period::"
					+ Monsoon_or_NonMonsoon_or_Annual + "      view::" + view + "       Computation::" + Computation);// print
																														// statement
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-filter']")).click();// AFter applying filter click on filter
																				// button to hide filter
			try {
				if (driver
						.findElement(
								By.xpath("//*[contains(text(),'Annual Extractable Ground water Resource (ha.m)')]"))
						.isDisplayed()) {// if "Annual Extractable Ground water Resource (ha.m)" column is visible on
											// mis table then period selected is Annual in filter
					System.out.println("selected filter having period as " + Monsoon_or_NonMonsoon_or_Annual
							+ "   category will present");
					
				}
			} catch (NoSuchElementException e) {
				
				System.out.println("selected filter having period " + Monsoon_or_NonMonsoon_or_Annual
						+ "  category will not present");// else"Annual Extractable Ground water Resource (ha.m)" column
															// is not visible on mis table then period selected is
											// monsoon/non-monsoon in filter
			}
		} else if (Monsoon_or_NonMonsoon_or_Annual.equalsIgnoreCase("Annual")) {

			driver.findElement(By.xpath("//*[@class='fa fa-filter']")).click();// click on filter
			Thread.sleep(2000);
			filter_dropdown_selection( year,  Monsoon_or_NonMonsoon_or_Annual, view, Computation); 

			driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[7]/button"))
					.click();// clicking on submit button with selecting category
			// System.out.println("clicked on submit");
			System.out.println("  Applied Filter ---->   year::" + year + "     Period::"
					+ Monsoon_or_NonMonsoon_or_Annual + "      view::" + view + "       Computation::" + Computation);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='fa fa-filter']")).click(); // opening filter
			try {
				if (driver
						.findElement(
								By.xpath("//*[contains(text(),'Annual Extractable Ground water Resource (ha.m)')]"))
						.isDisplayed()) {// checkingAnnual Extractable groundwater resource column visible on mis table
											// or not
					System.out.println("selected filter having period as " + Monsoon_or_NonMonsoon_or_Annual
							+ "   category will present");
					
					
				}
			} catch (NoSuchElementException e) {
				System.out.println("selected filter having period " + Monsoon_or_NonMonsoon_or_Annual
						+ "  category will not present");
			}

		}

	}

	public static void MIS_Filter_Selection_to_get_Categorycount(String year, String Annual, String view, String Computation,
			String Category) throws InterruptedException {
		filter_dropdown_selection( year,  Annual, view, Computation); 

		try {
			Select s4 = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[6]/select")));
			s4.selectByVisibleText(Category);// selecting Category
		} catch (NoSuchElementException e) {
			System.out.println("trying to select " + Category + " Category type is not present in dropdown");
		}
		catch(ElementNotVisibleException e1) {
			System.out.println("trying to select " + Category + " Category type but for monsoon/non-monsoon category will not present");
		}
		try {
		driver.findElement(By.xpath(
				"html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[7]/button"))
				.click();// clicking on sbmit button
		}catch(ElementNotVisibleException e) {
			System.out.println("trying to click on submit button After trying to select category in monsoon/non-monsoon");
		}
		
		System.out.println(" applied Filter ---->    year::" + year + "     Period::" + Annual + "      view::" + view
				+ "     Computation::" + Computation + "        category::" + Category);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='fa fa-filter']")).click();// closing filter
		WebElement Category_count = driver
				.findElement(By.xpath("/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody"));// xpath
																													// of
																													// table
																													// body
																													// after
																													// applying
																													// filter
		List<WebElement> listOfRows = Category_count.findElements(By.tagName("tr"));// taking count of ASsement category
		if (listOfRows.size() != 0) {
			System.out.println(Category + "   count of Category::  " + listOfRows.size());
		} else {
			System.out.println(Category + "    count of Category::  0");
		}
		try {
			if (driver.findElement(By.xpath("//*[contains(text(),'Annual Extractable Ground water Resource (ha.m)')]"))
					.isDisplayed()) {
				System.out.println("selected filter having period as " + Annual + "   category will present");
			}
		} catch (NoSuchElementException e) {
			System.out.println("selected filter having period " + Annual + "  category will not present");
		}

	}

	public static void close() {
		driver.close();
	}

	public static void checking_expand_functionality() throws InterruptedException {

		int e[] = { 18, 11, 8, 6 };
		for (int i = 0; i < e.length; i++) {

			/*
			 * String expanded_column_name = driver.findElement(By.xpath(
			 * "/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/thead/tr[1]/th["
			 * + e[i] + "]")) .getText();//taking text of expanding column
			 * System.out.println("expanded column name ::" +
			 * expanded_column_name);//printing expandade column
			 */ Thread.sleep(3000);

			driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/thead/tr[1]/th[" + e[i] + "]"))
					.click();// expanding the columns

			Thread.sleep(3000);

		}

	}

	public static void checking_collapse_functionality() throws InterruptedException {

		int col[] = { 19, 12, 9, 7 };
		for (int i = 0; i < col.length; i++) {

			Thread.sleep(3000);
			/*
			 * String collapse_column_name = driver.findElement(By.xpath(
			 * "/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/thead/tr[1]/th["
			 * + col[i] + "]")) .getText();//taking text of collapsing column
			 * 
			 * System.out.println("collapsed column name ::" + collapse_column_name);
			 */
			driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/thead/tr[1]/th[" + col[i] + "]"))
					.click();// collapsing column

			Thread.sleep(3000);

		}

	}

	public static void Page_refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	public static void filter_dropdown_selection(String year, String Annual, String view, String Computation) throws InterruptedException {

		driver.findElement(By.xpath("//*[@class='fa fa-filter']")).click();// click on filter
		Thread.sleep(2000);
		try {
			Select s = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[1]/select")));
			s.selectByVisibleText(year);// selecting year
		} catch (NoSuchElementException e) {
			System.out.println("trying to select " + year + " year is not present in dropdown");
		}
		try {
			Select s1 = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[2]/select")));
			s1.selectByVisibleText(Annual);// selecting period
		} catch (NoSuchElementException e) {
			System.out.println("trying to select " + Annual + " period is not present in dropdown");
		}
		try {
			Select s2 = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[3]/select")));
			s2.selectByVisibleText(view);// selecting view
		} catch (NoSuchElementException e) {
			System.out.println("trying to select " + view + " view is not present in dropdown");
		
		}
		try {
			Select s3 = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[1]/div/div[4]/app-misfilter/div[2]/div/div[4]/select")));
			s3.selectByVisibleText(Computation);// Selecting computation type
		} catch (NoSuchElementException e) {
			System.out.println("trying to select " + Computation + " Computation type is not present in dropdown");
		}
	}
	public static void Alert_message(String x) throws InterruptedException {
		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("alert('"+x+"');");
		 // Thread.sleep(2000);
		  //driver.switchTo().alert().accept();
	}
}
