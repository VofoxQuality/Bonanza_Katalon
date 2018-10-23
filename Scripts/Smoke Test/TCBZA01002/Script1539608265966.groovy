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

WebUI.verifyElementText(findTestObject('Smoke_Test/Page_Invite Friends  5-15/My Associate Label'), 'My Associates')

WebUI.verifyElementText(findTestObject('Smoke_Test/Page_Invite Friends  5-15/Invite Associates Label'), 'Invite Associate')

WebUI.click(findTestObject('Smoke_Test/Page_Invite Friends  5-15/Invite button click'))

WebUI.verifyElementText(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/span_Invite Friends'), 'Invite Friends')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/input_txtFirstName'), 'Shinto')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/input_txtLastName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/input_txtEmail'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/input_txtConfirmEmail'), 'shinto@vofoxsolutions.com')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/select_EnglishItalian'), 
    'English', true)

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/button_Send Invite'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/span_Saved successfully'), 
    10)

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_Invite Friends  5-15/span_Cancel'))

WebUI.delay(10)

