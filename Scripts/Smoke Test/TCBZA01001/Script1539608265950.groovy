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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://192.168.10.72/#/login')

WebUI.verifyElementPresent(findTestObject('Smoke_Test/Page_Log In  5-15/h1_Log In'), 10)

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_Log In  5-15/input_txtUserName'), 'Shinto-Test')

WebUI.setEncryptedText(findTestObject('Object Repository/Smoke_Test/Page_Log In  5-15/input_txtPassword'), 'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_Log In  5-15/button_Log in'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Smoke_Test/Page_Log In  5-15/Header Text'), 'My Title:')
