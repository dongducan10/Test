package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test1 {

    @Test(priority = 2)
    public void TestInsert2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
               WebDriver driver = new ChromeDriver(options);

        String url = "https://vnexpress.net/";
        String title_expected = "Tin tức mới nhất 24h qua - VnExpress";  
        driver.get(url);
     

        String title_website = driver.getTitle();  

       
        if (title_website.contentEquals(title_expected)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }

        driver.close();
    }
}
