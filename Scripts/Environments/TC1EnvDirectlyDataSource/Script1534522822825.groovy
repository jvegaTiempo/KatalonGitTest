import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login')

excelData = findTestData("dataTest")

for (def rowNum = 1; rowNum <= excelData.getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('OrangeHRCRM/Page_/input_txtUsername'), excelData.getValue(1, rowNum))

    WebUI.setText(findTestObject('OrangeHRCRM/Page_/input_txtPassword'), excelData.getValue(2, rowNum))

    Thread.sleep(3000)
}

WebUI.click(findTestObject('OrangeHRCRM/Page_/Submit'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('OrangeHRCRM/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

