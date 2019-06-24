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


suiteProperties.put('id', 'Test Suites/Sdb_Controller_API')

suiteProperties.put('name', 'Sdb_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Sdb_Controller_API\\20190509_115801\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Sdb_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response_with_valid_Values', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response_with_valid_Values',  [ 'recFmt' : 'FIXED' , 'description' : 'CIS ADF SEQ DRIVER CONTROL CARDS - INPUT' , 'accessMethod' : 'QSAM' , 'ddName' : 'ADFICTL' , 'recFm' : 'FB' , 'own' : 'CIS' , 'deviceClass' : 'DISK' , 'status' : 'N' , 'logicalRecLength' : '00080' , 'blockSize' : '00000' , 'filetyp' : 'INPUT' , 'sdbId' : 'ADFICTL' , 'typ' : 'SDB' ,  ]), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response_with_Empty_Values',  [ 'recFmt' : '' , 'description' : '' , 'accessMethod' : '' , 'ddName' : '' , 'recFm' : '' , 'own' : '' , 'deviceClass' : '' , 'status' : '' , 'logicalRecLength' : '' , 'blockSize' : '' , 'filetyp' : '' , 'sdbId' : '' , 'typ' : '' ,  ]), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response__with_Invalid_Values',  [ 'recFmt' : 'MJNH' , 'description' : 'NJHBG' , 'accessMethod' : 'IKJU' , 'ddName' : 'JNHBG' , 'recFm' : 'JHN' , 'own' : 'DFG' , 'deviceClass' : 'BHGF' , 'status' : 'Y' , 'logicalRecLength' : '3764' , 'blockSize' : '9876' , 'filetyp' : 'IJUH' , 'sdbId' : 'ERTGF' , 'typ' : 'ASD' ,  ]), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Post_Request', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Put_Request', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Sdb_Controller_API/Sdb_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Sdb_Controller_API/Sdb_Controller_Delete_Request_with_Invalid_Parameters',  null)])
