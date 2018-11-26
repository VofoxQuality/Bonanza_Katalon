import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Country'), 'Select Country', 
    false)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetPart'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetName'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStreetNum'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtZip'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtCity'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtStateCode'), '')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Mail Address Div click'))

WebUI.verifyElementText(findTestObject('Edit Profile/Page_Profile  5-15/Save-Mobile Number'), 'Save')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Save-Mobile Number'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Country'), 'Country')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_7'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Street Name'), 'Street Name')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_8'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_9'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_StateProvince'), 'State/Province')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_10'), 'is required')
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtZip'), '12121221')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Mail Address Div click'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_must be no more than 5 chara'), 
    'must be no more than 5 characters.')

