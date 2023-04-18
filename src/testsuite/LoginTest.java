package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {  //Extended Class

    String baseUrl = "https://opensource-demo.orangehrmlive.com/"; //Webpage url

    @Before
    public void setUp(){   // Set Up for Open Browser
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Input the UserNameField
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys("Admin");
        //Input the PasswordField
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("admin123");
        //Check the Click Button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
        loginButton.click();

        //Verify the Actual Message
        String expectedMessage = "Dashboard";
          WebElement actualTestElement = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']"));
       String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Message display", expectedMessage, actualMessage);
    }



    }



