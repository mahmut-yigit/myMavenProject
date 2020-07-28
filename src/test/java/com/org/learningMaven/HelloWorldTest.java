package com.org.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test
	public void Login() {
		System.out.println("Logging into the application");
		WebDriver driver=new ChromeDriver();
			driver.get("http://google.com");
		}
		
		
	}


