<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Sps_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>f69890c9-7f3d-44a5-a518-79a6328e0e58</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;bor\&quot;: {\n    \&quot;listOfActForBor\&quot;: \&quot;string\&quot;,\n    \&quot;noOfActForBor\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  },\n  \&quot;eor\&quot;: {\n    \&quot;listOfActForEor\&quot;: \&quot;string\&quot;,\n    \&quot;noOfActForEor\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  },\n  \&quot;pro\&quot;: {\n    \&quot;listOfActForPro\&quot;: \&quot;string\&quot;,\n    \&quot;noOfActForPro\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  },\n  \&quot;rpt\&quot;: {\n    \&quot;comp\&quot;: \&quot;string\&quot;,\n    \&quot;criticalRpt\&quot;: \&quot;string\&quot;,\n    \&quot;description\&quot;: \&quot;string\&quot;,\n    \&quot;dsId1\&quot;: \&quot;string\&quot;,\n    \&quot;dsId2\&quot;: \&quot;string\&quot;,\n    \&quot;owner\&quot;: \&quot;khaja\&quot;,\n    \&quot;pass\&quot;: \&quot;string\&quot;,\n    \&quot;reportId\&quot;: \&quot;345\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  }\n}&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/scheduled-processing-system/345?</restUrl>
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
