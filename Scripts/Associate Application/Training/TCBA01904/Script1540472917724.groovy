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

WebUI.click(findTestObject('Object Repository/Training/Page_Home  5-15/a_Training'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_Videos'), 2)

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_Videos'))

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/span_Training'), 'Training')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/span_Watch Videos Now'), 'Watch Videos Now')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/h3_Enter a contract for Gas or'), 'Enter a contract for Gas or Electricty')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/h3_How to add an associate'), 'How to add an associate')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/h3_Create your associate accou'), 'Create your associate account')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/h3_How Customers set up their'), 'How Customers set up their account in Customer Portal')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/h3_Residential Sales Video 1'), 'Residential Sales Video 1')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_Videos  5-15/h3_Residential Sales Video 2'), 'Residential Sales Video 2')

WebUI.click(findTestObject('Object Repository/Training/Page_Home  5-15/a_Training'))

