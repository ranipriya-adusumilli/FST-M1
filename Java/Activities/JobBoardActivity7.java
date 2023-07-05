import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobBoardActivity7 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();
        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("rani4@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("softwarerani1");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")).sendKeys("Job details");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("rani4@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("ibm");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/form[1]/p[1]/input[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("job_preview_submit_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("softwarerani1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();
        Thread.sleep(2000);
        driver.close();

    }

}
