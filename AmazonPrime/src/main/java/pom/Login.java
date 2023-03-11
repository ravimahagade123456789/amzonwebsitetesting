package pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")WebElement SearchBox;
	@FindBy(xpath="//input[@type=\"submit\"]") WebElement SearchIcon;
	
	
	public void searchBox(String a) throws InterruptedException {
		SearchBox.sendKeys(a);
		Thread.sleep(3000);
		SearchIcon.click();
	}
	
	
	
	
	
	
}
