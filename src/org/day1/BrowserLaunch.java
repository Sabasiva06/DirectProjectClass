package org.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vels\\Music\\SeleniumAug10amBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tableCotent = driver.findElement(By.id("customers"));
		List<WebElement> rows = tableCotent.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {

			WebElement row = rows.get(i);

			List<WebElement> tableData = row.findElements(By.tagName("td"));

			for (int j = 0; j < tableData.size(); j++) {

				String text = tableData.get(j).getText();

				if (text.equals("Austria")) {
					System.out.println(text);
				}
			}
		}
		System.out.println("day1");
		System.out.println("Selnium");
		System.out.println("hii");
		System.out.println("Ausstria");
		System.out.println("Asia");
		System.out.println("India");
		System.out.println("America");
		System.out.println("Helloow");
		System.out.println("Hellow");
		System.out.println("summa");
		System.out.println("summa");


	}

}
