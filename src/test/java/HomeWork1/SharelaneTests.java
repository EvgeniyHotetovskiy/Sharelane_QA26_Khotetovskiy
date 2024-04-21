package HomeWork1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
public class SharelaneTests {
    @Test
    public void signUpPositiveTest (){
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.name("first_name")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();

    }
    @Test
    public void signUpPNegativeTest (){
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.name("first_name")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();

    }
    @Test
    public void signUpPNegativeTest2 (){
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.name("first_name")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
    @Test
    public void signUpPNegativeTest3 (){
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.name("first_name")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
    @Test
    public void signUpPNegativeTest4 (){
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345@");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
}