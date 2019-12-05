package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {

	
	private WebDriver oDriver;
	
	public void waitforProgress(WebDriver oDriver,int timeout)
	{
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver oDriver)
	    	{
	    	  return oDriver.findElement(By.className("app-progress-bar")).getAttribute("style").equalsIgnoreCase("display: none;");
	    	}
	    };
	    WebDriverWait oWait=new WebDriverWait(oDriver, timeout);
		oWait.until(pageLoadCondition);
	}
	 
}
