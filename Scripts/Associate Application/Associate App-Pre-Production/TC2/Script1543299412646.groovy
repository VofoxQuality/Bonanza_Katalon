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

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/span_Add Associate'))

WebUI.verifyElementText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/span_Associates'), 'Associates')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtFirstName'), 'Test_2018-12-05')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtLastName'), 'Associate')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Month'), '05', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Day                  01'), 
    '05', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Year                  2'), 
    '1995', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Marital Status'), 
    'Married', false)

WebUI.delay(3)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_EnglishItalian'), 
    'English', true)

WebUI.selectOptionByLabel(findTestObject('Smoke_Test/Page_My Associates  5-15/Select Country'), 'Italy', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Birth State'), 
    'Alessandria', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Birth City'), 
    'Alessandria', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Citizenship'), 
    'Italy', false)

WebUI.delay(3)

String data = CustomKeywords.'com.Baseclass.Utility.generateRandomData'()

println(data)

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtPersonalTaxNum'), data)

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtBusinessTaxNum'), '34343434344434')

WebUI.selectOptionByLabel(findTestObject('Smoke_Test/Page_My Associates  5-15/Country-Prod'), 'Italy', false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select Type (StDrBlvdWa'), 
    'STRADA', false)

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtStreetName'), 'Street')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtStreetNum'), 'House name')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select StateProvince'), 
    'Alessandria', false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/select_Select City'), 'Alessandria', 
    false)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtZip'), '5000')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtLandPhone'), '212121212')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtMobilePhone'), '4343434344')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtEmail'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtConfirmEmail'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_txtBankAccountKey'), 'NL70ABNA0434144140')

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/span_Save'))

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/input_au-target'))

WebUI.click(findTestObject('Object Repository/Smoke_Test/Page_My Associates  5-15/button_Ok'))

