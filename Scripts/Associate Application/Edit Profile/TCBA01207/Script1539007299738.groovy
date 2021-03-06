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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtFirstName'), '')

//String Firstname = 'Shinto-QA'
WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtFirstName'), 'Shinto-QA')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLastName'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLastName'), 'Test')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Month'), 'Month', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Day                  01'), 
    'Day', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Year                  2'), 
    'Year', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Month'), '05', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Day                  01'), 
    '05', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Year                  2'), 
    '1990', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 
    'Select Marital Status', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 
    'Married', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 
    'Select Birth Country', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 
    'Italy', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth State'), 
    'Alessandria', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth City'), 
    'Alessandria', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Citizenship'), 
    'Italy', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtPersonalTaxNum'), 'TSTTST83R46A271B')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetNum'), 'Number1')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetName'), 'Street')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetPart'), 'ST')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtCity'), 'City')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStateCode'), 'State')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtZip'), '57899')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), '32323232')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), '3323232323')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '323232328')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtBankAccountKey'), 'NL70ABNA0434144140')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'), 'Save')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit'))

