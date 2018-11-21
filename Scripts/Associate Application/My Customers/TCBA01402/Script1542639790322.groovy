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

WebUI.click(findTestObject('Object Repository/My Customers/Page_Home  5-15/span_My Customers'))

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_My Customers'), 'My Customers')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/h3_Customer List'), 'Customer List')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Customer'), 'Customer')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Submitted Date'), 'Submitted Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Business'), 'Business')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Home'), 'Home')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Delete'), 'Delete')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Add Customer'), 'Add Customer')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Customer List_gvOrders_s'), 'Tester JK')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/a_Customer List_e-searchitem e'))

WebUI.verifyElementVisible(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_...12345678...'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_1 of 1 pages (1 items)'))

