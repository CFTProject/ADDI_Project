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

response = WS.sendRequest(findTestObject('Activity_Controller_API/Activity_Controller_Verify_Response__with_Invalid_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].owner', owner)

WS.verifyElementPropertyValue(response, '[0].activityId', activityId)

WS.verifyElementPropertyValue(response, '[0].activityType', activityType)

WS.verifyElementPropertyValue(response, '[0].description', description)

WS.verifyElementPropertyValue(response, '[0].disposition', disposition)

WS.verifyElementPropertyValue(response, '[0].databaseName', databaseName)

WS.verifyElementPropertyValue(response, '[0].dataBaseAction', dataBaseAction)

WS.verifyElementPropertyValue(response, '[0].mapName', mapName)

WS.verifyElementPropertyValue(response, '[0].programID', programID)

WS.verifyElementPropertyValue(response, '[0].programName', programName)

WS.verifyElementPropertyValue(response, '[0].language', language)

WS.verifyElementPropertyValue(response, '[0].count', count)

WS.verifyElementPropertyValue(response, '[0].listADG', listADG)
