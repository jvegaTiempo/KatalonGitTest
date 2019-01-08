import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login')

WebUI.setText(findTestObject('OrangeHRCRM/Page_/input_txtUsername'), User)

WebUI.setText(findTestObject('OrangeHRCRM/Page_/input_txtPassword'), Password)

WebUI.click(findTestObject('OrangeHRCRM/Page_/Submit'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

