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

response = WS.sendRequest(findTestObject('Sim_Controller_API/Sim_Controller_Verify_Response_with_Empty_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].type', type)
WS.verifyElementPropertyValue(response, '[0].owner', owner)
WS.verifyElementPropertyValue(response, '[0].function', function)
WS.verifyElementPropertyValue(response, '[0].destination', destination)
WS.verifyElementPropertyValue(response, '[0].version', version)
WS.verifyElementPropertyValue(response, '[0].funcAvailable', funcAvailable)
WS.verifyElementPropertyValue(response, '[0].interfaceAct', interfaceAct)
WS.verifyElementPropertyValue(response, '[0].compNo', compNo)
WS.verifyElementPropertyValue(response, '[0].parameterN1', parameterN1)
WS.verifyElementPropertyValue(response, '[0].parameterN2', parameterN2)
WS.verifyElementPropertyValue(response, '[0].c1', c1)
WS.verifyElementPropertyValue(response, '[0].description', description)