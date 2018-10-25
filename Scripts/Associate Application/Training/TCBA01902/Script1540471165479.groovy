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

WebUI.click(findTestObject('Object Repository/Training/Page_Home  5-15/a_Training'))

WebUI.click(findTestObject('Object Repository/Training/Page_Home  5-15/a_How Tos'))

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/div_Instruction Page'), 'Instruction Page')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/h3_How to Add Customer (Italia'), 
    'How to Add Customer (Italian only)')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/h3_How to Add Associate (Itali'), 
    'How to Add Associate (Italian only)')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME INSERIRE UN NOVO UTENTE'), 
    'COME INSERIRE UN NOVO UTENTE ELETTRICO')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME INVITARE AMICI A DIVENT'), 
    'COME INVITARE AMICI A DIVENTARE ASSOCIATI')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME INSERIRE UN NUOVO UTENT'), 
    'COME INSERIRE UN NUOVO UTENTE GAS')

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME REGISTRARSI COME ASSOCI'), 
    'COME REGISTRARSI COME ASSOCIATO')

WebUI.click(findTestObject('Object Repository/Training/Page_Home  5-15/a_Training'))

