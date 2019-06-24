package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object type
     
    /**
     * <p></p>
     */
    public static Object owner
     
    /**
     * <p></p>
     */
    public static Object application
     
    /**
     * <p></p>
     */
    public static Object description
     
    /**
     * <p></p>
     */
    public static Object messageCategory
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object programID
     
    /**
     * <p></p>
     */
    public static Object activityid
     
    /**
     * <p></p>
     */
    public static Object Get_Request_of_Activity_Controller_url
     
    /**
     * <p></p>
     */
    public static Object Get_Request_of_Map_Controller_url
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['type' : '', 'owner' : '', 'application' : '', 'description' : '', 'messageCategory' : '', 'url' : '', 'programID' : '', 'activityid' : findTestData('ADDI_TestData/Activity_Controller_TestDatas').getValue(1, 1), 'Get_Request_of_Activity_Controller_url' : '', 'Get_Request_of_Map_Controller_url' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        type = selectedVariables["type"]
        owner = selectedVariables["owner"]
        application = selectedVariables["application"]
        description = selectedVariables["description"]
        messageCategory = selectedVariables["messageCategory"]
        url = selectedVariables["url"]
        programID = selectedVariables["programID"]
        activityid = selectedVariables["activityid"]
        Get_Request_of_Activity_Controller_url = selectedVariables["Get_Request_of_Activity_Controller_url"]
        Get_Request_of_Map_Controller_url = selectedVariables["Get_Request_of_Map_Controller_url"]
        
    }
}
