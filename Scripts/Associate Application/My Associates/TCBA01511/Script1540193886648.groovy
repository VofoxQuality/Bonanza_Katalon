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

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Add Associate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Country'), 
    'United States Of America', true)

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStreetPart'), 'Lorem Ipsum is simply dummy text of the printing an')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStreetName'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the i')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStreetNum'), 'Lorem Ipsum is simply dummy text of the printing an')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtCity'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type as')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtStateCode'), 'Lorem Ipsum is simply dummy text of the printing an')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtZip'), '111111')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtLandPhone'), '1234567891234567')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtMobilePhone'), '1234567891234567')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtEmail'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the t')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_HouseBuilding Num'), 
    'House/Building Num')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 50 char_1'), 
    'must be no more than 50 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Street Name'), 'Street Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than  100 ch_1'), 
    'must be no more than 100 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Type (StDrBlvdWay)'), 
    'Type (St/Dr/Blvd/Way)')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 50 char_2'), 
    'must be no more than 50 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_City'), 'City')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 200 cha_2'), 
    'must be no more than 200 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_StateProvince'), 
    'State/Province')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 50 char_3'), 
    'must be no more than 50 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Zip'), 'Zip')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 5 chara'), 
    'must be no more than 5 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Home Phone'), 'Home Phone')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than  15 cha'), 
    'must be no more than 15 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Mobile'), 'Mobile')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than  15 cha_1'), 
    'must be no more than 15 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 300 cha'), 
    'must be no more than 300 characters.')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

