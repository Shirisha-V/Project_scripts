package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1_project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet296\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.urbanladder.com/");
		Thread.sleep(5000L);
		Actions at= new Actions(d);
		at.moveToElement(d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]"))).build().perform();
		Thread.sleep(2000L);
d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[1]/ul/li[1]/a")).click();
Thread.sleep(5000L);
d.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click(); //close the popup
d.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[2]/div/a[1]")).click();//click on image
d.findElement(By.xpath("//*[@id=\"product-overview\"]/ul/li[2]/div/img")).click();//change color to grey
Thread.sleep(2000L);
d.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();// add to cart
	}

}
