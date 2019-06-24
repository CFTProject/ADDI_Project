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

response = WS.sendRequest(findTestObject('Sdb_Controller_API/Sdb_Controller_Verify_Response_with_Empty_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].typ', typ)
WS.verifyElementPropertyValue(response, '[0].own', own)
WS.verifyElementPropertyValue(response, '[0].sdbId', sdbId)
WS.verifyElementPropertyValue(response, '[0].description', description)
WS.verifyElementPropertyValue(response, '[0].filetyp', filetyp)
WS.verifyElementPropertyValue(response, '[0].deviceClass', deviceClass)
WS.verifyElementPropertyValue(response, '[0].accessMethod', accessMethod)
WS.verifyElementPropertyValue(response, '[0].recFmt', recFmt)
WS.verifyElementPropertyValue(response, '[0].logicalRecLength', logicalRecLength)
WS.verifyElementPropertyValue(response, '[0].ddName', ddName )
WS.verifyElementPropertyValue(response, '[0].recFm', recFm)
WS.verifyElementPropertyValue(response, '[0].blockSize', blockSize)
WS.verifyElementPropertyValue(response, '[0].status', status)
