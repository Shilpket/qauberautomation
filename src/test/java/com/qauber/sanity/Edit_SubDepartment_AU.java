import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by San Jose on 12/13/2016.
 */
public class Edit_SubDepartment_AU {

    @Test
    public void SAU() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testwave.qabidder.net/#/page/login");
        Thread.sleep(5000);
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]"));
        searchField.clear();
        searchField.sendKeys("user1@mailinator.com");
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]"));
        Password.sendKeys("password");
        WebElement Login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        Login.click();
        Thread.sleep(5000);
        WebElement Entities = driver.findElement(By.xpath("//span[contains(.,'Entities')]"));
        Entities.click();
        Thread.sleep(5000);
        WebElement Editorgan = driver.findElement(By.xpath("html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[1]/a"));
        Editorgan.click();
        Thread.sleep(5000);
        WebElement EditDep = driver.findElement(By.xpath("html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[1]/a"));
        EditDep.click();
        Thread.sleep(5000);
        WebElement EditDep1 = driver.findElement(By.xpath("html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[2]/button[2]"));
        EditDep1.click();
        WebElement NameDep = driver.findElement(By.xpath("//input[contains(@required,'required')]"));
        NameDep.clear();
        NameDep.sendKeys("Second_11 Department");
        WebElement Update = driver.findElement(By.xpath("//button[contains(@ng-disabled,'error.required')]"));
        Update.click();








    }
}
