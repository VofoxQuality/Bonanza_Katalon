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

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Add Page'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/div_Add Page Details'), 
    'Add Page Details')

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

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/button_Save'), 'Save')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Cancel'), 'Cancel')

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Page Name'), 
    'Page Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Code'), 'Code')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required_1'), 
    'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Language'), 'Language')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required_2'), 
    'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Website'), 'Website')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required_3'), 
    'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/label_Page Content'), 
    'Page Content')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/p_is required_4'), 
    'is required')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Page Name_pageName'), 'Page10')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Code_code'), 'Code10')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/select_Select Language'), 
    'English', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Website_website'), 'www.google.com')

WebUI.setText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/body_Test Data'), 'Test data')

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/button_Save'), 'Save')

WebUI.click(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/button_Save'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/span_Saved successfully'), 
    'Saved successfully')

