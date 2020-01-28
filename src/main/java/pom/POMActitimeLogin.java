package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class POMActitimeLogin implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public POMActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 1));
		loginButton.click();
	}
}