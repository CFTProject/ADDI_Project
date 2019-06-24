<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Activity_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>159aa91c-3c25-4b59-9ac0-8828af5513b8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;activityId\&quot;: \&quot;1234\&quot;,\n  \&quot;activityType\&quot;: \&quot;KHAJA\&quot;,\n  \&quot;activty\&quot;: \&quot;HUSSAIN\&quot;,\n  \&quot;count\&quot;: \&quot;string\&quot;,\n  \&quot;dataBaseAction\&quot;: \&quot;string\&quot;,\n  \&quot;databaseName\&quot;: \&quot;string\&quot;,\n  \&quot;description\&quot;: \&quot;string\&quot;,\n  \&quot;disposition\&quot;: \&quot;string\&quot;,\n  \&quot;language\&quot;: \&quot;string\&quot;,\n  \&quot;listADG\&quot;: [\n    {\n      \&quot;defaultAction\&quot;: \&quot;string\&quot;,\n      \&quot;dgId\&quot;: \&quot;string\&quot;,\n      \&quot;disposition\&quot;: \&quot;string\&quot;,\n      \&quot;useCode\&quot;: \&quot;string\&quot;\n    }\n  ],\n  \&quot;mapName\&quot;: \&quot;string\&quot;,\n  \&quot;owner\&quot;: \&quot;string\&quot;,\n  \&quot;programID\&quot;: \&quot;string\&quot;,\n  \&quot;programName\&quot;: \&quot;string\&quot;\n}&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/activity/25?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
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
