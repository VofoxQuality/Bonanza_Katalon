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

WebUI.verifyElementText(findTestObject('Object Repository/Customer Gas Account/Page_Home  5-15/span_Add Customer'), 'Add Customer')

WebUI.click(findTestObject('Customer Gas Account/Page_Home  5-15/span_Add Customer'))

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_facilityType'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/span_Business'), 
    'Business')

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/span_Business'))

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_CustName'), 'Qa_Account')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_United States Of Americ'), 
    'United States Of America', true)

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_firstName'), 'shinto')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_lastName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_title'), 'Qa-Title')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_streetNum'), 'Street no2')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_Address'), 'Add')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_streetPart'), 'Part1')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_city'), 'City1')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_stateCode'), 'Province')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_zip'), '23456')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_email'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_email2'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_phone'), '123456789')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_phoneExtension'), '123456789')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_cellPhone'), '2121222222')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_phone2'), '2222333333')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Month'), 
    '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Day                  01'), 
    '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Year                  2'), 
    '1990', true)

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_txtIBAN'), 'NL70ABNA0434144140')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/textarea_form-control au-targe'), 
    'Test')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/span_Next -- Add Utilty Data'), 
    'Next -- Add Utilty Data')

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Select Commodity'), 
    'Gas', true)

String data = CustomKeywords.'com.Baseclass.Accountnumber.generateRandomData'()

println(data)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_txtAccountNumber'), data)

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_AccountName'), '12121')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Select Facility'), 
    'Residential', true)

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_vatNum'), '123456789')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_personalTaxNum'), '121212121')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_MeterNum'), '122222222')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Select Type Of Use'), 
    'Air conditioning', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Select Street Part'), 
    'CORSO', true)

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_address (1)'), 'Add')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_streetNum'), 'Street no3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Select Province'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/select_Select City'), 
    'Alessandria', true)

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_zip'), '12345')

WebUI.setText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/textarea_txtComment'), 'Test')

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/span_Save'))

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/span_There are no more Utiliti'))

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/input_au-target'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/button_Submit'), 
    'Submit')

WebUI.click(findTestObject('Object Repository/Customer Gas Account/Page_My Customers  5-15/button_Submit'))

