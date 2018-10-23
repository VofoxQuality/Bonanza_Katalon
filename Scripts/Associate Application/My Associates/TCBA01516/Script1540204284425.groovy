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

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Add Associate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Birth Country'), 
    'Italy', true)

WebUI.selectAllOption(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Birth State'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Birth State'), 
    'Alessandria', true)

WebUI.selectAllOption(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Birth City'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Birth City'), 
    'Alessandria', true)

WebUI.waitForElementPresent(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'), 3)

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

