package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WDWait {
	
	public WebDriver oDriver;
	public static void main(String[] args) {
		
	}
	
	public boolean waitTill(ExpectedCondition<WebElement> condition,int timeout)
    {
   	 try
   	 {
   		 if(timeout>0)
   		 {
   			 WebDriverWait wait=new WebDriverWait(oDriver, timeout);
   			 wait.until(condition);
   			 Reporter.log("Waited for "+timeout+"Seconds");
   			 return true;
   		 }
   		 else
   		 {
   			 System.out.println("No timeout mentioned");
   			 Reporter.log("No timeout mentioned");
   			 return false;
   		 }
   	 }
        catch(Exception e)
   	 {
          System.out.println(e.toString());
          Reporter.log("An issue with waiting for an element to visible");
		  return false;
   	}
   }

}
