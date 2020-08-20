package com.goibibo.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.goibibo.qa.utility.TestUtil;
import com.goibibo.qa.utility.WebEventListener;

public class basePage {
	public static WebDriver driver;
	public static Properties prop;
	public static com.goibibo.qa.utility.WebEventListener eventListener;
	public static EventFiringWebDriver eventdriver;
	public static String currrntDirectory;
	public static Scanner reader;

	public basePage() {
		currrntDirectory = System.getProperty("user.dir");
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(currrntDirectory + "\\src\\main\\resources\\config.properties");

			prop.load(file);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void initialazation() {

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", currrntDirectory + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("ff")) {
			System.setProperty("webdriver.gecho.driver", "");
			driver = new FirefoxDriver();

		}
		eventdriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eventdriver.register(eventListener);
		driver = eventdriver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
}
