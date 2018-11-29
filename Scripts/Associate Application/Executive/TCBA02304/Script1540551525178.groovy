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

WebUI.selectOptionByLabel(findTestObject('Object Repository/Executive/Page_Executive  5-15/select_Select Sponsor'), 'Select Sponsor', 
    false)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Executive/Page_Executive  5-15/button_FILTER'))

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/h3_Energy Accounts'), 'Energy Accounts')

WebUI.click(findTestObject('Object Repository/Executive/Page_Executive  5-15/span_472'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Executive/Page_Executive  5-15/h3_Contract Not Signed'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/h3_Contract Not Signed'), 'Contract Not Signed')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Level'), 'Level')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Count'), 'Count')

