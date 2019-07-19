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


suiteProperties.put('id', 'Test Suites/Program_Controller_API')

suiteProperties.put('name', 'Program_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Program_Controller_API\\20190719_153301\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Program_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Verify_Response_with_valid_Values', 'Test Cases/Program_Controller_API/Program_Controller_Verify_Response_with_valid_Values',  [ 'pdg_number' : 'null' , 'pgm_type' : 'Pgm' , 'pgm_pgmId' : '0000000031' , 'pgm_language' : 'ASM' , 'pac_type' : 'Pac' , 'pgm_status' : 'N' , 'pac_number' : '001' , 'pac_act_NumbersList' : '0000000112 0000000113 0000000114' , 'pdg_type' : 'Pdg' , 'pgm_description' : 'RCS Owner-Hierarchy Edits (alias=R60030)' , 'pgm_linkName' : 'R60031' , 'pdg_dgNumberList' : 'null' , 'pgm_owner' : 'RCS' ,  ]), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Program_Controller_API/Program_Controller_Verify_Response_with_Empty_Values',  [ 'pdg_number' : '' , 'pgm_type' : '' , 'pgm_pgmId' : '' , 'pgm_language' : '' , 'pac_type' : '' , 'pgm_status' : '' , 'pac_number' : '' , 'pac_act_NumbersList' : '' , 'pdg_type' : '' , 'pgm_description' : '' , 'pgm_linkName' : '' , 'pdg_dgNumberList' : '' , 'pgm_owner' : '' ,  ]), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Program_Controller_API/Program_Controller_Verify_Response__with_Invalid_Values',  [ 'pdg_number' : 'BVGF' , 'pgm_type' : 'HBGV' , 'pgm_pgmId' : '4567456' , 'pgm_language' : 'SDFR' , 'pac_type' : 'FGH' , 'pgm_status' : 'B' , 'pac_number' : 'CFDE' , 'pac_act_NumbersList' : 'NBHGY' , 'pdg_type' : 'FGTR' , 'pgm_description' : 'ASFHB HBGVF JNHBG' , 'pgm_linkName' : 'd3456' , 'pdg_dgNumberList' : '7654556' , 'pgm_owner' : 'SDXC' ,  ]), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Program_Controller_API/Program_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Post_Request', 'Test Cases/Program_Controller_API/Program_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Put_Request', 'Test Cases/Program_Controller_API/Program_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Program_Controller_API/Program_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Program_Controller_API/Program_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Program_Controller_API/Program_Controller_Delete_Request_with_Invalid_Parameters',  null)])
