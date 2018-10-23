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

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Add Associate'))

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Test..sd@testest.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Test.sd@@testest.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_1'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Test.sd@.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_2'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Test.sd@Test.')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_3'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '@Test.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_4'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Test.com')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_5'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Test@fdgcom')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_6'), 
    'invalid email format')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), ' Test@')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtConfirmEmail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_invalid email format_7'), 
    'invalid email format')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

