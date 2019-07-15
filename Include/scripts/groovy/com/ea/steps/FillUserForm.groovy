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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class FillUserForm {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to the User Form page")
	def navigateToUserForm() {
		//WebUI.switchToWindowTitle("Execute Automation")
		//WebUI.switchToWindowUrl('http://executeautomation.com/demosite/index.html?UserName=admin&Password=admin&Login=Login')
	}

	@When("I select a Title")
	def selectTitle() {
		WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/td_SelectMr.Ms.'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/select_SelectMr.Ms.'), 5)
		WebUI.selectOptionByValue(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/select_SelectMr.Ms.'),
				'2', true)
		WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/select_SelectMr.Ms.'),
				'2', false, 2)
	}

	@When("I type Initial and First Name and Middle Name")
	def typeNames() {
		WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Initial_Initial'),
				'JAVE')
		WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input__FirstName'), 'Jessica')
		WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Middle Name_MiddleName'),
				'Vega')
	}

	@When("I select a Gender")
	def selectGender() {
		WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_MaleFemale_Female'))
	}

	@When("I select Languages Known")
	def selectLanguage() {
		WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_EnglishHindi_english'))
	}

	@Then("I click Save button")
	def clickSave() {
		WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_EnglishHindi_Save'))
	}
}