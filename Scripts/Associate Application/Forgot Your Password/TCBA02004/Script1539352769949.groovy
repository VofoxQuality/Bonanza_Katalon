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

WebUI.setText(findTestObject('Object Repository/Forgot Your Password/Page_Forgot your password/input_Input.Username'), 'shinto-custom')

WebUI.click(findTestObject('Object Repository/Forgot Your Password/Page_Forgot your password/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Your Password/Page_Forgot your password/li_Username shinto-custom was'), 
    'Username \'shinto-custom\' was not found. Please contact customer service.')

WebUI.setText(findTestObject('Object Repository/Forgot Your Password/Page_Forgot your password/input_Input.Username'), 'shinto-customer')

WebUI.click(findTestObject('Object Repository/Forgot Your Password/Page_Forgot your password/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Your Password/Page_Forgot your password/li_There a login for shinto-cu'), 
    'There a login for \'shinto-customer\' but no Associate is linked to that account.Please contact customer service.')

