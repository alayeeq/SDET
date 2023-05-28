package com.jira;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassScenario {

	
	@Test	public void Test1() {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://sif123.atlassian.net/jira/dashboards/10000");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"ak-jira-navigation\"]/header/div/a/div/button/span/span")).click();
	
	
	
	}		
	
}
