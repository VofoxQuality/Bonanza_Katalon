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

WebUI.selectOptionByValue(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/select_Select Birth Country'), 
    'United States Of America', true)

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtFirstName'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type as')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtLastName'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type as')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtBirthStateCode'), 'Lorem Ipsum is simply dummy text of the printing asLorem Ipsum is simply dummy text of the printing as')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtBirthCity'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 15111')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtPersonalTaxNum'), 'LOREMIPSUMISSIMPLYDUMMYTEXTOFTHEPRINTINGANDTYPESETTINGINDUSTRY.LOREMIPSUMASBEENTHEIUU')

WebUI.setText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/input_txtBusinessTaxNum'), 'LOREMIP SUMISSIMPLYLOREMIPSUMISSIMPLYDUMMYTEXTOFTHEPRINTINGANDTYPESETTINGINDUSTRY.LOREMIPSUMASBEENTHEIUULOREMIPSUMISSIMPLYDUMMYTEXTOFTHEPRINTINGANDTYPESETTINGINDUSTRY.LOREMIPSUMASBEENTHEIUUDUMMYTEXTOFTHEPRINTINGANDTYPESETTINGINDUSTRY.LOREMIPSUMASBEENTHEIUU')

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 200 cha'), 
    'must be no more than 200 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 200 cha_1'), 
    'must be no more than 200 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Birth State'), 'Birth State')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 50 char'), 
    'must be no more than 50 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Birth City'), 'Birth City')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than  150 ch'), 
    'must be no more than 150 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Personal Tax Num'), 
    'Personal Tax Num')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than 16 char'), 
    'must be no more than 16 characters.')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/label_Business Tax Num'), 
    'Business Tax Num')

WebUI.verifyElementText(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/p_must be no more than  100 ch'), 
    'must be no more than 100 characters.')

WebUI.verifyTextPresent('First Name must be no more than 200 characters.', false)

WebUI.verifyTextPresent('Last Name must be no more than 200 characters.', false)

WebUI.verifyTextPresent('Personal Tax Num must be no more than 16 characters.', false)

WebUI.verifyTextPresent('Business Tax Num must be no more than 100 characters.', false)

WebUI.verifyTextPresent('Birth State must be no more than 50 characters.', false)

WebUI.verifyTextPresent('Birth City must be no more than 150 characters.', false)

WebUI.click(findTestObject('Object Repository/My Associates/Page_My Associates  5-15/span_Cancel'))

