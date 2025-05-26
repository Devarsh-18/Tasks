 package test_script.test_script;
import org.testng.Assert;
import java.time.Duration;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task_admin {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement id = driver.findElement(By.name("username"));
        id.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin123");
        WebElement login = driver.findElement(By.xpath("//button[normalize-space(.) = 'Login']"));
        login.click();        
        
        WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
        admin.click();
        WebElement add = driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']"));
        add.click();

        WebElement cancel = driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--ghost']"));
        cancel.click();
        WebElement add2 = driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']"));
        add2.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
        driver.findElement(By.xpath("//div[@role='option']//span[normalize-space(.)='Admin']")).click();
        Thread.sleep(2000);

      WebElement hint =  driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])/input"));

 hint.sendKeys("a");
Actions actions = new Actions(driver);
actions.pause(Duration.ofSeconds(1))  
    .sendKeys(Keys.ARROW_DOWN)     
    .pause(Duration.ofSeconds(1)).sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(1)).sendKeys(Keys.DOWN).pause(Duration.ofSeconds(1))
    .sendKeys(Keys.ENTER)          
    .build().perform();
        
        
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
        driver.findElement(By.xpath("//div[@role='option']//span[normalize-space(.)='Enabled']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='password' and @autocomplete='off'])[1]")).sendKeys("okkkkk0kk");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@type='password' and @autocomplete='off'])[2]")).sendKeys("okkkkk0kk");
        
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

        WebElement elem = fluentWait.until(drv -> 
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"))
        );
        
        elem.sendKeys("MQAAAAAa");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--ghost']")).click();
        //driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--ghost']")).click();
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("MQAAAAa");
       driver.findElement(By.xpath("//div[@class= 'oxd-select-text-input']")).click();
       driver.findElement(By.xpath("//div[@role='option']//span[normalize-space(.)='Admin']")).click();
       Thread.sleep(2000);
      // driver.findElement(By.xpath("//div[@class= 'oxd-select-wrapper']")).click();
       
       WebElement emp = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
       emp.sendKeys("a");
       //Actions actions2 = new Actions(driver);
       actions.pause(Duration.ofSeconds(1))  
           .sendKeys(Keys.ARROW_DOWN)     
           .pause(Duration.ofSeconds(1)).sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(1)).sendKeys(Keys.DOWN).pause(Duration.ofSeconds(1))
           .sendKeys(Keys.ENTER)          
           .build().perform();
       
       
       
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@role='option']//span[normalize-space(.)='Enabled']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
       Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label/span/i")).click();
           
           WebElement delete = driver.findElement(By.xpath("//button[@class = 'oxd-icon-button oxd-table-cell-action-space']"));
           delete.click();
           WebElement confirm = driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']"));
           confirm.click();
           
    }
}