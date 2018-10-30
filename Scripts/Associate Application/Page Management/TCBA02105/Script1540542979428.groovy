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

WebUI.click(findTestObject('Page Management/Page_Page Management  5-15/Icon-edit-button'))

WebUI.verifyElementText(findTestObject('Page Management/Page_Page Management  5-15/Update Page Management'), 'Update Page Content')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/h3_Page Details'), 
    'Page Details')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Page Name'), 
    'Page Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Code'), 'Code')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Language'), 'Language')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Website'), 'Website')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Page Content'), 
    'Page Content')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Editor'), 'Editor')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Raw'), 'Raw')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Preview'), 'Preview')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Update'), 'Update')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Publish'), 'Publish')

WebUI.verifyElementText(findTestObject('Page Management/Page_Page Management  5-15/a_Cancel'), 'Cancel')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Page Name_pageName'), '')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Website_website'), '')

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Update'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Page Name'), 
    'Page Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required_5'), 
    'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Website'), 'Website')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required_6'), 
    'is required')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Page Name_pageName'), 'Page10')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Website_website'), 'www.google.com')

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Update'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Updated successfully'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Updated successfully'), 
    'Updated successfully')

WebUI.click(findTestObject('Page Management/Page_Page Management  5-15/Icon-edit-button'))

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/a_Publish'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Published successfully'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Published successfully'), 
    'Published successfully')

WebUI.click(findTestObject('Page Management/Page_Page Management  5-15/Icon-edit-button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Cancel'), 
    3)

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Cancel'))

WebUI.click(findTestObject('Smoke_Test/Page_My Associates  5-15/Select Home'))

