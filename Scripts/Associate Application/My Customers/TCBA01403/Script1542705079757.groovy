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

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Birth Date'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_(MMDDYYYY)'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Birth Country'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_IBAN'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/h3_Comment'), '')

WebUI.verifyElementText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Add any comments you fee'), 
    '')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_First Name'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Last Name'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_1'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Address'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_2'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street No'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_3'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Province'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_4'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_City'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_5'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_6'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Email'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_7'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Cell Phone Number'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_8'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Home number if no cellph'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_9'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Birth Date'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_(MMDDYYYY)'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_10'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_IBAN'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_is required_11'))

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

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_First Name'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  100 ch'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Last Name'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  100 ch_1'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Address'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  150 ch'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street No'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  10 cha'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than 5 chara'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Email'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_invalid email format'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_PEC Email (Optional)'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_invalid email format_1'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Cell Phone Number'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  15 cha'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Home number if no cellph'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than  20 cha'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_IBAN'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_invalid format'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Add any comments you fee'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than 1000 ch'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_United States Of Americ'), 
    'United States Of America', true)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Street Part_streetPart'), 'Apart from counting words and characters,our online')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Street Part'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_must be no more than 50 char'))

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), 'Apart from counting words and characters,our online')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/button_Next -- Add Utilty Data'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/label_Zip'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/p_can only contain digits'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_United States Of Americ'), 
    'Italy', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Province'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select City'), 'Alessandria', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Street Part'), 
    'LARGO', true)

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

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_First Name_firstName'), 'First')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Last Name_lastName'), 'Last')

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Street Part'), 
    'PIAZZA', true)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Address_Address'), 'Address')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Street No_streetNum'), '1234')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Zip_zip'), '23231')

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Province'), 
    'Alessandria', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select City'), 'Alessandria', 
    true)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Email_email'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_PEC Email (Optional)_ema'), 'shinto@vofoxsolutions.com')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Cell Phone Number_cellPh'), '123456789')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_Home number if no cellph'), '1234567890')

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Month'), '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Day                  01'), 
    '06', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Year                  2'), 
    '1994', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/select_Select Birth Country'), 
    'United States Of America', true)

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/input_IBAN_txtIBAN'), 'NL70ABNA0434144140')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you _2'), 
    'T')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you _3'), 
    'Te')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you _4'), 
    'Tes')

WebUI.setText(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/textarea_Add any comments you _5'), 
    'Test')

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Next -- Add Utilty Data'))

WebUI.click(findTestObject('Object Repository/My Customers/Page_My Customers  5-15/span_Account'))

