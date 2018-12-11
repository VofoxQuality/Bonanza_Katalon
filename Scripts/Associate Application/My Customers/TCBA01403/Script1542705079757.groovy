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

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Add Customer'))

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Customer Details'), 
    'Customer Details')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/div_Billing Information (This'), 
    'Billing Information (This is the information we will use to create the monthly bill)')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/a_Next -- Add Utilty Data'), 
    'Next -- Add Utilty Data')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Cancel'), 'Cancel')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/h3_Customer Type'), 'Customer Type')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Country'), 'Country')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street Part'), 'Street Part')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Address'), 'Address')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street No'), 'Street No')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Province'), 'Province')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_City'), 'City')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_PEC Email (Optional)'), 
    'PEC Email (Optional)')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Cell Phone Number'), 
    'Cell Phone Number')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Home number if no cellph'), 
    'Home number if no cellphone')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Birth Date'), 'Birth Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_(MMDDYYYY)'), '(MM/DD/YYYY)')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Birth Country'), 'Birth Country')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_IBAN'), 'IBAN')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/h3_Comment'), 'Comment')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Add any comments you fee'), 
    'Add any comments you feel IGL should know about customer, if none, leave blank.')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_1'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Address'), 'Address')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_2'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street No'), 'Street No')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_3'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Province'), 'Province')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_4'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_City'), 'City')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_5'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_6'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_7'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Cell Phone Number'), 
    'Cell Phone Number')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_8'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Home number if no cellph'), 
    'Home number if no cellphone')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_9'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Birth Date'), 'Birth Date')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_(MMDDYYYY)'), '(MM/DD/YYYY)')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_10'), 'is required')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_IBAN'), 'IBAN')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_11'), 'is required')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_First Name_firstName'), 'Apart from counting words and characters, our online editors can help you to improve word choices and')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Last Name_lastName'), 'Apart from counting words and characters, our online editors can help you to improve word choices and')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Address_Address'), 'Apart from counting words and characters, our online editors can help you to improves words choices and Apart from counting words and characters,ours..')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Street No_streetNum'), 'Apart from counting words and characters,our online')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), '1234567')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Email_email'), 'testmail')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_PEC Email (Optional)_ema'), 'testmail1')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Cell Phone Number_cellPh'), 'Apart from counting words and characters,our online')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Home number if no cellph'), 'Apart from counting words and characters,our online')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_IBAN_txtIBAN'), '12122121')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you'), 'Apart from counting words and characters, our online editors can helps you to improves words choices and Apart from counting words and characters,ours..Apart from counting words and characters, our online editors can helps you to improves words choices and Apart from counting words and characters,ours..Apart from counting words and characters, our online editors can help you to improves words choices and Apart from counting words and characters,ours..Apart from the counting words and characters, our online editors can help you to improves words choices and Apart from counting words and characters,ours..Apart from counting words and characters, our online editors can helps you to improves words choices and Apart from counting words and characters,ours..Apart from counting words and characters, our online editors can help you to improves words choices and Apart from counting words and characters,ours..Apart from counting words and characters, our online editors can help you to improves wo')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  100 ch'), 
    'must be no more than 100 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  100 ch_1'), 
    'must be no more than 100 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Address'), 'Address')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  150 ch'), 
    'must be no more than 150 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street No'), 'Street No')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  10 cha'), 
    'must be no more than 10 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than 5 chara'), 
    'must be no more than 5 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_invalid email format'), 
    'invalid email format')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_PEC Email (Optional)'), 
    'PEC Email (Optional)')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_invalid email format_1'), 
    'invalid email format')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Cell Phone Number'), 
    'Cell Phone Number')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  15 cha'), 
    'must be no more than 15 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Home number if no cellph'), 
    'Home number if no cellphone')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  20 cha'), 
    'must be no more than 20 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_IBAN'), 'IBAN')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_invalid format'), 'invalid format')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Add any comments you fee'), 
    'Add any comments you feel IGL should know about customer, if none, leave blank.')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than 1000 ch'), 
    'must be no more than 1000 characters.')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_United States Of Americ'), 
    'United States Of America', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Street Part_streetPart'), 'Apart from counting words and characters,our online')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street Part'), 'Street Part')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than 50 char'), 
    'must be no more than 50 characters.')

not_run: WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), '')

not_run: WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), 'Apart from counting words')

not_run: WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Email_email'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/button_Next -- Add Utilty Data'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'), 'Zip')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_can only contain digits'), 
    'can only contain digits')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_United States Of Americ'), 
    'Italy', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Province'), 
    'Alessandria', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select City'), 'Alessandria', 
    false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Street Part'), 
    'LARGO', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_First Name_firstName'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Last Name_lastName'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Address_Address'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Street No_streetNum'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Email_email'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_PEC Email (Optional)_ema'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Cell Phone Number_cellPh'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Home number if no cellph'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_IBAN_txtIBAN'), '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you _1'), 
    '')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_First Name_firstName'), 'Shinto_Add')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Last Name_lastName'), 'Customer')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Street Part'), 
    'PIAZZA', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Address_Address'), 'Address')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Street No_streetNum'), '1234')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), '23231')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Province'), 
    'Alessandria', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select City'), 'Alessandria', 
    false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Email_email'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_PEC Email (Optional)_ema'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Cell Phone Number_cellPh'), '123456789')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Home number if no cellph'), '1234567890')

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Month'), '04', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Day                  01'), 
    '06', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Year                  2'), 
    '1994', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Birth Country'), 
    'United States Of America', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_IBAN_txtIBAN'), 'NL70ABNA0434144140')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you _5'), 
    'Test')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Account'), 'Account')

