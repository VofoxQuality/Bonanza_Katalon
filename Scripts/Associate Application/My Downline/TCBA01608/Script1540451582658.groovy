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

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Tree View with Forced Mat'))

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_My Downline'), 'My Downline')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/h3_Tree View with Forced Matri'), 
    'Tree View with Forced Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Summary'), 'Summary')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_List View'), 'List View')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Tree View'), 'Tree View')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/a_List View with Forced Matrix'), 
    'List View with Forced Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/span_Tree View with Forced Mat'), 
    'Tree View with Forced Matrix')

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix_btn btn-z'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/i_Update Matrix_fa fa-search-p'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/i_Update Matrix_fa fa-search-m'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/i_Update Matrix_fa fa-search-m'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/i_Update Matrix_fa fa-search-p'))

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/h3_Tree View with Forced Matri'), 
    'Tree View with Forced Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/label_End Level'), 'End Level')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/label_Sponsor'), 'Sponsor')

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 0', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 1', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 2', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 3', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 4', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 5', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 6', 
    false, 0)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 7', 
    false, 0)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treewith_ForcedmatrixLevel'), 'Level 5', false)

WebUI.delay(3)

WebUI.verifyOptionPresentByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treeview_With_ForcedMatrix'), 'Select Sponsor', 
    false, 0)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('My Downline/Page_My Downline  5-15/Treeview_With_ForcedMatrix'), 'Select Sponsor', 
    false)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'), 'Update Matrix')

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'))

