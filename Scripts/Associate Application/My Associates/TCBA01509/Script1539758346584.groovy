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

WebUI.setText(findTestObject('My Associates/Page_My Associates  5-15/input_txtFirstName'), 'First name')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtLastName'), 'Last name')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Month'), '05', 
    false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Day                  01'), 
    '05', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Year                  2'), 
    '1995', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Marital Status'), 
    'Married', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Birth State'), 
    'Alessandria', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Birth City'), 
    'Alessandria', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Citizenship'), 
    'Italy', false)

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtPersonalTaxNum'), '5454545')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtBusinessTaxNum'), '2121212122')

WebUI.selectOptionByLabel(findTestObject('Smoke_Test/Page_My Associates  5-15/Country-Prod'), 'Italy', false)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Street Name'), 'Street Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_8'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_HouseBuilding Num'), 
    'House/Building Num')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_9'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_StateProvince'), 
    'State/Province')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_10'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_City'), 'City')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_11'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_12'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Mobile'), 'Mobile')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_13'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_14'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Confirm Email'), 
    'Confirm Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_15'), 'is required')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_IBAN'), 
    'IBAN')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_is required_16'), 
    'is required')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

