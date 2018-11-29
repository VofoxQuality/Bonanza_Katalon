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

WebUI.click(findTestObject('Object Repository/My Downline/Page_Home  5-15/a_My Downline'))

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_My Downline'), 'My Downline')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_List View'), 'List View')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Summary'), 'Summary')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_List View with Forced Mat'), 
    'List View with Forced Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Tree View with Forced Mat'), 
    'Tree View with Forced Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'), 'Update Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Tree View'), 'Tree View')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/h3_Tree View'), 'Tree View')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/label_End Level'), 'End Level')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/label_Sponsor'), 'Sponsor')

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 0', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 1', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 2', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 3', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 4', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 5', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 6', false, 
    0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Start_Level_Treeview'), 'Level 7', false, 
    0)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('My Downline/Page_My Downline  5-15/Tree view End Level'), 'Level 5', false)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Sponsor_Treeview'), 'Select Sponsor', 
    false, 0)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('My Downline/Page_My Downline  5-15/Sponsor_Treeview'), 'Select Sponsor', false)

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'), 'Update Matrix')

