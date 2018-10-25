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

WebUI.selectOptionByValue(findTestObject('My Downline/Page_My Downline  5-15/Start Level'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Level 0            Leve'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Select Sponsor'), 
    'Test, Shinto-QA', true)

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_FILTER'))

WebUI.verifyElementPresent(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_...12345678...'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_1 of 1 pages (4 items)'), 
    0)

