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

WebUI.setText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_Email_txtEmail'), 'shinto@vofoxsolutions.com')

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_FILTER'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/h3_User Details'), 
    10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_...12345678...'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_1 of 6 pages (51 items)'))

