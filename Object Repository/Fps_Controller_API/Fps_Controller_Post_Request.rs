<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Fps_Controller_Post_Request</name>
   <tag></tag>
   <elementGuidId>7bedd536-8f4c-43d7-a3b5-3f52099a0a9f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n  {\n    \&quot;application\&quot;: \&quot;string\&quot;,\n    \&quot;dblockActivity\&quot;: \&quot;string\&quot;,\n    \&quot;description\&quot;: \&quot;string\&quot;,\n    \&quot;dgAction\&quot;: \&quot;string\&quot;,\n    \&quot;displayActivity\&quot;: \&quot;string\&quot;,\n    \&quot;displayFirst\&quot;: \&quot;string\&quot;,\n    \&quot;efsaction\&quot;: \&quot;string\&quot;,\n    \&quot;efskey\&quot;: \&quot;string\&quot;,\n    \&quot;establishedNewLevel\&quot;: \&quot;string\&quot;,\n    \&quot;fpskeyApplication\&quot;: \&quot;string\&quot;,\n    \&quot;fpskeyFunction\&quot;: \&quot;string\&quot;,\n    \&quot;fpskeySequence\&quot;: \&quot;string\&quot;,\n    \&quot;function\&quot;: \&quot;string\&quot;,\n    \&quot;functionSecurityLevel\&quot;: \&quot;string\&quot;,\n    \&quot;highuseIndicator\&quot;: \&quot;string\&quot;,\n    \&quot;initActivity\&quot;: \&quot;string\&quot;,\n    \&quot;initType\&quot;: \&quot;string\&quot;,\n    \&quot;linkactivity\&quot;: \&quot;string\&quot;,\n    \&quot;owner\&quot;: \&quot;string\&quot;,\n    \&quot;screenId\&quot;: \&quot;ABC\&quot;,\n    \&quot;sequence\&quot;: \&quot;string\&quot;,\n    \&quot;statusCode\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;,\n    \&quot;userEnrollment\&quot;: \&quot;string\&quot;\n  }\n]&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/funtion-processing-system/?</restUrl>
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
