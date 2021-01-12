package com.sai.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(cap);
		
		String hubURL = "http://192.168.1.17:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubURL),cap);
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
