package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_project3 {
     public static void main(String[] args) throws InterruptedException {
		// how to add to wish list for a registered customer
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet296\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.urbanladder.com/");
		Thread.sleep(5000L);
		Actions at= new Actions(d);
		at.moveToElement(d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[7]"))).build().perform();
		Thread.sleep(2000L);
		d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[7]/div/div/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(5000L);
		d.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click(); //close the popup
		Thread.sleep(2000L);
		at.moveToElement(d.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/a"))).build().perform();//moving cursor to image
		Thread.sleep(1000L);
		d.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/div[6]/span[1]")).click();//click on add to wishlist
		
		Thread.sleep(4000L);
		at.moveToElement(d.findElement(By.xpath("//*[@placeholder='Email Address']"))).click().sendKeys("varthya1@gmail.com").build().perform();
		//d.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).click();
		//d.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).sendKeys("varthya1@gmail.com");
		Thread.sleep(2000L);
		d.findElement(By.xpath("//*[@placeholder='Password']")).click();
		d.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("west@1234");
		d.findElement(By.cssSelector("input#ul_site_login.button.primary")).click();
		

		

	}

}
