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

WebUI.setText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_Email_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_Email_txtEmail'), 'prasanth.gk@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_User Name_txtUserName'), 
    'Dennis-Test')

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_FILTER'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_Shintokk_icon-edit-underl'))

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_Role Management'), 
    'Role Management')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/h3_Filter users'), 
    'Filter users')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_Edit  Roles of'), 
    'Edit Roles of')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_Shintokk'), 'Dennis-Test')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_Associate'), 
    'Associate')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_Editor'), 'Editor')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_CustomerService'), 
    'CustomerService')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_Admin'), 'Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_Customer'), 'Customer')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/label_Execs'), 'Execs')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/button_Save'), 'Save')

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/button_Cancel'), 'Cancel')

