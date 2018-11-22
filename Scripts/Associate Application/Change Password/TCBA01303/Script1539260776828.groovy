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

WebUI.click(findTestObject('Change Password/Page_Home  5-15/span_shinto-test2'))


WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Change Password'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Change Password/Page_Home  5-15/Change Pwd Text Label'), 'Change Password')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtPassword'), 'p4y+y39Ir5MpdObRmcVQcw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtNewPassword'), '1iUhVUeXOUxgrGJKtvccntnbwXJoZWd3WFdRDoz01o4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtConfirmPassword'), '/5qYCBevC/bFnqgRlh8jQXujbEjF9i63oCTZ8RsGXXEcXiFmmAkXPQ==')

WebUI.click(findTestObject('Change Password/Page_Home  5-15/Change Pwd Text Label'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Input current Password'), 
    'Input current Password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/p_is incorrect.'), 'is incorrect.')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/label_Confirm new password'), 
    'Confirm new password')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/p_must match new password'), 'must match new password')

WebUI.verifyElementText(findTestObject('Change Password/Page_Home  5-15/New Password1'), 'Input new password')

WebUI.verifyElementText(findTestObject('Change Password/Page_Home  5-15/New Password2'), 'must be at least 6 characters , have at least one non alphanumeric character , one lowercase (\'a\'-\'z\') , one uppercase (\'A\'-\'Z\') and one digit(0-9)')

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Update'))

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtPassword'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtNewPassword'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtConfirmPassword'), '9NLz+4tGZcQ=')

if (GlobalVariable.Password.equals('Password2!')) {
WebUI.setText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtPassword'), 'Password2!')

} else {
WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtPassword'), 'p4y+y39Ir5PEPmX20UxFKw==')

}
WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtNewPassword'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/Page_Home  5-15/input_txtConfirmPassword'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Update'), 'Update')

WebUI.click(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_Update'))

WebUI.delay(10)

