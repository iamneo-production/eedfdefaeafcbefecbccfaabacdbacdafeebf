package StepDefination;

import java.util.List;  
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.firefox.FirefoxDriver;   
import org.openqa.selenium.support.ui.Select;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;   

public class stepdef {
    WebDriver driver=null;
    @Given("^Navigates to JavaTpoint.com$")
    public void goToJavatPoint(){
        driver.get("https://www.javatpoint.com");
    }
    @When("^click on feedback$")
    public void getFeedBackPage(){
        driver.findElement(By.id("feedback")).click();
    }
    @When("^user submits feedback page$")
    public void submitFeedBack(){
        driver.findElement(By.id("submit")).click();
    }
    @Then("^Feedback should be received on the admin page$")
    public void msgOnAdmin(){
        if(driver.findElement(By.id("admin_page"))!=null){
            System.out.println("contains some text");
        }
    }
    @Then("^admin reply to user$")
    public void replyAdmin(){
        driver.findElement(By.id("write")).sendKeys("qwertyuiopasdfghjklzxcvbnm");
        driver.findElement(By.id("send")).click();
    }
}