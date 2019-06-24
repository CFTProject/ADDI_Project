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

response = WS.sendRequest(findTestObject('Map_Controller_API/Map_Controller_Verify_Response_with_Empty_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].typ', typ)

WS.verifyElementPropertyValue(response, '[0].owner', owner)

WS.verifyElementPropertyValue(response, '[0].language', language)

WS.verifyElementPropertyValue(response, '[0].mapName', mapName)

WS.verifyElementPropertyValue(response, '[0].device', device)

WS.verifyElementPropertyValue(response, '[0].compGroup', compGroup)

WS.verifyElementPropertyValue(response, '[0].description', description)

WS.verifyElementPropertyValue(response, '[0].linkname', linkname)

WS.verifyElementPropertyValue(response, '[0].type', type)

WS.verifyElementPropertyValue(response, '[0].txn', txn)

WS.verifyElementPropertyValue(response, '[0].a', a)

WS.verifyElementPropertyValue(response, '[0].b', b)

WS.verifyElementPropertyValue(response, '[0].x', x)

WS.verifyElementPropertyValue(response, '[0].y', y)

WS.verifyElementPropertyValue(response, '[0].z', z)

WS.verifyElementPropertyValue(response, '[0].mapType', mapType)

WS.verifyElementPropertyValue(response, '[0].noOfDg', noOfDg)

WS.verifyElementPropertyValue(response, '[0].dgNumbers', dgNumbers)