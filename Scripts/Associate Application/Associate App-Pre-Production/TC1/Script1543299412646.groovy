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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://515itportal-preprod.azurewebsites.net')

WebUI.setText(findTestObject('Object Repository/Page_Log In  5-15/input_txtUserName'), 'Test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In  5-15/input_txtPassword'), 'fLdlzkRmaag=')

WebUI.click(findTestObject('Object Repository/Page_Log In  5-15/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_My Title'), 'My Title:')

WebUI.click(findTestObject('Object Repository/My Associates/Page_Home  5-15/a_My Associates'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_My Associates'), 'My Associates')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/h3_Associates list'), 'Associates list')

