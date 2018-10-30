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

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_Customer_cls-checkbox au'))

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_Execs_cls-checkbox au-ta'))

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_CustomerService_cls-chec'))

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/input_CustomerService_cls-chec'))

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/div_Successfully addremove use'), 
    'Successfully add/remove user roles.')

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/span_Shintokk_icon-edit-underl'))

WebUI.click(findTestObject('Object Repository/Role Management/Page_Role Management  5-15/button_Cancel'))

WebUI.delay(10)

