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

WebUI.setText(findTestObject('Object Repository/Change Password/Page_Log In  5-15/input_txtUserName'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Log In  5-15/input_txtPassword'), '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Log In  5-15/input_txtUserName'), 'Shinto-Test2')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit Profile/Page_Log In  5-15/input_txtPassword'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Log In  5-15/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_My Title'), 'My Title:')

WebUI.click(findTestObject('Change Password/Page_Home  5-15/span_shinto-test2'))

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Change Password'))

WebUI.verifyElementText(findTestObject('Change Password/Page_Home  5-15/Change Pwd Text Label'), 'Change Password')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtPassword'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtNewPassword'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtConfirmPassword'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtPassword'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtNewPassword'), 'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtConfirmPassword'), 'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Update'))

WebUI.delay(10)

