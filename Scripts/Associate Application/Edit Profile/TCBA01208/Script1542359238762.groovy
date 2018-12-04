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

FirstName = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtFirstName'), 'value')

WebUI.verifyMatch('Shinto-QA', FirstName, false)

LastName = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtLastName'), 'value')

WebUI.verifyMatch('Test', LastName, false)

Month = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Month'), 'value')

WebUI.verifyMatch('05', Month, false)

Day = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Day                  01'), 'value')

WebUI.verifyMatch('05', Day, false)

Year = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Year                  2'), 'value')

WebUI.verifyMatch('1990', Year, false)

MaritialStatus = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 'value')

WebUI.verifyMatch('Married', MaritialStatus, false)

Country = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 'value')

WebUI.verifyMatch('Italy', Country, false)

BirthState = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Select Birth State'), 'value')

WebUI.verifyMatch('Alessandria', BirthState, false)

BirthCity = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Select Birth City'), 'value')

WebUI.verifyMatch('Alessandria', BirthCity, false)

Citizenship = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/select_Select Citizenship'), 'value')

WebUI.verifyMatch('Italy', Citizenship, false)

PersonalTaxNum = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtPersonalTaxNum'), 'value')

WebUI.verifyMatch('TSTTST83R46A271B', PersonalTaxNum, false)

HouseNumber = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtStreetNum'), 'value')

WebUI.verifyMatch('Number1', HouseNumber, false)

StreetName = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtStreetName'), 'value')

WebUI.verifyMatch('Street', StreetName, false)

Type = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtStreetPart'), 'value')

WebUI.verifyMatch('ST', Type, false)

City = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtCity'), 'value')

WebUI.verifyMatch('City', City, false)

State = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtStateCode'), 'value')

WebUI.verifyMatch('State', State, false)

Zip = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtZip'), 'value')

WebUI.verifyMatch('57899', Zip, false)

HomePhone = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtLandPhone'), 'value')

WebUI.verifyMatch('32323232', HomePhone, false)

MobileNumber = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), 'value')

WebUI.verifyMatch('3323232323', MobileNumber, false)

RoutingNumber = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), 'value')

WebUI.verifyMatch('323232328', RoutingNumber, false)

IBAN = WebUI.getAttribute(findTestObject('Edit Profile/Page_Profile  5-15/input_txtBankAccountKey'), 'value')

WebUI.verifyMatch('NL70ABNA0434144140', IBAN, false)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Edit Profile/Page_Profile  5-15/Cancel_buttonEdit'), 'Cancel')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Cancel_buttonEdit'))

