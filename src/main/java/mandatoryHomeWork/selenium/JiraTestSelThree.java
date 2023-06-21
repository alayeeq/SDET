package mandatoryHomeWork.selenium;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraTestSelThree {
	@Test
	public void Test1() throws InterruptedException {
	
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\SDET Training\\Code\\com.seleniumprojone\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jira.atlassian.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login-link']")).click();
		//div[text()='Jira Software']
		
		driver.findElement(By.name("username")).sendKeys("asiflayeeq@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.name("password")).sendKeys("Zoyak786@");
		
		
		//driver.findElement(By.xpath("//*[@id=\"ak-jira-navigation\"]/header/div/a/div/button/span/span")).click();
		
		
	    String[] names = {"Pradeep","Krishna","Asif"};

        Random random = new Random();

        int ranInd = random.nextInt(names.length);

        String name = names[ranInd];
		
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		driver.findElement(By.xpath("//*[text()='Jira Software']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Projects'])[1]")).click();
		//driver.findElement(By.id("createGlobalItem")).click();
		
		driver.findElement(By.xpath("//span[text()='SDET2 (SDT)']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Projects'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='View all projects'])")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[1]/div/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/span")).click();
		
        driver.findElement(By.id("keyword")).sendKeys("invalid");
        driver.findElement(By.xpath("//h4[text()='No projects were found that match your search']"));

        driver.findElement(By.xpath("//*[@id=\"ak-main-content\"]/div/div[3]/div[1]/div/div/div/div/button/span/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("keyword")).sendKeys("SDE");
        driver.findElement(By.xpath("(//span[text()='SDET2'])")).click();

        String numIssues = driver.findElement(By.xpath("(//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span")).getText();
        System.out.println(numIssues);

        ((JavascriptExecutor) driver).executeScript("window.open()");

        Thread.sleep(2000);
// Switch to the new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        //
        driver.navigate().to("https://pradeep1331.atlassian.net/jira/software/projects/PT/boards/1");
        Thread.sleep(2000);
          WebDriverWait wait = new WebDriverWait(driver, 10);//(driver, Duration.ofSeconds(10));
        // Wait until a specific element is visible
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createGlobalItem")));
        driver.findElement(By.id("createGlobalItem")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='issue-create.ui.modal.create-form.type-picker.issue-type-select']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Task']")).click();
        driver.findElement(By.id("summary-field")).sendKeys("Test Summary");
        //Scroll
        WebElement ele = driver.findElement(By.id("assignee-field-label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        //assignee
        driver.findElement(By.xpath("//label[@id='assignee-field-label']/following::div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(  "//span[text()='"+name+"']")).click();
        driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        String numIssues2 = driver.findElement(By.xpath("(//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span")).getText();

        System.out.println(numIssues2);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        // Wait until a specific element is visible
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("createGlobalItem")));
        driver.findElement(By.id("createGlobalItem")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='issue-create.ui.modal.create-form.type-picker.issue-type-select']")).click();
        driver.findElement(By.xpath("//div[text()='Bug']")).click();

        driver.findElement(By.id("summary-field")).sendKeys("Test BUG");
        driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
        Thread.sleep(2000);
        WebElement ele1 = driver.findElement(By.xpath("(//span[text()='Test BUG'])"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[text()='Test BUG'])")).click();
        driver.findElement(By.xpath("(//span[text()='To Do'])")).click();
        driver.findElement(By.xpath("(//span[text()='Done'])")).click();

        driver.findElement(By.xpath("//div[@id='jira-issue-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]")).click();
        String BugCount = driver.findElement(By.xpath("((//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span)[2]")).getText();
        System.out.println(BugCount);
        driver.quit();
        // Find the source element
//        By source = By.tagName("i");
//        driver.findElement(source);
//
//        // Find the element relative to the source element
//        By target = RelativeLocator.with(source).toRightOf(By.xpath("//span[text()='Japan']"));
//        String targetClass = driver.findElement(target).getAttribute("class");
//        System.out.println("Target element class: " + targetClass);
		
		
	}

}
