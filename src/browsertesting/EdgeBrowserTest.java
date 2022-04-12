package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;


public class EdgeBrowserTest {

    public static void main(String[] args) {

            String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            // Launch the URL.
            driver.get(baseUrl);
            // Maximise Window
            driver.manage().window().maximize();
            // We give implicit time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // Get the title of the page
            String title = driver.getTitle();
            System.out.println(title);

            // Get Current URL
            System.out.println("Current URL = " +driver.getCurrentUrl());


            //String loginUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F\n";

          //  driver.navigate().to(loginUrl);
         //   System.out.println("Current URL = " +driver.getCurrentUrl());

            // Find the email field element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Sending email to email field element
            emailField.sendKeys("prime123@gmail.com");

            //Find the password field element
            WebElement passwordField =driver.findElement(By.name("Password"));
            // Sending password to password field element
            passwordField.sendKeys("prime123");


            // Close the browser
          //  driver.close();

        }
    }
