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

WebUI.setText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/input_Email_txtEmail'), '')

WebUI.setText(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/input_Email_txtEmail'), 'prasanth.gk@vofoxsolutions.com')

WebUI.click(findTestObject('Object Repository/Customer Service/Page_Customer Service  5-15/span_FILTER'))

WebUI.verifyElementText(findTestObject('Customer Service/Page_Customer Service  5-15/Search EmailGK'), 'Dennis-Test')

WebUI.click(findTestObject('Customer Service/Page_Customer Service  5-15/Search EmailLogin'))

WebUI.verifyElementText(findTestObject('Object Repository/Change Password/Page_Home  5-15/span_My Title'), 'My Title:')

WebUI.waitForElementPresent(findTestObject('Customer Service/Page_Home  5-15/a_dennis-test'), 3)

WebUI.verifyElementText(findTestObject('Customer Service/Page_Home  5-15/a_dennis-test'), 'Dennis-Test (N22006)')

