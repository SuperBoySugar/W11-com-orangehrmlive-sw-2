package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {  //Extended Class

    String baseUrl = "https://opensource-demo.orangehrmlive.com/"; //WebPage url

    @Before
    public void setUp() {
        openBrowser(baseUrl); //Set up for open Browser
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //Verify the Forgot Password
        WebElement forgotYourPassword = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        forgotYourPassword.click();
        String expectedMessage = "Reset Password";
        WebElement actualTestElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Message display", expectedMessage, actualMessage);


        //driver.close();
    }
}