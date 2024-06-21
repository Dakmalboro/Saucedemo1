import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class  SauceTest {
    @Test
    public void Test(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("user-name")).sendKeys("121212");
        browser.findElement(By.name("password")).sendKeys("212");
        browser.findElement(By.cssSelector("[type=submit]")).click();
        String error = browser.findElement(By.cssSelector("[class=\"error-message-container error\"]")).getText();
        assertEquals(error,"Epic sadface: Username and password do not match any user in this service");
        browser.quit();}
    @Test
    public void Test1 (){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("user-name")).sendKeys("");
        browser.findElement(By.name("password")).sendKeys("");
        browser.findElement(By.cssSelector("[type=submit]")).click();
        String error = browser.findElement(By.cssSelector("[class=\"error-message-container error\"]")).getText();
        assertEquals(error,"Epic sadface: Username is required");
        browser.quit();

    }
    @Test
    public void Test2 () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.cssSelector("[type=submit]")).click();
        boolean isPresent = browser.findElement(By.cssSelector("[class=title]")).isDisplayed();
        assertTrue(isPresent, "The register is not displayed");
        browser.quit();



        browser.quit();
    }}

