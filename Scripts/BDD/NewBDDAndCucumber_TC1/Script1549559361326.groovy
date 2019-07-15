import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')
WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_UserName'), 'admin')
WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_Password'), 'admin')
WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Login_Login'))
WebUI.switchToWindowUrl('http://executeautomation.com/demosite/index.html?UserName=admin&Password=admin&Login=Login')

WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/td_SelectMr.Ms.'))

WebUI.waitForElementVisible(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/select_SelectMr.Ms.'), 
    5)

WebUI.selectOptionByValue(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/select_SelectMr.Ms.'), 
    '2', true)

WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/select_SelectMr.Ms.'), 
    '2', false, 2)

WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Initial_Initial'), 
    'JAVE')

WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input__FirstName'), 'Jessica')

WebUI.setText(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_Middle Name_MiddleName'), 
    'Vega')

WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_MaleFemale_Female'))

WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_EnglishHindi_english'))

WebUI.click(findTestObject('Object Repository/executeAutomationDemoSite/Page_Execute Automation/input_EnglishHindi_Save'))

