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

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Home  5-15/a_Shinto-Test'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Home  5-15/span_Edit Profile'), 'Edit Profile')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/a_Change Password'), 'Change Password')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Log Off'), 'Log Off')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Profile'), 'Profile')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit'), 'Edit')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Change Your Email Address'), 
    'Change Your Email Address')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Close'), 'Close')

