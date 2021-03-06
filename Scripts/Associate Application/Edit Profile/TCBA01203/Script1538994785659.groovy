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

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit'), 'Edit')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtFirstName'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtLastName'), '')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Month'), 'Month', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Day                  01'), 
    'Day', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Year                  2'), 
    'Year', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Marital Status'), 
    'Select Marital Status', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Birth Country'), 
    'Select Birth Country', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtBirthStateCode'), '')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtBirthCity'), '')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/select_Select Citizenship'), 
    'Select Citizenship', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtPersonalTaxNum'), '')

WebUI.click(findTestObject('Edit Profile/Page_Profile  5-15/Mail Address Div click'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'), 'Save')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_1'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Birth Date'), 'Birth Date')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_(MMDDYYYY)'), '(MM/DD/YYYY)')

WebUI.verifyElementText(findTestObject('Edit Profile/Page_Profile  5-15/Is required_2'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Marital Status'), 'Marital Status')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_3'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Birth Country'), 'Birth Country')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_4'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Citizenship'), 'Citizenship')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_5'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Personal Tax Num'), 'Personal Tax Num')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is required_6'), 'is required')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/input_txtPersonalTaxNum'), 'BNGSVN77D54D286P')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'), 'Save')

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/label_Personal Tax Num'), 'Personal Tax Num')

WebUI.verifyElementText(findTestObject('Object Repository/Edit Profile/Page_Profile  5-15/p_is already taken'), 'is already taken')

