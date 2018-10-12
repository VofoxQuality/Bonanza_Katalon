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

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Change Password'))

WebUI.verifyElementText(findTestObject('Change Password/Page_Home  5-15/Change Pwd Text Label'), 'Change Password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Input current Password'), 
    'Input current Password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Input new password'), 'Input new password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Confirm new password'), 
    'Confirm new password')

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Update'))

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Input current Password'), 
    'Input current Password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/p_is required'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Input new password'), 'Input new password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/p_is required_1'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Confirm new password'), 
    'Confirm new password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/p_is required_2'), 'is required')

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Update'))

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Cancel'))

