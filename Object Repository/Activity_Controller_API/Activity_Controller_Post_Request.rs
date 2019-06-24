<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Activity_Controller_Post_Request</name>
   <tag></tag>
   <elementGuidId>c393bfe9-1676-4930-8c5a-97a2c37d46c8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n  {\n    \&quot;activityId\&quot;: \&quot;25\&quot;,\n    \&quot;activityType\&quot;: \&quot;khaja\&quot;,\n    \&quot;activty\&quot;: \&quot;hussain\&quot;,\n    \&quot;count\&quot;: \&quot;\&quot;,\n    \&quot;dataBaseAction\&quot;: \&quot;\&quot;,\n    \&quot;databaseName\&quot;: \&quot;\&quot;,\n    \&quot;description\&quot;: \&quot;\&quot;,\n    \&quot;disposition\&quot;: \&quot;\&quot;,\n    \&quot;language\&quot;: \&quot;\&quot;,\n    \&quot;listADG\&quot;: [\n      {\n        \&quot;defaultAction\&quot;: \&quot;\&quot;,\n        \&quot;dgId\&quot;: \&quot;\&quot;,\n        \&quot;disposition\&quot;: \&quot;\&quot;,\n        \&quot;useCode\&quot;: \&quot;\&quot;\n      }\n    ],\n    \&quot;mapName\&quot;: \&quot;\&quot;,\n    \&quot;owner\&quot;: \&quot;\&quot;,\n    \&quot;programID\&quot;: \&quot;\&quot;,\n    \&quot;programName\&quot;: \&quot;\&quot;\n  }\n]&quot;,
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:9090/hogan-connector/activity/?</restUrl>
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



WS.verifyResponseStatusCode(response, 201)

assertThat(response.getStatusCode()).isEqualTo(201)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
