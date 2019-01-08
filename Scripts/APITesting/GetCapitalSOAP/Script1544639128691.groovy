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

//First, call endpoint 'ListCountries' and save its response into response variable
response = WS.sendRequest(findTestObject('SOAP_CountryInfoService/ListCountries'))

//Save response in 'xml1' variable.
String xml1 = response.responseBodyContent

//Parsing xml1 variable
def dataValue = new XmlSlurper().parseText(xml1)

//Get from response the first value that will be 'IN'
def countryCode = dataValue.ListOfCountryNamesByNameResult.tCountryCodeAndName[0].sISOCode.text()

println('The extracted country code is: ' + countryCode)

//Assign countryCode value to global variable 'countryISOCode'
GlobalVariable.countryISOCode = countryCode

//Next, call endpoint 'GetCapital' this instruction 'sendRequestAndVerify' 
//considers the verification point added into the GetCapital object. That it was: 
//'WS.verifyElementText(response, 'CapitalCityResponse.CapitalCityResult', 'Tirana')
WS.sendRequestAndVerify(findTestObject('SOAP_CountryInfoService/GetCapital'))

