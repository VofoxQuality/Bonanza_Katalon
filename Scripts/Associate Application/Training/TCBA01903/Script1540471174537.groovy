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

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME INSERIRE UN NOVO UTENTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/div_Come Aggiungere Utente Ele'), 
    'Come Aggiungere Utente Elettrico English')

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_How Tos'))

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME INVITARE AMICI A DIVENT'))

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/div_Come Invitare Amici Englis'), 
    'Come Invitare Amici English')

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_How Tos'))

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME INSERIRE UN NUOVO UTENT'))

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/div_Come Inserire Utente Gas E'), 
    'Come Inserire Utente Gas English')

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_How Tos'))

WebUI.click(findTestObject('Object Repository/Training/Page_How Tos  5-15/a_COME REGISTRARSI COME ASSOCI'))

WebUI.verifyElementText(findTestObject('Object Repository/Training/Page_How Tos  5-15/div_Come Registrarsi Come Asso'), 
    'Come Registrarsi Come Associato English')

WebUI.click(findTestObject('Object Repository/Training/Page_Home  5-15/a_Training'))

WebUI.click(findTestObject('Smoke_Test/Page_My Associates  5-15/Select Home'))

