import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/span_Recruitment'))

WebUI.waitForElementPresent(findTestObject('OrangeHRCRM/Page_/input_txtPassword'), 25, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyTextPresent('test12345', false)
WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/a_Logout'))

