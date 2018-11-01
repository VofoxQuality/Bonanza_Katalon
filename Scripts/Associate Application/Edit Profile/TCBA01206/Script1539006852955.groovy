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

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Country'), 'United States Of America', 
    true)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Label Click Email'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Routing Number'), 
    'Routing Number')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_12'), 'is required')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '1212')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Label Click Email'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Routing Number'), 'Routing Number')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_must be 9 characters.'), 'must be 9 characters.')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '23232323232323232323')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Label Click Email'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/div_Routing Numbermust be no m'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Routing Number'), 'Routing Number')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_must be no more than 9 chara'), 
    'must be no more than 9 characters.')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtRoutingNum'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtBankAccountKey'), '')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'))

