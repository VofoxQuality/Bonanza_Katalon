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

WebUI.selectOptionByValue(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Country'), 
    'United States Of America', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtCity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStateCode'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtZip'), 0)

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

