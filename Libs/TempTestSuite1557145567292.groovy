import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Activity_Controller_API')

suiteProperties.put('name', 'Activity_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Activity_Controller_API\\20190506_175602\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Activity_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response_with_valid_Values', 'Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response_with_valid_Values',  [ 'description' : 'Dynamically Release a DG (ID in TCB$XDG)' , 'owner' : 'PEM' , 'mapName' : '' , 'programID' : '' , 'count' : '01' , 'listADG' : 'null' , 'disposition' : '' , 'dataBaseAction' : '' , 'activityId' : '0000000005' , 'language' : '' , 'activityType' : 'WORK' , 'databaseName' : '' , 'programName' : '' ,  ]), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response_with_Empty_Values',  [ 'description' : '' , 'owner' : '' , 'mapName' : 'WSDE' , 'programID' : 'EDFC' , 'count' : '' , 'listADG' : '' , 'disposition' : 'JNHGB' , 'dataBaseAction' : 'RFDC' , 'activityId' : '' , 'language' : 'EDFR' , 'activityType' : '' , 'databaseName' : 'KMJN' , 'programName' : 'XCDF' ,  ]), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response__with_Invalid_Values',  [ 'description' : 'MKJIUNB' , 'owner' : 'PEMSA' , 'mapName' : 'KMJN' , 'programID' : '09878776' , 'count' : 'edfr' , 'listADG' : 'vfg' , 'disposition' : 'UJHYG' , 'dataBaseAction' : 'MKJNG' , 'activityId' : '000098765456' , 'language' : 'OKIJN' , 'activityType' : 'GVBHF' , 'databaseName' : 'JNHBG' , 'programName' : 'MKNJH' ,  ]), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Activity_Controller_API/Activity_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Post_Request', 'Test Cases/Activity_Controller_API/Activity_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Put_Request', 'Test Cases/Activity_Controller_API/Activity_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Activity_Controller_API/Activity_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Activity_Controller_API/Activity_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Activity_Controller_API/Activity_Controller_Delete_Request_with_Invalid_Parameters',  null)])
