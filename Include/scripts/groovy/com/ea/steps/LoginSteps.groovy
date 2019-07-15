package com.ea.steps
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.TypeRegistryConfigurer
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import gherkin.ast.DataTable
//Import these classes to use XStream class
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableCellTransformer;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.TableRowTransformer;
import io.cucumber.datatable.TableTransformer;



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to the login page")
	def navigateToLoginPage() {
		//println("Navigate to Login")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')
	}

	@When('I enter the username as "(.*)" and password as "(.*)"')
	def enterUsernameAndPassword(String username, String password) {
		//println("Username" + userName + "Password" + password)
		WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_UserName'),
				username)
		WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_Password'),
				password)
	}

	@And("I enter the following for Login")
	def enterLoginUsingTables(io.cucumber.datatable.DataTable table){
		//To use a List without class User:
		//List<Map<String, String>> data = table.asMaps(String.class, String.class);
		//WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_UserName'),
		//	data[0].username)
		//WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_Password'),
		//	data[0].password)

		//To use class User create an ArrayList:
		List<User> users = new ArrayList<User>();
		//Store all the users
		users = table.asList(User.class);
		for (User user: users){
			WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_UserName'),
					user.username)
			WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_Password'),
					user.password)
		}
	}

	@When("I click the login button")
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_Login'))
	}

	@Then("I should see the home page")
	def homePage() {
		println("Landing page: Home Page")
		//Assertions has been done
	}
}

class User{
	public String username;
	public String password;

	public User(String userName, String passWord){
		username = userName;
		password = passWord;

	}
}

//We need to add an XStream class in order to convert List<User> into an ArrayList<User>
class Configurer implements TypeRegistryConfigurer {

	@Override
	public void configureTypeRegistry(TypeRegistry registry) {

		registry.defineDataTableType(new DataTableType(User.class, new TableEntryTransformer<User>() {
					@Override
					public User transform(Map<String, String> entry){
						return new User(entry.get("username"), entry.get("password"));
					}
				}));
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}
}