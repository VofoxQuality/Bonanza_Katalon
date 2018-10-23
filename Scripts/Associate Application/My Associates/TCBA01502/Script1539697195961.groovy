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

WebUI.click(findTestObject('Object Repository/My Associates/Page_Home  5-15/a_My Associates'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_My Associates'), 'My Associates')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/h3_Associates list'), 'Associates list')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/div_Full Name'), 'Full Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/div_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/div_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/div_Status Date'), 'Status Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/div_Inactive Date'), 'Inactive Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/div_View'), 'View')

