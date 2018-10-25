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

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_JK_e-hhandle e-box e-pinch'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_JK_e-hdown e-chevron-down_'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_JK_e-hup e-chevron-up_01 e'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_JK_e-hhandle e-box e-pinch'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/i_Update Matrix_fa fa-search-p'))

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/i_Update Matrix_fa fa-search-m'))

WebUI.scrollToPosition(5, 5)

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/label_End Level'), 'End Level')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/label_Sponsor'), 'Sponsor')

WebUI.selectAllOption(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Level 0            Leve'))

WebUI.selectOptionByValue(findTestObject('My Downline/Page_My Downline  5-15/Tree view End Level'), '4', true)

WebUI.selectAllOption(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Select Sponsor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Select Sponsor'), 
    '4854', true)

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_Update Matrix'))

