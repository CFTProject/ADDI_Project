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


suiteProperties.put('id', 'Test Suites/Defination_Group_Controller_API')

suiteProperties.put('name', 'Defination_Group_Controller_API')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\Defination_Group_Controller_API\\20190618_130543\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Defination_Group_Controller_API', suiteProperties, [new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response_with_valid_Values', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response_with_valid_Values',  [ 'description' : 'null' , 'owner' : 'null' , 'macro' : 'P49000E' , 'dgId' : '0000000001' , 'cobCopyBook' : 'P49000D' , 'typ' : 'null' ,  ]), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response_with_Empty_Values', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response_with_Empty_Values',  [ 'description' : '' , 'owner' : '' , 'macro' : '' , 'dgId' : '' , 'cobCopyBook' : '' , 'typ' : '' ,  ]), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response__with_Invalid_Values',  [ 'description' : 'kiju' , 'owner' : 'ikju' , 'macro' : 'PLOKIJ' , 'dgId' : '98767' , 'cobCopyBook' : 'NBHGVF' , 'typ' : 'kmj' ,  ]), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Post_Request', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Put_Request', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/Defination_Group_Controller_API/Defination_Group_Controller_Delete_Request_with_Invalid_Parameters',  null)])
