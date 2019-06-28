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


suiteProperties.put('id', 'Test Suites/Sim_Controller_API')

suiteProperties.put('name', 'Sim_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Sim_Controller_API\\20190628_093618\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Sim_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response_with_valid_Values', 'Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response_with_valid_Values',  [ 'c1' : '00000' , 'description' : '' , 'compNo' : '0000025062' , 'interfaceAct' : 'Y' , 'parameterN2' : '00000' , 'owner' : 'CIS' , 'parameterN1' : '0000000000' , 'function' : 'ACAC-DL' , 'destination' : 'CIS' , 'funcAvailable' : '8611' , 'version' : '00000' , 'type' : 'null' ,  ]), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response_with_Empty_Values',  [ 'c1' : '' , 'description' : 'sdfc' , 'compNo' : '' , 'interfaceAct' : '' , 'parameterN2' : '' , 'owner' : '' , 'parameterN1' : '' , 'function' : '' , 'destination' : '' , 'funcAvailable' : '' , 'version' : '' , 'type' : '' ,  ]), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response__with_Invalid_Values',  [ 'c1' : '45678' , 'description' : 'JHNBH' , 'compNo' : '876567' , 'interfaceAct' : 'JK' , 'parameterN2' : '98765' , 'owner' : 'NHBG' , 'parameterN1' : '0983456' , 'function' : 'JNHU' , 'destination' : 'UHY' , 'funcAvailable' : '9876' , 'version' : '0987' , 'type' : 'JNHB' ,  ]), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Sim_Controller_API/Sim_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Post_Request', 'Test Cases/Sim_Controller_API/Sim_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Put_Request', 'Test Cases/Sim_Controller_API/Sim_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Sim_Controller_API/Sim_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Sim_Controller_API/Sim_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Sim_Controller_API/Sim_Controller_Delete_Request_with_Invalid_Parameters',  null)])
