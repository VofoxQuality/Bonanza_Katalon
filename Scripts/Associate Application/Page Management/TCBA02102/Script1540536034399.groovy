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

WebUI.click(findTestObject('Object Repository/Page Management/Page_Home  5-15/a_Page Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Page Management'), 
    'Page Management')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/h3_Manage your pages'), 
    'Manage your pages')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Page Name'), 'Page Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Inserted On'), 
    'Inserted On')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Active'), 'Active')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Code'), 'Code')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Language'), 'Language')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Website'), 'Website')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Edit'), 'Edit')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Add Page'), 'Add Page')

