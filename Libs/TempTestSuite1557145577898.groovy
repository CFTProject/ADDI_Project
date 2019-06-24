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


suiteProperties.put('id', 'Test Suites/hdb_Controller')

suiteProperties.put('name', 'hdb_Controller')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\ADDI_Project\\Reports\\hdb_Controller\\20190506_175617\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/hdb_Controller', suiteProperties, [new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Verify_Response_with_valid_Values', 'Test Cases/hdb_Controller/hdb_Controller_Verify_Response_with_valid_Values',  [ 'hdb_type' : 'HDB' , 'vsm_maxRecSize' : 'null' , 'hdb_owner' : 'CIS' , 'ims_posParameter' : 'null' , 'ims_dbdName' : 'null' , 'hdb_databaseType' : 'DFLT' , 'mod_modelDbId' : 'CHF' , 'hdb_description' : 'READ ONLY - CUSTOMER HIERARCHY FILE' , 'hdb_relationalActy' : '0000000000' , 'vsm_type' : 'VSM' , 'mod_modelCoGrp' : 'ALL' , 'dgList' : 'null' , 'ims_maxKeylen' : 'null' , 'vsm_version' : 'null' , 'hdb_databaseId' : 'CHFIN' , 'hdb_coGroup' : 'ALL' , 'ims_type' : 'IMS' , 'hdb_dataPropagation' : '0000000000' , 'mod_type' : 'MOD' , 'ims_dlitype' : 'null' , 'vsm_datasetFormat' : 'null' , 'vsm_ddname' : 'null' , 'vsm_password' : 'null' , 'mod_modelReason' : 'DUP' , 'hdb_readOnlyDbid' : '' ,  ]), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Verify_Response_with_Empty_Values', 'Test Cases/hdb_Controller/hdb_Controller_Verify_Response_with_Empty_Values',  [ 'hdb_type' : '' , 'vsm_maxRecSize' : '' , 'hdb_owner' : '' , 'ims_posParameter' : '' , 'ims_dbdName' : '' , 'hdb_databaseType' : '' , 'mod_modelDbId' : '' , 'hdb_description' : '' , 'hdb_relationalActy' : '' , 'vsm_type' : '' , 'mod_modelCoGrp' : '' , 'dgList' : '' , 'ims_maxKeylen' : '' , 'vsm_version' : '' , 'hdb_databaseId' : '' , 'hdb_coGroup' : '' , 'ims_type' : '' , 'hdb_dataPropagation' : '' , 'mod_type' : '' , 'ims_dlitype' : '' , 'vsm_datasetFormat' : '' , 'vsm_ddname' : 'DFDFG' , 'vsm_password' : '' , 'mod_modelReason' : '' , 'hdb_readOnlyDbid' : 'SDCF' ,  ]), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Verify_Response__with_Invalid_Values', 'Test Cases/hdb_Controller/hdb_Controller_Verify_Response__with_Invalid_Values',  [ 'hdb_type' : 'HJHG' , 'vsm_maxRecSize' : 'FVGB' , 'hdb_owner' : 'DCF' , 'ims_posParameter' : 'GDFGDG' , 'ims_dbdName' : 'DFGDFG' , 'hdb_databaseType' : 'LKMJ' , 'mod_modelDbId' : 'RGER' , 'hdb_description' : 'BHGVF CHBVGF DNJCHF' , 'hdb_relationalActy' : '877654' , 'vsm_type' : 'VFGC' , 'mod_modelCoGrp' : 'RGRFH' , 'dgList' : '997845' , 'ims_maxKeylen' : 'DGDFG' , 'vsm_version' : '56' , 'hdb_databaseId' : 'EDFR' , 'hdb_coGroup' : 'WSDE' , 'ims_type' : 'MKJNH' , 'hdb_dataPropagation' : '9887665' , 'mod_type' : 'DGDFG' , 'ims_dlitype' : 'JKFJK' , 'vsm_datasetFormat' : 'NMJHB' , 'vsm_ddname' : 'UJKNH' , 'vsm_password' : 'FGT' , 'mod_modelReason' : 'RGRH' , 'hdb_readOnlyDbid' : 'FVGB' ,  ]), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Verify_Response_with_Invalid_parameters', 'Test Cases/hdb_Controller/hdb_Controller_Verify_Response_with_Invalid_parameters',  null), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Post_Request', 'Test Cases/hdb_Controller/hdb_Controller_Post_Request',  null), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Put_Request', 'Test Cases/hdb_Controller/hdb_Controller_Put_Request',  null), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Delete_Request_with_Valid_Parameters', 'Test Cases/hdb_Controller/hdb_Controller_Delete_Request_with_Valid_Parameters',  null), new TestCaseBinding('Test Cases/hdb_Controller/hdb_Controller_Delete_Request_with_Invalid_Parameters', 'Test Cases/hdb_Controller/hdb_Controller_Delete_Request_with_Invalid_Parameters',  null)])
