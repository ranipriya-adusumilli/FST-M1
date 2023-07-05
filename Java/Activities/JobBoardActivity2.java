import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobBoardActivity2 {

    public static void main(String args[]) throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        Thread.sleep(5000);
        WebElement heading = driver.findElement(By.xpath("//h1[text()='Welcome to Alchemy Jobs']"));
       System.out.println(heading.getText());
        String actualtext = "Welcome to Alchemy Jobs";
        if (actualtext.equals(heading.getText()))
     {
           driver.close();
     }

    }
}
