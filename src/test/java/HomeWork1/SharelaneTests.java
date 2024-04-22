package HomeWork1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;

public class SharelaneTests {
    @Test
    public void signUpPositiveTest1() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("last_name")).sendKeys("Test");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=confirmation_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
    @Test
    public void signUpPositiveTest2() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=confirmation_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }

    @Test
    public void signUpPNegativeTest1() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();

    }

    @Test
    public void signUpPNegativeTest2() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345№");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }

    @Test
    public void signUpPNegativeTest3() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }

    @Test
    public void signUpPNegativeTest4() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }

    @Test
    public void signUpPNegativeTest5() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1mailru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }

    @Test
    public void signUpPNegativeTest6() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("2222");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
    @Test
    public void signUpPNegativeTest7() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
    @Test
    public void signUpPNegativeTest8() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
    @Test
    public void signUpPNegativeTest9() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1№;№%@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        boolean isFirstNameDisplayed = driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed();
        Assert.assertTrue(isFirstNameDisplayed);
        driver.quit();
    }
}