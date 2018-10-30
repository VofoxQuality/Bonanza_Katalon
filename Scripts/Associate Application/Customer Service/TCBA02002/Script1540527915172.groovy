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

WebUI.click(findTestObject('Object Repository/Customer Service/Page_Home  5-15/a_Customer Service'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_Customer Service'), 
    'Customer Service')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/h3_Filter customers'), 
    'Filter customers')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_FILTER'), 'FILTER')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/div_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/div_User Name'), 
    'User Name')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/div_Full Name'), 
    'Full Name')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/div_Inactive Date'), 
    'Inactive Date')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/div_Log In'), 'Log In')

WebUI.setText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/input_Email_txtEmail'), 'qwqw21212sewe')

WebUI.click(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_FILTER'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/td_No records to display'), 
    'No records to display')

WebUI.setText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/input_Email_txtEmail'), '')

WebUI.click(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_FILTER'))

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/p_is required'), 
    'is required')

WebUI.setText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/input_Email_txtEmail'), 'shinto@vofoxsolutions.com')

WebUI.click(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_FILTER'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/td_shintovofoxsolutions.com'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_Log In'), 'Log In')

