import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OrangeHRCRM/Page_/input_txtUsername'), GlobalVariable.User)

WebUI.setText(findTestObject('OrangeHRCRM/Page_/input_txtPassword'), GlobalVariable.Password)

WebUI.click(findTestObject('OrangeHRCRM/Page_/Submit'))

