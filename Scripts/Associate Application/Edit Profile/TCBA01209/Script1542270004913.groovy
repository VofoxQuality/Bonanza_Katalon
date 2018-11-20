import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.testng.Assert as Assert
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Home  5-15/a_Shinto-Test'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit'), 'Edit')

Firstname = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtFirstName'), 
    'readonly', 0)

Lastname = WebUI.verifyElementHasAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtLastName'), 'readonly', 
    0)

Month = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Month'), 
    'disabled', 0)

Day = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Day                  01'), 
    'disabled', 0)

Year = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Year                  2'), 
    'disabled', 0)

MaritialStatus = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 
    'disabled', 0)

BirthCountry = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 
    'disabled', 0)

BirthState = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth State'), 
    'disabled', 0)

BirthCity = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth City'), 
    'disabled', 0)

Citizenship = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Citizenship'), 
    'disabled', 0)

PersonalTaxNum = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtPersonalTaxNum'), 
    'readonly', 0)

StreetNum = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetNum'), 
    'readonly', 0)

StreetName = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetName'), 
    'readonly', 0)

StreetPart = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetPart'), 
    'readonly', 0)

City = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtCity'), 
    'readonly', 0)

StateCode = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStateCode'), 
    'readonly', 0)

Zip = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtZip'), 
    'readonly', 0)

LandPhone = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), 
    'readonly', 0)

Mobilephone = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), 
    'readonly', 0)

RoutingNum = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), 
    'readonly', 0)

IBAN = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtBankAccountKey'), 
    'readonly', 0)

