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


suiteProperties.put('id', 'Test Suites/Fps_Controller_API')

suiteProperties.put('name', 'Fps_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Fps_Controller_API\\20190719_152617\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Fps_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response_with_valid_Values', 'Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response_with_valid_Values',  [ 'linkactivity' : '0000027227' , 'functionSecurityLevel' : '0' , 'description' : 'BLBI -Liability/Bankruptcy INQ' , 'dblockActivity' : '0000027427' , 'fpskeySequence' : '' , 'highUseIndicator' : 'null' , 'statusCode' : '' , 'owner' : 'BOR' , 'function' : 'BLBI' , 'userEnrollment' : '00000' , 'efskey' : '' , 'application' : 'BOR' , 'fpskeyApplication' : '' , 'initType' : '' , 'type' : 'FPS' , 'sequence' : '000' , 'initActivity' : '0000000000' , 'displayFirst' : 'N' , 'establishedNewLevel' : '' , 'fpskeyFunction' : '' , 'dgAction' : 'null' , 'efsaction' : '' , 'screenId' : 'BLBI' , 'displayActivity' : '0000027627' ,  ]), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response_with_Empty_Values',  [ 'linkactivity' : '' , 'functionSecurityLevel' : '' , 'description' : '' , 'dblockActivity' : '' , 'fpskeySequence' : 'BHGYT' , 'highUseIndicator' : 'ghy' , 'statusCode' : '9878' , 'owner' : '' , 'function' : '' , 'userEnrollment' : '' , 'efskey' : 'yhu' , 'application' : '' , 'fpskeyApplication' : 'LKOIJ' , 'initType' : 'ASDE' , 'type' : '' , 'sequence' : '' , 'initActivity' : '' , 'displayFirst' : '' , 'establishedNewLevel' : 'NBHGV' , 'fpskeyFunction' : 'NHJBG' , 'dgAction' : 'ASDE' , 'efsaction' : 'bvg' , 'screenId' : '' , 'displayActivity' : '' ,  ]), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response__with_Invalid_Values',  [ 'linkactivity' : '89876' , 'functionSecurityLevel' : '3456' , 'description' : 'HBGVC DCGFV BHGY' , 'dblockActivity' : '9876' , 'fpskeySequence' : 'DFC' , 'highUseIndicator' : 'ED' , 'statusCode' : '98709' , 'owner' : 'BVHG' , 'function' : 'PLOK' , 'userEnrollment' : '23454' , 'efskey' : 'SDXCF' , 'application' : 'MKJI' , 'fpskeyApplication' : 'NJBH' , 'initType' : 'JNHJU' , 'type' : 'HNBG' , 'sequence' : '9878' , 'initActivity' : '987876' , 'displayFirst' : 'IKU' , 'establishedNewLevel' : 'JKMJN' , 'fpskeyFunction' : 'SXDC' , 'dgAction' : 'HBGV' , 'efsaction' : '345' , 'screenId' : 'MKJN' , 'displayActivity' : '9878765' ,  ]), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Fps_Controller_API/Fps_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Post_Request', 'Test Cases/Fps_Controller_API/Fps_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Put_Request', 'Test Cases/Fps_Controller_API/Fps_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Fps_Controller_API/Fps_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Fps_Controller_API/Fps_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Fps_Controller_API/Fps_Controller_Delete_Request_with_Invalid_Parameters',  null)])
