package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;áhbashbdadasdasdasdasdasdasdadsdss
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestWebDriver {

	@Test(priority = 2)
	public void TestInsert2() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-fullscreen"); // Mở trình duyệt ở chế độ toàn màn hình
	    WebDriver driver = new ChromeDriver(options);

	    String url = "http://localhost:8080/home/index";
	    driver.get(url);
	    Thread.sleep(2000); // Chờ 2 giây để trang web tải hoàn toàn

	    // Click vào link đăng nhập
	    driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[3]")).click();
	    Thread.sleep(2000); // Chờ 2 giây để trang đăng nhập tải

	    // Nhập email
	    WebElement id = driver.findElement(By.name("email"));
	    id.sendKeys("ducan11");
	    Thread.sleep(1000); // Chờ 1 giây sau khi nhập email

	    // Nhập mật khẩu
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("123");
	    Thread.sleep(1000); // Chờ 1 giây sau khi nhập mật khẩu

	    // Click nút đăng nhập
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/button")).click();
	    Thread.sleep(2000); // Chờ 2 giây sau khi click nút đăng nhập

	    // Kiểm tra URL sau khi đăng nhập
	    assertEquals("http://localhost:8080/home/index", driver.getCurrentUrl());
	}




	



}
