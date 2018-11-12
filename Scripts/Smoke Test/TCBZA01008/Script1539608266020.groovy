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

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_Home  5-15/span_My Title'), 'My Title:')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_Home  5-15/p_My Customers'), 'My Customers')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_Home  5-15/span_Add Customer'), 'Add Customer')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_Home  5-15/span_Add Customer'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Customer Details'), 
    'Customer Details')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/h3_Customer Type'), 'Customer Type')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Individual'), 'Individual')

WebUI.selectOptionByValue(findTestObject('Customer Account/Page_My Customers  5-15/Select Country'), 'Italy', true)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_firstName'), 'Shinto-Test')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_lastName'), 'Electrical Account')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Select Street Part'), 
    'CORSO', true)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_Address'), 'Address')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_streetNum'), 'Street No1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Select Province'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Select City'), 
    'Alessandria', true)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_zip'), '4000')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_email'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_email2'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_cellPhone'), '12345678')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_phone2'), '123456789')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Month'), '05', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Day                  01'), 
    '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Year                  2'), 
    '1985', true)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_txtIBAN'), 'NL70ABNA0434144140')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/textarea_form-control au-targe'), 
    'Test')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Next -- Add Utilty Data'), 
    'Next -- Add Utilty Data')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

String data = CustomKeywords.'com.Baseclass.Accountnumber.generateRandomData'()

println(data)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_txtAccountNumber'), data)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_AccountName'), '5033334')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Select Facility'), 
    'Commercial', true)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_vatNum'), '123456789')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_personalTaxNum'), '3434343434')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/button_Copy Address from Custo'))

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/textarea_txtComment'), 'Test')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Save'))

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_There are no more Utiliti'))

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Order Confirmation Page'))

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_au-target'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/button_Submit'), 'Submit')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/button_Submit'))

