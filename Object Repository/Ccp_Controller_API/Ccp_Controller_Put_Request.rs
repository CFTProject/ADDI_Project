<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Ccp_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>0d9cd34d-8ec7-4d2b-a93b-39ade9431dfb</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;application\&quot;: \&quot;\&quot;,\n  \&quot;ccpid\&quot;: \&quot;35\&quot;,\n  \&quot;description\&quot;: \&quot;hussain\&quot;,\n  \&quot;messageCategory\&quot;: \&quot;poola\&quot;,\n  \&quot;owner\&quot;: \&quot;\&quot;,\n  \&quot;type\&quot;: \&quot;\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://localhost:9090/hogan-connector/condition-code-processing/35?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.type</defaultValue>
      <description></description>
      <id>bd9687c1-bfc8-44cb-879a-e7a6e007b208</id>
      <masked>false</masked>
      <name>type</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.owner</defaultValue>
      <description></description>
      <id>2120693d-67e3-4f93-9eaf-d8bae330e3fb</id>
      <masked>false</masked>
      <name>owner</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.application</defaultValue>
      <description></description>
      <id>a054b075-7d56-46ba-a441-e23618993cf3</id>
      <masked>false</masked>
      <name>application</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.description</defaultValue>
      <description></description>
      <id>66886bed-3cea-489b-a628-ebb2648521c1</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.messageCategory</defaultValue>
      <description></description>
      <id>aaa10c3d-b4ef-427a-b6bb-6735503154de</id>
      <masked>false</masked>
      <name>messageCategory</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
