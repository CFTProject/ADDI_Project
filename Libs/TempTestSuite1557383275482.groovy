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


suiteProperties.put('id', 'Test Suites/Map_Controller_API')

suiteProperties.put('name', 'Map_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Map_Controller_API\\20190509_115750\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Map_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Verify_Response_with_valid_Values', 'Test Cases/Map_Controller_API/Map_Controller_Verify_Response_with_valid_Values',  [ 'description' : 'API ROUTING PCD 840001' , 'owner' : 'API' , 'mapName' : 'A40001M' , 'noOfDg' : '000' , 'device' : 'A' , 'b' : 'N' , 'a' : 'N' , 'type' : 'U' , 'linkname' : 'A40001MA' , 'z' : 'N' , 'y' : 'N' , 'x' : '' , 'language' : 'ENU' , 'compGroup' : 'ALL' , 'txn' : 'null' , 'mapType' : 'SCR' , 'dgNumbers' : '' , 'typ' : 'null' ,  ]), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Map_Controller_API/Map_Controller_Verify_Response_with_Empty_Values',  [ 'description' : '' , 'owner' : '' , 'mapName' : '' , 'noOfDg' : '' , 'device' : '' , 'b' : '' , 'a' : '' , 'type' : '' , 'linkname' : '' , 'z' : '' , 'y' : '' , 'x' : 'n' , 'language' : '' , 'compGroup' : '' , 'txn' : '' , 'mapType' : '' , 'dgNumbers' : 'HUYG' ,  ]), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Map_Controller_API/Map_Controller_Verify_Response__with_Invalid_Values',  [ 'description' : 'BHGYVF VGTFC CFRD' , 'owner' : 'NHB' , 'mapName' : 'LOKM' , 'noOfDg' : '8987' , 'device' : 'HUY' , 'b' : 'NMKJ' , 'a' : 'NHB' , 'type' : 'JHNB' , 'linkname' : 'MKJ' , 'z' : 'MKJI' , 'y' : 'MKIJ' , 'x' : 'KMJI' , 'language' : 'MNJ' , 'compGroup' : 'VGF' , 'txn' : 'LKOM' , 'mapType' : 'BGVF' , 'dgNumbers' : '9876' ,  ]), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Map_Controller_API/Map_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Post_Request', 'Test Cases/Map_Controller_API/Map_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Put_Request', 'Test Cases/Map_Controller_API/Map_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Map_Controller_API/Map_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Map_Controller_API/Map_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Map_Controller_API/Map_Controller_Delete_Request_with_Invalid_Parameters',  null)])
