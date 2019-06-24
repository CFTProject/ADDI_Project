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

response = WS.sendRequest(findTestObject('Fps_Controller_API/Fps_Controller_Verify_Response__with_Invalid_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].type', type)


WS.verifyElementPropertyValue(response, '[0].owner', owner)

WS.verifyElementPropertyValue(response, '[0].application', application)

WS.verifyElementPropertyValue(response, '[0].function', function)

WS.verifyElementPropertyValue(response, '[0].sequence', sequence)

WS.verifyElementPropertyValue(response, '[0].screenId', screenId)

WS.verifyElementPropertyValue(response, '[0].description', description)

WS.verifyElementPropertyValue(response, '[0].statusCode', statusCode)

WS.verifyElementPropertyValue(response, '[0].xyz', xyz)

WS.verifyElementPropertyValue(response, '[0].initActivity', initActivity)

WS.verifyElementPropertyValue(response, '[0].initType', initType)

WS.verifyElementPropertyValue(response, '[0].displayFirst', displayFirst)

WS.verifyElementPropertyValue(response, '[0].displayActivity', displayActivity)

WS.verifyElementPropertyValue(response, '[0].dblockActivity', dblockActivity)

WS.verifyElementPropertyValue(response, '[0].linkactivity', linkactivity)

WS.verifyElementPropertyValue(response, '[0].userEnrollment', userEnrollment)

WS.verifyElementPropertyValue(response, '[0].establishedNewLevel', establishedNewLevel)

WS.verifyElementPropertyValue(response, '[0].fpskeyApplication', fpskeyApplication)

WS.verifyElementPropertyValue(response, '[0].fpskeyFunction', fpskeyFunction)

WS.verifyElementPropertyValue(response, '[0].fpskeySequence', fpskeySequence)

WS.verifyElementPropertyValue(response, '[0].pqr', pqr)

WS.verifyElementPropertyValue(response, '[0].efskey', efskey)

WS.verifyElementPropertyValue(response, '[0].efsaction', efsaction)

WS.verifyElementPropertyValue(response, '[0].functionSecurityLevel', functionSecurityLevel)



