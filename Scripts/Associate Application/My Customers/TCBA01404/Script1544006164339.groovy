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

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/h3_Enter Account'), 'Enter Account')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Commodity'), 'Commodity')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Name on Bill'), 'Name on Bill')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Facility'), 'Facility')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/h3_Tax Information'), 'Tax Information')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_VAT Number (Provide busi'), 
    'VAT Number (Provide business Vat # if sending bill to company)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Personal Tax Number (Pro'), 
    'Personal Tax Number (Provide Personal Tax # of person enrolling the home or the business)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/h3_Service Address (if differe'), 
    'Service Address (if different from mailing address)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Country'), 'Country')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Street Part'), 'Street Part')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Address'), 'Address')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Street No'), 'Street No')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Province'), 'Province')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_City'), 'City')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/h3_Comments'), 'Comments')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Add any comments you fee'), 
    'Add any comments you feel IGL should know about customer, if none, leave blank.')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/button_Copy Address from Custo'), 
    'Copy Address from Customer')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Save'), 'Save')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Cancel'), 'Cancel')

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Cancel'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.waitForElementClickable(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Save'), 3)

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Name on Bill'), 'Name on Bill')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_1'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Facility'), 'Facility')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_2'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Address'), 'Address')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_3'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Street No'), 'Street No')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_4'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Province'), 'Province')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_5'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_City'), 'City')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_6'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_7'), 'is required')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/select_Select Facility'), 
    'Residential', false)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Personal Tax Number (Pro'), 
    'Personal Tax Number (Provide Personal Tax # of person enrolling the home or the business)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_8'), 'is required')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/select_Select Facility'), 
    'Commercial', false)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_VAT Number (Provide busi'), 
    'VAT Number (Provide business Vat # if sending bill to company)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_is required_9'), 'is required')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), '2121212333333333')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be no more than  15 cha'), 
    'must be no more than 15 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), '212121233333')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be at least 14 characte'), 
    'must be at least 14 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), '')

not_run: WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), 
    'SDSD3233233336')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 
    'Account Number')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_invalid format'), 
    'invalid format')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/select_Select Commodity'), 
    'Gas', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), '21222')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _2'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be at least 8 character'), 
    'must be at least 8 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), '212223333333333')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _3'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be no more than 14 char'), 
    'must be no more than 14 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Account Number_txtAccoun'), '212223  ds323')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _5'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Account Number'), 'Account Number')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_cannot contain spaces'), 
    'cannot contain spaces')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Name on Bill_AccountName'), ' Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_VAT Number (Provide busi'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _6'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Name on Bill'), 'Name on Bill')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be no more than 255 cha'), 
    'must be no more than 255 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_VAT Number (Provide busi'), '21323232323232323232')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Personal Tax Number (Pro'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _7'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_VAT Number (Provide busi'), 
    'VAT Number (Provide business Vat # if sending bill to company)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_invalid format_1'), 'invalid format')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Personal Tax Number (Pro'), '2222222222222')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_VAT Number (Provide busi'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _1'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _8'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Personal Tax Number (Pro'), 
    'Personal Tax Number (Provide Personal Tax # of person enrolling the home or the business)')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_Invalid Format (1)'), 'Invalid Format')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Address_address'), ' Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_VAT Number (Provide busi'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _9'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Address'), 'Address')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be no more than  150 ch'), 
    'must be no more than 150 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/input_Zip_zip'), '23232323233')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Address'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Zip'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _10'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be no more than 5 chara'), 
    'must be no more than 5 characters.')

WebUI.setText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/textarea_Add any comments you'), ' Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space Account Numbercannot contain space')

WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/span_Save'))

not_run: WebUI.click(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/div_Account                   _11'))

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/label_Add any comments you fee'), 
    'Add any comments you feel IGL should know about customer, if none, leave blank.')

WebUI.verifyElementText(findTestObject('Object Repository/My_Customer1/Page_My Customers  5-15/p_must be no more than 1000 ch'), 
    'must be no more than 1000 characters.')

