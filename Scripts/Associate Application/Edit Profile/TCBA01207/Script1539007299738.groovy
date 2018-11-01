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

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtFirstName'), 'Shinto-QA')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLastName'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLastName'), 'Test')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Month'), 'Month', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Day                  01'), 
    'Day', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Year                  2'), 
    'Year', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Month'), '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Day                  01'), 
    '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Year                  2'), 
    '1990', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 
    'Select Marital Status', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 
    'Married', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 
    'Select Birth Country', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 
    'Italy', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth State'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth City'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Citizenship'), 
    'Italy', true)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtPersonalTaxNum'), '59098')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetNum'), 'House Number')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetName'), 'Street')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetPart'), 'ST')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtCity'), 'City')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStateCode'), 'State')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtZip'), '57899')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), '32323232')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), '3323232323')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '323232328')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtBankAccountKey'), 'NL70ABNA0434144140')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Cancel'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_My Title'), 'My Title:')

