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

PageName = WebUI.getAttribute(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Page Name_pageName'), 
    'value')

WebUI.verifyMatch('Page11', PageName, false)

Code = WebUI.getAttribute(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Code_code'), 
    'value')

WebUI.verifyMatch('CODE10', Code, false)

Language = WebUI.getAttribute(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/select_Select Language'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch('English', Language, false)

Website = WebUI.getAttribute(findTestObject('Object Repository/Page Management/Page_Page Management  5-15/input_Website_website'), 
    'value')

WebUI.verifyMatch('www.google.com', Website, false)

