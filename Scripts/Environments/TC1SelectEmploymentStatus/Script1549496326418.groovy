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

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/span_Recruitment (1)'))

WebUI.waitForElementClickable(findTestObject('OrangeHRCRM/Page_OrangeHRM/select_MethodOfApplication'), 5)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('OrangeHRCRM/Page_OrangeHRM/select_MethodOfApplication'), '1', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('OrangeHRCRM/Page_OrangeHRM/select_JanFebMarAprMayJunJulAu'), '0', true)

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/a_1'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/a_31'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/div_DateOfApplication'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/input_To_btnSrch'))

