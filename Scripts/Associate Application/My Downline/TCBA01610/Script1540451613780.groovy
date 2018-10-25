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

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/th_Sponsor'), 'Sponsor')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/th_Associate'), 'Associate')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/th_Customer Energy Accounts'), 
    'Customer Energy Accounts')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Level'), 'Level')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Sponsor'), 'Sponsor')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Sponsor Email'), 'Sponsor Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Sponsor Mobile Phone'), 
    'Sponsor Mobile Phone')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Associate'), 'Associate')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Mobile Phone'), 'Mobile Phone')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Inactive Date'), 'Inactive Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Csr Status'), 'Csr Status')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Contract Signed Date'), 
    'Contract Signed Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_CSR Title'), 'CSR Title')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Associate Count'), 'Associate Count')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Contract Count'), 'Contract Count')

WebUI.verifyElementText(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_Validated Contract Count'), 
    'Validated Contract Count')

WebUI.selectOptionByValue(findTestObject('My Downline/Page_My Downline  5-15/Start Level'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Level 0            Leve'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Select Sponsor'), 
    'Test, Shinto-QA', true)

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/button_FILTER'))

WebUI.selectOptionByValue(findTestObject('My Downline/Page_My Downline  5-15/Start Level'), '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/select_Level 0            Leve'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/My Downline/Page_My Downline  5-15/div_The End Level should be  g'))

