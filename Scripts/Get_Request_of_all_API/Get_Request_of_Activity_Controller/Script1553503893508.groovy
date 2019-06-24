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

response = WS.sendRequest(findTestObject('Get_Request_of_all_API/Get_Request_of_Activity_Controller'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].activty', activty)

WS.verifyElementPropertyValue(response, '[0].owner', owner)

WS.verifyElementPropertyValue(response, '[0].activityId', activityId)

WS.verifyElementPropertyValue(response, '[0].activityType', activityType)

WS.verifyElementPropertyValue(response, '[0].description', description)

WS.verifyElementPropertyValue(response, '[0].disposition', disposition)

WS.verifyElementPropertyValue(response, '[0].databaseName', databaseName)

WS.verifyElementPropertyValue(response, '[0].mapName', mapName)

WS.verifyElementPropertyValue(response, '[0].service', service)

WS.verifyElementPropertyValue(response, '[0].programID', programID)

WS.verifyElementPropertyValue(response, '[0].linkName', linkName)

WS.verifyElementPropertyValue(response, '[0].language', language)


def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())

def programid = result[0].programID

def mapname = result[0].mapName



String Get_Request_of_Activity_Controller_url = "http://localhost:8080/api/program/getProgram/"+programid

String Get_Request_of_Map_Controller_url = "http://localhost:8080/api/map/getMap/"+mapname



GlobalVariable.Get_Request_of_Activity_Controller_url=Get_Request_of_Activity_Controller_url

println("GlobalVariable.Get_Request_of_Activity_Controller_url:-"+GlobalVariable.Get_Request_of_Activity_Controller_url)


GlobalVariable.Get_Request_of_Map_Controller_url=Get_Request_of_Map_Controller_url

println("GlobalVariable.Get_Request_of_Map_Controller_url:-"+GlobalVariable.Get_Request_of_Map_Controller_url)



/*RequestObject Get_Request_of_Activity_Controller = findTestObject('Object Repository/Get_Request_of_all_API/Get_Request_of_Program_Controller',
	[('Get_Request_of_Activity_Controller_url') : programid])
*/


