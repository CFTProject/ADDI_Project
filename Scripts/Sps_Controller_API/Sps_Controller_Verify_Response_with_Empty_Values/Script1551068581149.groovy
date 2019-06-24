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

response = WS.sendRequest(findTestObject('Sps_Controller_API/Sps_Controller_Verify_Response_with_Empty_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].rpt.type', rpt_type)

WS.verifyElementPropertyValue(response, '[0].rpt.owner', rpt_owner)

WS.verifyElementPropertyValue(response, '[0].rpt.dsId1', rpt_dsId1)

WS.verifyElementPropertyValue(response, '[0].rpt.comp', rpt_comp)

WS.verifyElementPropertyValue(response, '[0].rpt.pass', rpt_pass)

WS.verifyElementPropertyValue(response, '[0].rpt.dsId2', rpt_dsId2)

WS.verifyElementPropertyValue(response, '[0].rpt.reportId', rpt_reportId)

WS.verifyElementPropertyValue(response, '[0].rpt.criticalRpt', rpt_criticalRpt)

WS.verifyElementPropertyValue(response, '[0].rpt.description', rpt_description)

WS.verifyElementPropertyValue(response, '[0].bor.type', bor_type)

WS.verifyElementPropertyValue(response, '[0].bor.noOfActForBor', bor_noOfActForBor)

WS.verifyElementPropertyValue(response, '[0].bor.listOfActForBor', bor_listOfActForBor)

WS.verifyElementPropertyValue(response, '[0].pro.type', pro_type)

WS.verifyElementPropertyValue(response, '[0].pro.noOfActForPro', pro_noOfActForPro)

WS.verifyElementPropertyValue(response, '[0].pro.listOfActForPro', pro_listOfActForPro)

WS.verifyElementPropertyValue(response, '[0].eor.type', eor_type)

WS.verifyElementPropertyValue(response, '[0].eor.noOfActForEor', eor_noOfActForEor)

WS.verifyElementPropertyValue(response, '[0].eor.listOfActForEor', eor_listOfActForEor)



