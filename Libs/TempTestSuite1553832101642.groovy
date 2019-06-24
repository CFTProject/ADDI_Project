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


suiteProperties.put('id', 'Test Suites/Verify_Response_with_chain_rule')

suiteProperties.put('name', 'Verify_Response_with_chain_rule')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Verify_Response_with_chain_rule\\20190329_093135\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Verify_Response_with_chain_rule', suiteProperties, [new TestCaseBinding('Test Cases/Get_Request_of_all_API/Get_Request_of_Activity_Controller', 'Test Cases/Get_Request_of_all_API/Get_Request_of_Activity_Controller',  [ 'disposition' : '' , 'description' : 'End-Program' , 'activty' : 'null' , 'activityId' : '0000000001' , 'owner' : 'PEM' , 'mapName' : '' , 'programID' : '0000000031' , 'service' : '' , 'language' : 'PL/1Program' , 'activityType' : 'END' , 'databaseName' : '' , 'linkName' : '' ,  ]), new TestCaseBinding('Test Cases/Get_Request_of_all_API/Get_Request_of_Program_Controller', 'Test Cases/Get_Request_of_all_API/Get_Request_of_Program_Controller',  [ 'pdg_number' : 'null' , 'pgm_type' : 'null' , 'pgm_pgmId' : '0000000031' , 'pgm_language' : 'ASM' , 'pac_type' : 'null' , 'pgm_status' : 'N' , 'pac_number' : 'null' , 'pac_act_NumbersList' : 'null' , 'pdg_type' : 'null' , 'pgm_description' : 'RCS Owner-Hierarchy Edits (alias=R60030)' , 'pgm_linkName' : 'R60031' , 'pdg_dgNumberList' : '0000000006 0000000009' , 'pgm_owner' : 'RCS' ,  ])])
