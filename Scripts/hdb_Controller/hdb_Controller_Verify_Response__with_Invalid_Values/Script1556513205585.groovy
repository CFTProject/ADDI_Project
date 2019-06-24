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

response = WS.sendRequest(findTestObject('hdb_Controller/hdb_Controller_Verify_Response__with_Invalid_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].hdb.type', hdb_type)

WS.verifyElementPropertyValue(response, '[0].hdb.owner', hdb_owner)

WS.verifyElementPropertyValue(response, '[0].hdb.databaseId', hdb_databaseId)

WS.verifyElementPropertyValue(response, '[0].hdb.coGroup', hdb_coGroup)

WS.verifyElementPropertyValue(response, '[0].hdb.databaseType', hdb_databaseType)

WS.verifyElementPropertyValue(response, '[0].hdb.description', hdb_description)

WS.verifyElementPropertyValue(response, '[0].hdb.readOnlyDbid', hdb_readOnlyDbid)

WS.verifyElementPropertyValue(response, '[0].hdb.relationalActy', hdb_relationalActy)

WS.verifyElementPropertyValue(response, '[0].hdb.dataPropagation', hdb_dataPropagation)

WS.verifyElementPropertyValue(response, '[0].vsm.type', vsm_type)

WS.verifyElementPropertyValue(response, '[0].vsm.version', vsm_version)

WS.verifyElementPropertyValue(response, '[0].vsm.ddname', vsm_ddname)

WS.verifyElementPropertyValue(response, '[0].vsm.datasetFormat', vsm_datasetFormat)

WS.verifyElementPropertyValue(response, '[0].vsm.maxRecSize', vsm_maxRecSize)

WS.verifyElementPropertyValue(response, '[0].vsm.password', vsm_password)

WS.verifyElementPropertyValue(response, '[0].ims.type', ims_type)

WS.verifyElementPropertyValue(response, '[0].ims.dlitype', ims_dlitype)

WS.verifyElementPropertyValue(response, '[0].ims.posParameter', ims_posParameter)

WS.verifyElementPropertyValue(response, '[0].ims.maxKeylen', ims_maxKeylen)

WS.verifyElementPropertyValue(response, '[0].ims.dbdName', ims_dbdName)

WS.verifyElementPropertyValue(response, '[0].mod.type', mod_type)

WS.verifyElementPropertyValue(response, '[0].mod.modelDbId', mod_modelDbId)

WS.verifyElementPropertyValue(response, '[0].mod.modelCoGrp', mod_modelCoGrp)

WS.verifyElementPropertyValue(response, '[0].mod.modelReason', mod_modelReason)

WS.verifyElementPropertyValue(response, '[0].dgList', dgList)

