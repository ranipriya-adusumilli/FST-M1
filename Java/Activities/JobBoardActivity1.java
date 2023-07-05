import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobBoardActivity1 {
    public static void main(String args[]) throws InterruptedException
    {
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver = new FirefoxDriver();
       driver.get("https://alchemy.hguy.co/jobs/");
       String gettitle = driver.getTitle();
       System.out.println(gettitle);
       String actualtext = "Alchemy Jobs – Job Board Application";
       if (actualtext.equals(gettitle))
       {
           driver.close();
       }

    }
}
