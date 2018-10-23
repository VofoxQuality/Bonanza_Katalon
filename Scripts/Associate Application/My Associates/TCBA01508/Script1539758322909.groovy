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

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Add Associate'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Add'), 'Add')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Associates'), 'Associates')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/h3_Personal Information'), 
    'Personal Information')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/h3_Mailing Address'))

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStreetName'), 'Street Name')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStreetNum'), 'House Number')

WebUI.selectOptionByValue(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select StateProvince'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select City'), 
    'Alessandria', true)

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtZip'), '12345')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtLandPhone'), '123456789')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtMobilePhone'), '123456789')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtBankAccountKey'), 'NL70ABNA0434144140')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_1'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Birth Date'), 'Birth Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_(MMDDYYYY)'), '(MM/DD/YYYY)')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_2'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Marital Status'), 
    'Marital Status')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_3'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Birth State'), 'Birth State')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_4'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Birth City'), 'Birth City')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_5'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Citizenship'), 'Citizenship')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_6'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Personal Tax Num'), 
    'Personal Tax Num')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_7'), 'is required')

WebUI.verifyTextPresent('First Name is required', false)

WebUI.verifyTextPresent('Last Name is required', false)

WebUI.verifyTextPresent('Marital Status is required', false)

WebUI.verifyTextPresent('Citizenship is required', false)

WebUI.verifyTextPresent('Personal Tax Num is required', false)

WebUI.verifyTextPresent('Birth Date is required', false)

WebUI.verifyTextPresent('Birth State is required', false)

WebUI.verifyTextPresent('Birth City is required', false)

WebUI.click(findTestObject('My Associates/Page_My Associates  5-15/Cancel button'))

