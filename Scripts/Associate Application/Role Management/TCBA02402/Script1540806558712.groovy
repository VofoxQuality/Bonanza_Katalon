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

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_Role Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Home  5-15/span_Role Management'), 'Role Management')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/h3_Filter users'), 
    'Filter users')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_User Name'), 
    'User Name')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_FILTER'), 'FILTER')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/h3_User Details'), 
    'User Details')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_User Name'), 'User Name')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_Inactive Date'), 
    'Inactive Date')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_Roles'), 'Roles')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_Edit Roles'), 'Edit Roles')

