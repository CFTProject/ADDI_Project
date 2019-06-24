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


suiteProperties.put('id', 'Test Suites/Sps_Controller_API')

suiteProperties.put('name', 'Sps_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Sps_Controller_API\\20190624_131852\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Sps_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response_with_valid_Values', 'Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response_with_valid_Values',  [ 'rpt_dsId1' : '007922' , 'rpt_criticalRpt' : 'N' , 'rpt_reportId' : '00122' , 'eor_listOfActForEor' : 'listOfActForEor' , 'pro_type' : 'null' , 'rpt_type' : 'null' , 'bor_listOfActForBor' : '0000007627' , 'rpt_comp' : 'DFLT' , 'bor_type' : 'null' , 'eor_noOfActForEor' : 'noOfActForEor' , 'pro_listOfActForPro' : 'listOfActForPro' , 'rpt_pass' : '0' , 'rpt_description' : 'TRANSACTION WAREHOUSE CONTROL' , 'pro_noOfActForPro' : 'noOfActForPro' , 'rpt_owner' : 'IDS' , 'bor_noOfActForBor' : '001' , 'rpt_dsId2' : '07922' , 'eor_type' : 'null' ,  ]), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response_with_Empty_Values',  [ 'rpt_dsId1' : '' , 'rpt_criticalRpt' : '' , 'rpt_reportId' : '' , 'eor_listOfActForEor' : '' , 'pro_type' : '' , 'rpt_type' : '' , 'bor_listOfActForBor' : '' , 'rpt_comp' : '' , 'bor_type' : '' , 'eor_noOfActForEor' : '' , 'pro_listOfActForPro' : '' , 'rpt_pass' : '' , 'rpt_description' : '' , 'pro_noOfActForPro' : '' , 'rpt_owner' : '' , 'bor_noOfActForBor' : '' , 'rpt_dsId2' : '' , 'eor_type' : '' ,  ]), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response__with_Invalid_Values',  [ 'rpt_dsId1' : 'JUHN' , 'rpt_criticalRpt' : 'DFCV' , 'rpt_reportId' : '45678' , 'eor_listOfActForEor' : 'MKNJHBF' , 'pro_type' : 'NJHFBGV' , 'rpt_type' : 'NJHBF' , 'bor_listOfActForBor' : '987647563' , 'rpt_comp' : 'BHGY' , 'bor_type' : 'NBHVF' , 'eor_noOfActForEor' : 'BNHVFG' , 'pro_listOfActForPro' : 'BVCGFD' , 'rpt_pass' : '098' , 'rpt_description' : 'REJECTED CURRENCY  MAINTENDGBCHFV' , 'pro_noOfActForPro' : 'NJBHFV' , 'rpt_owner' : 'KMJN' , 'bor_noOfActForBor' : '354674' , 'rpt_dsId2' : '78987' , 'eor_type' : 'NBHGVDF' ,  ]), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Sps_Controller_API/Sps_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Post_Request', 'Test Cases/Sps_Controller_API/Sps_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Put_Request', 'Test Cases/Sps_Controller_API/Sps_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Sps_Controller_API/Sps_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Sps_Controller_API/Sps_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Sps_Controller_API/Sps_Controller_Delete_Request_with_Invalid_Parameters',  null)])
