<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Map_Controller_Post_Request</name>
   <tag></tag>
   <elementGuidId>e077ca2b-d9ca-4eac-94b0-46e4a6233ac6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n  {\n    \&quot;compGroup\&quot;: \&quot;string\&quot;,\n    \&quot;defltextndattribute\&quot;: \&quot;string\&quot;,\n    \&quot;description\&quot;: \&quot;string\&quot;,\n    \&quot;device\&quot;: \&quot;string\&quot;,\n    \&quot;dgNumbers\&quot;: \&quot;string\&quot;,\n    \&quot;dynamicTxnCode\&quot;: \&quot;string\&quot;,\n    \&quot;extendedAttibute\&quot;: \&quot;string\&quot;,\n    \&quot;language\&quot;: \&quot;string\&quot;,\n    \&quot;linkname\&quot;: \&quot;string\&quot;,\n    \&quot;mapName\&quot;: \&quot;ABC\&quot;,\n    \&quot;mapType\&quot;: \&quot;string\&quot;,\n    \&quot;noOfDg\&quot;: \&quot;string\&quot;,\n    \&quot;nonPemMapIndctr\&quot;: \&quot;string\&quot;,\n    \&quot;owner\&quot;: \&quot;string\&quot;,\n    \&quot;txn\&quot;: \&quot;string\&quot;,\n    \&quot;txnAttribute\&quot;: \&quot;string\&quot;,\n    \&quot;typ\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  }\n]&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/map/?</restUrl>
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
