package HomeWork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;

public class SharelaneTests {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void signUpPositiveTestAllForms() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("last_name")).sendKeys("Test");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=confirmation_message]")).isDisplayed());
    }

    @Test
    public void signUpPositiveTestOnlyRequired() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=confirmation_message]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestZipEmpty() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestZipSpecialCharacters() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345№");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestZipLowDigits() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value=Continue]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestFirstNameEmpty() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestUncorrectEmail() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1mailru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestUncorrectComfirmPass() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("2222");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestPassEmpty() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed());
    }

    @Test
    public void signUpNegativeTestPassAndConfirmEmpty() {
        driver.navigate().to("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("Evgeniy");
        driver.findElement(By.name("email")).sendKeys("1@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("span[class=error_message]")).isDisplayed());
    }
}