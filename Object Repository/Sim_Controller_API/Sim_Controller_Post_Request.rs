<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Sim_Controller_Post_Request</name>
   <tag></tag>
   <elementGuidId>397bc89b-d558-4ffa-8fe1-1e5a027e2dff</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n  {\n    \&quot;c1\&quot;: \&quot;string\&quot;,\n    \&quot;compNo\&quot;: \&quot;1234\&quot;,\n    \&quot;description\&quot;: \&quot;string\&quot;,\n    \&quot;destination\&quot;: \&quot;string\&quot;,\n    \&quot;funcAvailable\&quot;: \&quot;string\&quot;,\n    \&quot;function\&quot;: \&quot;string\&quot;,\n    \&quot;interfaceAct\&quot;: \&quot;string\&quot;,\n    \&quot;owner\&quot;: \&quot;string\&quot;,\n    \&quot;parameterN1\&quot;: \&quot;string\&quot;,\n    \&quot;parameterN2\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;,\n    \&quot;version\&quot;: \&quot;string\&quot;\n  }\n]&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/system-integration-module/?</restUrl>
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
