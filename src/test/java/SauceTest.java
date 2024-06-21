import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SauceTest {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("user-name")).sendKeys("121212");
        browser.findElement(By.name("password")).sendKeys("212");
        browser.findElement(By.cssSelector("[type=submit]")).click();
        String error = browser.findElement(By.cssSelector("[class=\"error-message-container error\"]")).getText();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        browser.quit();
    }

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("user-name")).sendKeys("");
        browser.findElement(By.name("password")).sendKeys("");
        browser.findElement(By.cssSelector("[type=submit]")).click();
        String error = browser.findElement(By.cssSelector(".error-message-container.error")).getText();
        assertEquals(error, "Epic sadface: Username is required");
        browser.quit();

    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.cssSelector("[type=submit]")).click();
        boolean isPresent = browser.findElement(By.cssSelector("[class=title]")).isDisplayed();
        assertTrue(isPresent, "The register is not displayed");
        browser.quit();
    }
    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.id("root"));
        browser.findElement(By.name("password"));
        browser.findElement(By.className("login_logo"));
        browser.findElement(By.xpath("//input[@id='login-button']"));
        browser.findElement(By.xpath("// h4[text()='Accepted usernames are:']"));
        browser.findElement(By.xpath("//div[contains(@class,'login_container')]"));
        browser.findElement(By.xpath("//h4[contains(text(),'Password for all users:')]"));
        browser.findElement(By.xpath("//*[@class='login-box']/ancestor::div[1]"));
        browser.findElement(By.xpath("//input[@class='input_error form_input']/following::input[2]"));
        browser.findElement(By.xpath("//*[@class='form_group']/child::input[@placeholder='Username']"));
        browser.findElement(By.xpath("//*[@class='form_group']/child::input[@placeholder='Username']"));
        browser.findElement(By.xpath("//*[@class='login-box']/parent::*"));
        browser.findElement(By.xpath("//*[@class='login-box']/preceding::*[@type]"));
        browser.findElement(By.xpath("//input[@class='input_error form_input' and @type='text']"));

        browser.findElement(By.cssSelector(".btn_action"));
        browser.findElement(By.cssSelector(".submit-button.btn_action"));
        browser.findElement(By.cssSelector("#root"));
        browser.findElement(By.cssSelector("[type='text']"));
        browser.findElement(By.cssSelector("[class|='login']"));
        browser.findElement(By.cssSelector("[name~='theme-color']"));





        browser.quit();
    }
}
