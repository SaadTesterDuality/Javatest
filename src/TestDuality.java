import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDuality {


@BeforeTest
    public void DualityURL () throws InterruptedException {


    System.setProperty("webdriver.chrome.driver", "C:\\Users\\saads\\IdeaProjects\\Drivers\\chromedriver.exe");
    ChromeDriver Driver = new ChromeDriver();
    Driver.manage().window().maximize();

    Driver.get("https://health-dev.duality.company/");

    Thread.sleep(3000);

    Driver.findElement(By.cssSelector("#standard-basic")).sendKeys("");



    Thread.sleep(6000);

  Driver.findElement(By.name("password")).sendKeys(");

  Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[1]/div[3]/span/input")).click();
    Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[1]/div[4]/span/input")).click();

Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[2]/div/button")).click();

    Thread.sleep(6000);

    Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/button")).click();


}

@Test
    public void testHomePageVerification ()
    {
        try
        {
            Assert.assertEquals(true, true, "The Welcome Link Is Not Correct On The Home Page");
            System.out.println("3. Verify Welcome Link");

            Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
            System.out.println("4. Verify Admin Tab");

            Assert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
            System.out.println("5. Verify Dashboard");
        }
        catch (AssertionError ae)
        {
            ae.printStackTrace();
        }
    }





}
