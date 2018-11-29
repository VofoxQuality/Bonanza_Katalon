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

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Country'), 
    'Italy', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('My Associates/Page_My Associates  5-15/type_Street'), 'VIA', false)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('My Associates/Page_My Associates  5-15/Street_MouseOver'))

WebUI.verifyElementText(findTestObject('My Associates/Page_My Associates  5-15/Mouse_over_Message'), 'Show All Street Parts')

WebUI.selectOptionByLabel(findTestObject('My Associates/Page_My Associates  5-15/state_code'), 'Alessandria', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('My Associates/Page_My Associates  5-15/State_City'), 'Alessandria', false)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

