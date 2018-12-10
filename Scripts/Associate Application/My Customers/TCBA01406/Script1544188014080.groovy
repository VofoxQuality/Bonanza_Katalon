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

String data = CustomKeywords.'com.Baseclass.Accountnumber.generateRandomData'()

println(data)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_txtAccountNumber'), data)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_AccountName'), '5033334')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/select_Select Facility'), 
    'Commercial', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_vatNum'), '00079760328')

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/input_personalTaxNum'), '')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/button_Copy Address from Custo'))

WebUI.setText(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/textarea_txtComment'), 'Test')

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_Save'))

WebUI.click(findTestObject('Object Repository/Customer Account/Page_My Customers  5-15/span_There are no more Utiliti'))

not_run: WebUI.click(findTestObject('Page_My Customers  5-15/span_Submit'))

not_run: WebUI.click(findTestObject('Page_My Customers  5-15/span_Order Confirmation Page'))

not_run: WebUI.click(findTestObject('Page_My Customers  5-15/button_Edit Order'))

