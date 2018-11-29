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

WebUI.click(findTestObject('Object Repository/Executive/Page_Executive  5-15/span_14'))

WebUI.scrollToElement(findTestObject('Executive/Page_Executive  5-15/h3_Energy Accounts Details'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/h3_Energy Accounts Details'), 'Energy Accounts Details')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/th_Sponsor'), 'Sponsor')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/th_Associate'), 'Associate')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/th_Customer Energy Accounts'), 
    'Customer Energy Accounts')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Level'), 'Level')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Sponsor'), 'Sponsor')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Sponsor Email'), 'Sponsor Email')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Sponsor Mobile Phone'), 'Sponsor Mobile Phone')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Associate'), 'Associate')

WebUI.verifyElementText(findTestObject('Executive/Page_Executive  5-15/div_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Mobile Phone'), 'Mobile Phone')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Inactive Date'), 'Inactive Date')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Submitted Date'), 'Submitted Date')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Account Name'), 'Account Name')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/Executive/Page_Executive  5-15/div_Account Status'), 'Account Status')

