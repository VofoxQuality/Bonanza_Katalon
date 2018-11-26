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

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), '')

WebUI.verifyElementText(findTestObject('Edit Profile/Page_Profile  5-15/Save-Mobile Number'), 'Save')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Save-Mobile Number'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Mobile'), 'Mobile')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_11'), 'is required')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), '21212121212122123232323')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), '232323232323232323233')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Save-Mobile Number'))

WebUI.verifyElementText(findTestObject('Edit Profile/Page_Profile  5-15/label_Business Phone'), 'Home Phone')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_must be no more than  15 cha'), 
    'must be no more than 15 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Mobile'), 'Mobile')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_must be no more than  15 cha_1'), 
    'must be no more than 15 characters.')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLandPhone'), 'Test')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtMobilePhone'), 'Test')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Save-Mobile Number'))

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Business Phone'), 'Home Phone')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_can only contain digits'), 'can only contain digits')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Mobile'), 'Mobile')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_can only contain digits_1'), 
    'can only contain digits')

