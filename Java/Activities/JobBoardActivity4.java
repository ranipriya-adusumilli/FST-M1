import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobBoardActivity4 {


    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        Thread.sleep(5000);
        WebElement heading2 = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]"));
        System.out.println(heading2.getText());
        String actualtext = "Quia quis non";
        if (actualtext.equals(heading2.getText())) {
            driver.close();
        }
    }
}
