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


suiteProperties.put('id', 'Test Suites/Ccp_Controller_API')

suiteProperties.put('name', 'Ccp_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Ccp_Controller_API\\20190506_175607\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Ccp_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response_with_valid_Values', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response_with_valid_Values',  [ 'description' : 'BELOW MARKET RATE SET TO ZERO' , 'owner' : 'ILP' , 'messageCategory' : '' , 'ccpid' : '10018' , 'application' : '00000' , 'type' : 'null' ,  ]), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response_with_Empty_Values',  [ 'description' : '' , 'owner' : '' , 'messageCategory' : 'gtfv' , 'ccpid' : '' , 'application' : '' , 'type' : '' ,  ]), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response__with_Invalid_Values',  [ 'description' : 'SGBDVGF' , 'owner' : 'LKJHN' , 'messageCategory' : 'MNJH' , 'ccpid' : 'fgvfc' , 'application' : '098723' , 'type' : 'yhgt' ,  ]), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Post_Request', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Put_Request', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Ccp_Controller_API/Ccp_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Ccp_Controller_API/Ccp_Controller_Delete_Request_with_Invalid_Parameters',  null)])
