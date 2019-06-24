<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Sim_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>6f5934c7-6728-4b89-982e-aca066af3ce4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;c1\&quot;: \&quot;KHAJA\&quot;,\n  \&quot;compNo\&quot;: \&quot;1234\&quot;,\n  \&quot;description\&quot;: \&quot;string\&quot;,\n  \&quot;destination\&quot;: \&quot;string\&quot;,\n  \&quot;funcAvailable\&quot;: \&quot;string\&quot;,\n  \&quot;function\&quot;: \&quot;string\&quot;,\n  \&quot;interfaceAct\&quot;: \&quot;string\&quot;,\n  \&quot;owner\&quot;: \&quot;string\&quot;,\n  \&quot;parameterN1\&quot;: \&quot;string\&quot;,\n  \&quot;parameterN2\&quot;: \&quot;string\&quot;,\n  \&quot;type\&quot;: \&quot;string\&quot;,\n  \&quot;version\&quot;: \&quot;string\&quot;\n}&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/system-integration-module/1234?</restUrl>
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
