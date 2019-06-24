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

response = WS.sendRequest(findTestObject('Program_Controller_API/Program_Controller_Verify_Response_with_Empty_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].pgm.type', pgm_type)
WS.verifyElementPropertyValue(response, '[0].pgm.owner', pgm_owner)
WS.verifyElementPropertyValue(response, '[0].pgm.pgmId', pgm_pgmId)
WS.verifyElementPropertyValue(response, '[0].pgm.linkName', pgm_linkName)
WS.verifyElementPropertyValue(response, '[0].pgm.description', pgm_description)
WS.verifyElementPropertyValue(response, '[0].pgm.language', pgm_language)
WS.verifyElementPropertyValue(response, '[0].pgm.status', pgm_status)
WS.verifyElementPropertyValue(response, '[0].pdg.type', pdg_type)
WS.verifyElementPropertyValue(response, '[0].pdg.number', pdg_number)
WS.verifyElementPropertyValue(response, '[0].pdg.dgNumberList', pdg_dgNumberList)
WS.verifyElementPropertyValue(response, '[0].pac.type', pac_type)
WS.verifyElementPropertyValue(response, '[0].pac.number', pac_number)
WS.verifyElementPropertyValue(response, '[0].pac.actNumbersList', pac_act_NumbersList)